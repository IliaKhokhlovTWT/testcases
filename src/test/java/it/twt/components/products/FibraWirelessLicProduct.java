package it.twt.components.products;

import it.twt.components.Interface;

import java.util.Random;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;

public class FibraWirelessLicProduct extends GeneralListOfProductsAndElements implements Interface {
    Random random = new Random();

    public void settingOfWirelessLic() {
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
        taglioDiBandaWirelessAltroArray[0] = "150 Mbps";
        taglioDiBandaWirelessAltroArray[1] = "200 Mbps";
        taglioDiBandaWirelessAltroArray[2] = "250 Mbps";
        taglioDiBandaWirelessAltroArray[3] = "300 Mbps";
        taglioDiBandaWirelessAltroArray[4] = "350 Mbps";
        taglioDiBandaWirelessAltroArray[5] = "400 Mbps";
        taglioDiBandaWirelessAltroArray[6] = "450 Mbps";
        taglioDiBandaWirelessAltroArray[7] = "500 Mbps";
        taglioDiBandaWirelessAltroArray[8] = "550 Mbps";
        taglioDiBandaWirelessAltroArray[9] = "600 Mbps";
        taglioDiBandaWirelessAltroArray[10] = "650 Mbps";
        taglioDiBandaWirelessAltroArray[11] = "700 Mbps";
        taglioDiBandaWirelessAltroArray[12] = "750 Mbps";
        taglioDiBandaWirelessAltroArray[13] = "800 Mbps";
        taglioDiBandaWirelessAltroArray[14] = "850 Mbps";
        taglioDiBandaWirelessAltroArray[15] = "900 Mbps";
        taglioDiBandaWirelessAltroArray[16] = "950 Mbps";
        taglioDiBandaWirelessAltroArray[17] = "1000 Mbps";


        if (superTaglio) {
            indexOfRandomTaglioDiBanda = random.nextInt(taglioDiBandaWirelessAltroArray.length);
            $x("//div[@class='form-group m-b-xs ng-scope']").shouldBe(visible);
            $x("//div[@class='btn-group col-md-11']").shouldBe(visible);
            $x("//div[@class='btn-group col-md-11']").$(taglioDiBandaArray[6]).click();
            $x("//div[@class='popover-content']").shouldBe(visible);
            $x("//div[@class='popover-content']").find(byText(taglioDiBandaWirelessAltroArray[indexOfRandomTaglioDiBanda])).click();
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
