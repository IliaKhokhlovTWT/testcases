package it.twt.components.tabRichiesta;

import it.twt.components.Interface;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;

public class AlimentazioneComponent extends RouterComponent implements Interface {
    public void setAlimentazione() {
        indexOfRandomAlimentazione = random.nextInt(alimentazioneArray.length);
        alimentazioneArray[0] = "48 Vcc";
        alimentazioneArray[1] = "220 Vca";
        if (taglioAltro) {
            $x("//div[@class='form-group m-b-xs ng-scope']").shouldBe(visible);
            $x("//div[@class='col-md-11']").shouldBe(visible);
            $x("//div[@class='col-md-11']").$(byText(alimentazioneArray[indexOfRandomAlimentazione])).click();
        }
    }
}
