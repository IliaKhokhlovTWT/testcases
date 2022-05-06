package it.twt.components.products;

import it.twt.components.Interface;

import java.util.Random;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;

public class FibraCondivisaProduct extends GeneralListOfProductsAndElements implements Interface {
    Random random = new Random();

    public void settingOfFibraCondivisa() {
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
        taglioDiBandaAltroFibraCondivisaArray[0] = "1000 Mbps";

        if (superTaglio) {
            $x("//div[@class='form-group m-b-xs ng-scope']").shouldBe(visible);
            $x("//div[@class='btn-group col-md-11']").shouldBe(visible);
            $x("//div[@class='btn-group col-md-11']").$(taglioDiBandaArray[6]).click();
            $x("//div[@class='popover-content']").shouldBe(visible);
            $x("//div[@class='popover-content']").find(byText(taglioDiBandaArray[0])).click();
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
