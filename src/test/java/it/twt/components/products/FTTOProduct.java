package it.twt.components.products;

import it.twt.components.Interface;

import java.util.Random;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;

public class FTTOProduct extends GeneralListOfProductsAndElements implements Interface {
    Random random = new Random();

    public void settingOfFTTO() {
        taglioDiBanda = calculationsOfTaglioDiBanda();
        taglioAltro = taglioDiBanda.equals(taglioDiBandaArray[5]);
        superTaglio = taglioAltro;
        normalTaglio = !taglioAltro && !superTaglio;

        /* Taglio di banda normale */
        taglioDiBandaFTTOArray[0] = "2 Mbps";
        taglioDiBandaFTTOArray[1] = "4 Mbps";
        taglioDiBandaFTTOArray[2] = "8 Mbps";
        taglioDiBandaFTTOArray[3] = "10 Mbps";
        taglioDiBandaFTTOArray[4] = "1 Gbps (10 MCR)";
        taglioDiBandaFTTOArray[5] = "1 Gbps (100 MCR)";

        indexOfRandomTaglioDiBanda = random.nextInt(taglioDiBandaFTTOArray.length);
        $x("//div[@class='form-group m-b-xs ng-scope']").shouldBe(visible);
        $x("//div[@class='btn-group col-md-11']").shouldBe(visible);
        $x("//div[@class='btn-group col-md-11']").find(byText(taglioDiBandaFTTOArray[indexOfRandomTaglioDiBanda])).click();
    }
}

