package it.twt.components.tabRichiesta;

import it.twt.components.Interface;
import it.twt.components.products.GeneralListOfProductsAndElements;

import java.util.Random;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;

public class VlanAggiuntiveComponent extends GeneralListOfProductsAndElements {
    Random random = new Random();
    public void setVlanAggiuntive() {
        indexOfRandomVlanAggiuntive = random.nextInt(vlanAggiuntiveArray.length);
        vlanAggiuntiveArray[0] = "Si";
        vlanAggiuntiveArray[1] = "No";

        $x("//div[@class='form-group m-b-xs ng-scope']").shouldBe(visible);
        $x("//div[@class='col-md-10']").shouldBe(visible);
        $x("//div[@class='btn-group col-md-11']").$(byText(vlanAggiuntiveArray[indexOfRandomVlanAggiuntive])).click();
    }
}
