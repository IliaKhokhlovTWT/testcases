package it.twt.components.products;

import it.twt.components.Interface;

import java.util.Random;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;

public class FibraDedicataProduct extends GeneralListOfProductsAndElements implements Interface {
    Random random = new Random();

    public void settingOfFibraDedicata() {
        taglioDiBanda = calculationsOfTaglioDiBanda();
        taglioAltro = taglioDiBanda.equals(taglioDiBandaArray[5]);
        superTaglio = taglioAltro;
        normalTaglio = !taglioAltro && !superTaglio;

        /* Taglio di banda normale */
        taglioDiBandaArray[0] = "10 Mbps";
        taglioDiBandaArray[1] = "20 Mbps";
        taglioDiBandaArray[2] = "30 Mbps";
        taglioDiBandaArray[3] = "50 Mbps";
        taglioDiBandaArray[4] = "60 Mbps";
        taglioDiBandaArray[5] = "100 Mbps";
        taglioDiBandaArray[6] = "Altro";
        /* Taglio di banda Altro */
        taglioDiBandaAltroArray[0] = "200 Mbps";
        taglioDiBandaAltroArray[1] = "300 Mbps";
        taglioDiBandaAltroArray[2] = "400 Mbps";
        taglioDiBandaAltroArray[3] = "500 Mbps";
        taglioDiBandaAltroArray[4] = "600 Mbps";
        taglioDiBandaAltroArray[5] = "700 Mbps";
        taglioDiBandaAltroArray[6] = "800 Mbps";
        taglioDiBandaAltroArray[7] = "900 Mbps";
        taglioDiBandaAltroArray[8] = "1000 Mbps";
        taglioDiBandaAltroArray[9] = "2000 Mbps";
        taglioDiBandaAltroArray[10] = "3000 Mbps";
        taglioDiBandaAltroArray[11] = "5000 Mbps";
        taglioDiBandaAltroArray[12] = "10000 Mbps";


        if (superTaglio) {
            indexOfRandomTaglioDiBanda = random.nextInt(taglioDiBandaAltroArray.length);
            $x("//div[@class='form-group m-b-xs ng-scope']").shouldBe(visible);
            $x("//div[@class='btn-group col-md-11']").shouldBe(visible);
            $x("//div[@class='btn-group col-md-11']").$(taglioDiBandaArray[6]).click();
            $x("//div[@class='popover-content']").shouldBe(visible);
            $x("//div[@class='popover-content']").find(byText(taglioDiBandaAltroArray[indexOfRandomTaglioDiBanda])).click();
        } else if (normalTaglio) {
            int min = 0,
                    max = 5,
                    diff = max - min;
            indexOfRandomTaglioDiBanda = random.nextInt(diff + 1);
            indexOfRandomTaglioDiBanda += min;
            $x("//div[@class='form-group m-b-xs ng-scope']").shouldBe(visible);
            $x("//div[@class='btn-group col-md-11']").shouldBe(visible);
            $x("//div[@class='btn-group col-md-11']").find(byText(taglioDiBandaArray[indexOfRandomTaglioDiBanda])).click();
        }
    }
}
