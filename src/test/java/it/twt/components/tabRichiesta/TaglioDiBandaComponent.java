package it.twt.components.tabRichiesta;

import it.twt.components.Interface;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;

public class TaglioDiBandaComponent extends TipologiaComponent implements Interface {

    Boolean taglioAltro, superTaglio, normalTaglio;
    String taglioDiBanda;
    int indexOfRandomTaglioDiBanda, indexOfRandomTaglioDiBandaFTTO,
            indexOdRandomTaglioDiBandaFibraCondivisa, indexOfRandomTaglioDiBandaWireless;

    public void setRandomIndexOfTaglioDiBanda(int index) {
        if (fibraDedicata || fibraDedicataPremium) {
            indexOfRandomTaglioDiBanda = random.nextInt(taglioDiBandaArray.length);
            taglioDiBanda = taglioDiBandaArray[indexOfRandomTaglioDiBanda];
            if (indexOfRandomBandaVoce == 5) {
                indexOfRandomTaglioDiBanda = random.nextInt(taglioDiBandaArray.length);
                taglioDiBanda = taglioDiBandaArray[indexOfRandomTaglioDiBanda];
            } else if (indexOfRandomBandaVoce > 5) {
                indexOfRandomTaglioDiBanda = random.nextInt(taglioDiBandaAltroArray.length);
                taglioDiBanda = taglioDiBandaArray[indexOfRandomTaglioDiBanda];
            }
        } else if (fibraCondivisa) {
            indexOfRandomTaglioDiBanda = random.nextInt(taglioDiBandaArray.length);
            taglioDiBanda = taglioDiBandaArray[indexOfRandomTaglioDiBanda];
            if (indexOfRandomTaglioDiBanda == 5) {
                taglioDiBanda = taglioDiBandaAltroFibraCondivisaArray[0];
            } else if (indexOfRandomTaglioDiBanda > 5) ;
        }
    }
        public  void setTaglioDiBanda () {
            /* Taglio di banda normale */
            taglioDiBandaArray[0] = "10 Mbps";
            taglioDiBandaArray[1] = "20 Mbps";
            taglioDiBandaArray[2] = "30 Mbps";
            taglioDiBandaArray[3] = "50 Mbps";
            taglioDiBandaArray[4] = "60 Mbps";
            taglioDiBandaArray[5] = "100 Mbps";
            taglioDiBandaArray[6] = "Altro";
            /* Taglio di banda FTTO */
            taglioDiBandaFTTOArray[0] = "2 Mbps";
            taglioDiBandaFTTOArray[1] = "4 Mbps";
            taglioDiBandaFTTOArray[2] = "8 Mbps";
            taglioDiBandaFTTOArray[3] = "10 Mbps";
            taglioDiBandaFTTOArray[4] = "1 Gbps (10 MCR)";
            taglioDiBandaFTTOArray[5] = "1 Gbps (100 MCR)";
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
            /* Taglio di banda Altro Fibra Condivisa */
            taglioDiBandaAltroFibraCondivisaArray[0] = "1000 Mbps";
            /* Taglio di banda Altro Wireless */
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

            /* Booleans for taglio di banda */
            taglioAltro = taglioDiBanda.equals(taglioDiBandaArray[6]);
            superTaglio = taglioAltro;
            normalTaglio = !taglioAltro && !superTaglio;


            if (normalTaglio && (fibraDedicata || fibraDedicataPremium || fibraCondivisa || wirelessLicenziato || wirelessNonLicenziato)) {
                int min = 0,
                        max = 5,
                        diff = max - min;
                indexOfRandomTaglioDiBanda = random.nextInt(diff + 1);
                indexOfRandomTaglioDiBanda += min;
                $x("//div[@class='form-group m-b-xs ng-scope']").shouldBe(visible);
                $x("//div[@class='btn-group col-md-11']").shouldBe(visible);
                $x("//div[@class='btn-group col-md-11']").find(byText(taglioDiBandaArray[indexOfRandomTaglioDiBanda])).click();
            } else if (normalTaglio && ftto) {
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
            } else if ((superTaglio || normalTaglio) && ftto) {
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

