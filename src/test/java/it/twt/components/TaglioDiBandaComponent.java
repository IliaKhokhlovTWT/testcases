package it.twt.components;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;

public class TaglioDiBandaComponent extends TipologiaComponent implements Interface {
    Boolean taglioAltro, superTaglio, noSuperTaglio;

    public void setTaglioDiBanda() {

        /* Booleans for taglio di banda */
        taglioAltro = taglioDiBanda.equals(taglioDiBandaArray[6]);
        superTaglio = taglioAltro;
        noSuperTaglio = !taglioAltro && !superTaglio;


        if (noSuperTaglio && (fibraDedicata || fibraDedicataPremium || fibraCondivisa || wirelessLicenziato || wirelessNonLicenziato)) {
            int min = 0,
                    max = 5,
                    diff = max - min;
            indexOfRandomTaglioDiBanda = random.nextInt(diff + 1);
            indexOfRandomTaglioDiBanda += min;
            $x("//div[@class='form-group m-b-xs ng-scope']").shouldBe(visible);
            $x("//div[@class='btn-group col-md-11']").shouldBe(visible);
            $x("//div[@class='btn-group col-md-11']").find(byText(taglioDiBandaArray[indexOfRandomTaglioDiBanda])).click();
        } else if (noSuperTaglio && ftto) {
            indexOfRandomTaglioDiBandaFTTO = random.nextInt(taglioDiBandaFTTOArray.length);
            $x("//div[@class='form-group m-b-xs ng-scope']").shouldBe(visible);
            $x("//div[@class='btn-group col-md-11']").shouldBe(visible);
            $x("//div[@class='btn-group col-md-11']").find(byText(taglioDiBandaFTTOArray[indexOfRandomTaglioDiBandaFTTO])).click();
        } else if (superTaglio && (fibraDedicata || fibraDedicataPremium)) {
            int min = 7,
                    max = 19,
                    diff = max - min;
            indexOfRandomTaglioDiBanda = random.nextInt(diff + 1);
            indexOfRandomTaglioDiBanda += min;
            $x("//div[@class='form-group m-b-xs ng-scope']").shouldBe(visible);
            $x("//div[@class='btn-group col-md-11']").shouldBe(visible);
            $x("//div[@class='btn-group col-md-11']").$(taglioDiBandaArray[6]).click();
            $x("//div[@class='popover-content']").shouldBe(visible);
            $x("//div[@class='popover-content']").find(byText(taglioDiBandaArray[indexOfRandomTaglioDiBanda])).click();
        } else if ((superTaglio || noSuperTaglio) && ftto) {
            indexOfRandomTaglioDiBandaFTTO = random.nextInt(taglioDiBandaFTTOArray.length);
            $x("//div[@class='form-group m-b-xs ng-scope']").shouldBe(visible);
            $x("//div[@class='popover-content']").shouldBe(visible);
            $x("//div[@class='popover-content']").find(byText(taglioDiBandaFTTOArray[indexOfRandomTaglioDiBandaFTTO])).click();
        } else if (superTaglio && fibraCondivisa) {
            indexOdRandomTaglioDiBandaFibraCondivisa = random.nextInt(taglioDiBandaAltroFibraCondivisaArray.length);
            $x("//div[@class='form-group m-b-xs ng-scope']").shouldBe(visible);
            $x("//div[@class='popover-content']").shouldBe(visible);
            $x("//div[@class='popover-content']").find(byText(taglioDiBandaAltroFibraCondivisaArray[indexOdRandomTaglioDiBandaFibraCondivisa])).click();
        } else if (superTaglio && (wirelessLicenziato || wirelessNonLicenziato)) {
            indexOfRandomTaglioDiBandaWireless = random.nextInt(taglioDiBandaWirelessAltroArray.length);
            $x("//div[@class='form-group m-b-xs ng-scope']").shouldBe(visible);
            $x("//div[@class='popover-content']").shouldBe(visible);
            $x("//div[@class='popover-content']").find(byText(taglioDiBandaWirelessAltroArray[indexOfRandomTaglioDiBandaWireless])).click();
        }
    }
}
