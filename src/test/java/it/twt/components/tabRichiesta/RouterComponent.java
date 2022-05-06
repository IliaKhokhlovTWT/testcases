package it.twt.components.tabRichiesta;

import it.twt.components.Interface;
import it.twt.components.products.GeneralListOfProductsAndElements;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;

public class RouterComponent extends GeneralListOfProductsAndElements {
    public void setRouter() {
        String router = "Nessun router";

        $x("//div[@class='form-group m-b-xs ng-scope']").shouldBe(visible);
        $x("//div[@class='col-md-10']").shouldBe(visible);
        $x("//div[@class='col-md-10']").$(byText(router)).click();
    }
}
