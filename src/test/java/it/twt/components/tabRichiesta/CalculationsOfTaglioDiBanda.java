package it.twt.components.tabRichiesta;


import it.twt.components.Interface;

import java.util.Random;

import static it.twt.components.products.GeneralListOfProductsAndElements.taglioDiBandaArray;

public class CalculationsOfTaglioDiBanda {
    Random random = new Random();
    String taglioDiBanda;

    protected String calculationsOfTaglioDiBanda() {
        taglioDiBandaArray[0] = "10 Mbps";
        taglioDiBandaArray[1] = "20 Mbps";
        taglioDiBandaArray[2] = "30 Mbps";
        taglioDiBandaArray[3] = "50 Mbps";
        taglioDiBandaArray[4] = "60 Mbps";
        taglioDiBandaArray[5] = "100 Mbps";
        taglioDiBandaArray[6] = "Altro";

        taglioDiBanda = taglioDiBandaArray[random.nextInt(taglioDiBandaArray.length)];
        return taglioDiBanda;
    }

}
