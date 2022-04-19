package it.twt.components;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;

public class RouterComponent extends VlanAggiuntiveComponent implements Interface {
    public void setRouter() {
        String router = "Nessun router";

        $x("//div[@class='form-group m-b-xs ng-scope']").shouldBe(visible);
        $x("//div[@class='col-md-10']").shouldBe(visible);
        $x("//div[@class='col-md-10']").$(byText(router)).click();
    }
}
