package it.twt.components;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;

public class VlanAggiuntiveComponent extends BandaVoceComponent implements Interface {
    public void setVlanAggiuntive() {
        indexOfRandomVlanAggiuntive = random.nextInt(vlanAggiuntiveArray.length);
        vlanAggiuntiveArray[0] = "Si";
        vlanAggiuntiveArray[1] = "No";

        $x("//div[@class='form-group m-b-xs ng-scope']").shouldBe(visible);
        $x("//div[@class='col-md-10']").shouldBe(visible);
        $x("//div[@class='btn-group col-md-11']").$(byText(vlanAggiuntiveArray[indexOfRandomVlanAggiuntive])).click();
    }
}
