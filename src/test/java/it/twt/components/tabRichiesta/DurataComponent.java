package it.twt.components.tabRichiesta;

import it.twt.components.Interface;
import it.twt.components.products.GeneralListOfProductsAndElements;

import java.util.Random;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;

public class DurataComponent extends GeneralListOfProductsAndElements {
    Random random = new Random();
    public void setDurata() {
        durataArray[0] = "12";
        durataArray[1] = "24";
        durataArray[2] = "36";
        indexOfRandomDurata = random.nextInt(durataArray.length);

        $x("//div[@class='form-group m-b-xs ng-scope']").shouldBe(visible);
        $x("//div[@class='col-md-10']").shouldBe(visible);
        $x("//div[@class='btn-group col-md-11']").$(byText(durataArray[indexOfRandomDurata])).click();
    }
}
