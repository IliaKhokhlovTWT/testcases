package it.twt.components;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;
import static org.apache.commons.lang.math.RandomUtils.nextInt;

import java.util.ArrayList;
import java.util.Random;

public class ListOfProducts {
    public void selectProduct() {
        //Array of products
        String[] productsArray = new String[6];
        productsArray[0] = "Fibra dedicata";
        productsArray[1] = "Fibra dedicata Premium";
        productsArray[2] = "Fibra condivisa";
        productsArray[3] = "Wireless licenziato";
        productsArray[4] = "Wireless non licenziato";
        productsArray[5] = "FTTO";
        //SLA
        String[] slaArray = new String[2];
        slaArray[0] = "Base";
        slaArray[1] = "Premium";
        //Taglio di banda
        String[] taglioDiBandaArray = new String[6];
        taglioDiBandaArray[0] = "10 Mbps";
        taglioDiBandaArray[1] = "20 Mbps";
        taglioDiBandaArray[2] = "30 Mbps";
        taglioDiBandaArray[3] = "50 Mbps";
        taglioDiBandaArray[4] = "60 Mbps";
        taglioDiBandaArray[5] = "100 Mbps";
        taglioDiBandaArray[6] = "Altro";
        taglioDiBandaArray[7] = "200 Mbps";
        taglioDiBandaArray[8] = "300 Mbps";
        taglioDiBandaArray[9] = "400 Mbps";
        taglioDiBandaArray[10] = "500 Mbps";
        taglioDiBandaArray[11] = "600 Mbps";
        taglioDiBandaArray[12] = "700 Mbps";
        taglioDiBandaArray[13] = "800 Mbps";
        taglioDiBandaArray[14] = "900 Mbps";
        taglioDiBandaArray[15] = "1000 Mbps";
        taglioDiBandaArray[16] = "2000 Mbps";
        taglioDiBandaArray[17] = "3000 Mbps";
        taglioDiBandaArray[18] = "5000 Mbps";
        taglioDiBandaArray[19] = "10000 Mbps";

        ArrayList taglioSuper = new ArrayList<>();
        for (int i = 6; i < 20; i++) {
            taglioSuper.add(i);
        }

        //Durata
        String[] durataArray = new String[3];
        durataArray[0] = "12";
        durataArray[1] = "24";
        durataArray[2] = "36";
        //Banda voce
        String[] bandaVoceArray = new String[3];
        bandaVoceArray[0] = "Nessuna";
        bandaVoceArray[1] = "1 Mbps";
        bandaVoceArray[2] = "2 Mbps";
        //Vlan aggiuntive
        String[] vlanArray = new String[2];
        vlanArray[0] = "Si";
        vlanArray[1] = "No";
        //Router
        String router = "Nessun router";
        //Alimentazione
        String[] alimentazioneArray = new String[2];
        alimentazioneArray[0] = "48 Vcc";
        alimentazioneArray[1] = "220 Vca";

        //Random product
        Random random = new Random();
        int indexOfRandomProduct = random.nextInt(productsArray.length);
        String product = productsArray[indexOfRandomProduct];
        $x("//div[@class='btn-group col-md-11']").$(byText(product)).click();

        if(productsArray[0] == product) {
            int indexOfRandomTaglioDiBanda = random.nextInt(taglioDiBandaArray.length);
                if(indexOfRandomTaglioDiBanda == 6) {
                    $x("//div[@class='btn-group col-md-11']").$(byText(taglioDiBandaArray[6])).click();
                    $x("//div[@class='popover-content']").shouldBe(visible);

                }
            int indexOfRandomDurata = random.nextInt(durataArray.length);
            int indexOfRandomBandaVoce = random.nextInt(bandaVoceArray.length);
            int indexOfVlanAggiuntive = random.nextInt(vlanArray.length);

        }
    }
}
