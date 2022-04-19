package it.twt.components;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;

public class DurataComponent extends TaglioDiBandaComponent implements Interface {
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
