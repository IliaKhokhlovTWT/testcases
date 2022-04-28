package it.twt.components.tabRichiesta;

import it.twt.components.Interface;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;

public class BandaVoceComponent extends DurataComponent implements Interface {
    public void setBandaVoce() {
        indexOfRandomBandaVoce = random.nextInt(bandaVoceArray.length);
        bandaVoceArray[0] = "Nessuna";
        bandaVoceArray[1] = "1 Mbps";
        bandaVoceArray[2] = "2 Mbps";

        $x("//div[@class='form-group m-b-xs ng-scope']").shouldBe(visible);
        $x("//div[@class='col-md-10']").shouldBe(visible);
        $x("//div[@class='btn-group col-md-11']").$(byText(bandaVoceArray[indexOfRandomBandaVoce])).click();
    }
}
