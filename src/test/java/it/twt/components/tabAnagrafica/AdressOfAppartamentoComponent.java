package it.twt.components.tabAnagrafica;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static it.twt.testData.TestDataForPreventivi.*;
import static it.twt.testData.TestDataForPreventivi.randomInterno;

public class AdressOfAppartamentoComponent {
    public void setAdressOfAppartamento() {
        $x("//input[@placeholder='Complesso']").shouldBe(visible);
        $x("//input[@placeholder='Complesso']").click();
        $x("//input[@placeholder='Complesso']").setValue(randomComplesso);
        $x("//input[@placeholder='Scala']").click();
        $x("//input[@placeholder='Scala']").setValue(randomScala);
        $x("//input[@placeholder='Piano']").click();
        $x("//input[@placeholder='Piano']").setValue(randomPiano);
        $x("//input[@placeholder='Interno']").click();
        $x("//input[@placeholder='Interno']").setValue(randomInterno);

        $(byText("Latitudine")).scrollIntoView(true);
        $x("//input[@ng-model='mapc.mapOptions.center[0]']").setValue(randomLatitudine);
        $x("//input[@ng-model='mapc.mapOptions.center[1]']").setValue(randomLongitudine);
        $x("//div[@class='container ng-scope']").shouldBe(visible);
    }
}
