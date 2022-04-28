package it.twt.components.tabAnagrafica;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class AnagraficaComponent {
    public void setAnagrafica() {
        $x("//div[@class='panel']").shouldBe(visible);
        $x("//div[@class='ui-select-container ui-select-bootstrap dropdown ng-pristine ng-untouched ng-scope ng-empty ng-invalid ng-invalid-required']").click();
        $x("//input[@type='search']").setValue("Kha");
        $x("//li[@class='ui-select-choices-group']").shouldHave(text("Kha")).click();
    }
}
