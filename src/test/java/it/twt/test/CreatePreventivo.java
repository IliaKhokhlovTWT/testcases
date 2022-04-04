package it.twt.test;

import it.twt.testData.TestBase;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static it.twt.testData.TestDataForPreventivi.*;

public class CreatePreventivo extends TestBase {
    @Test
    void crearePreventivo() throws IOException {
        open("http://i.khokhlov:Gfhjkm32@114.milano.twt/api/reseller/Authorization/GetMenu");
        open("http://114.milano.twt/npr/#");
        $(byText("Capito")).click();
            $x("//div[@class='aside-wrap b-r custom-scrollbar ng-scope']").shouldBe(visible);
        $x("//div[@class='aside-wrap b-r custom-scrollbar ng-scope']").find(withText("Fibra")).click();
            $x("//div[@class='navi-wrap m-t']").shouldBe(visible);
        $x("//div[@class='navi-wrap m-t']").find(withText("Circuiti a progetto")).click();
            $x("//div[@class='tab-content']").shouldBe(visible);
        $x("//div[@class='app-content-body app-content-full h-full']").shouldHave(text("RICH. PREVENTIVO"));
        $x("//div[@class='pull-right m-t-xs m-r-xs hidden-xs']").click();
            $x("//div[@class='panel']").shouldBe(visible);
        $x("//div[@class='ui-select-container ui-select-bootstrap dropdown ng-pristine ng-untouched ng-scope ng-empty ng-invalid ng-invalid-required']").click();
        $x("//input[@type='search']").setValue("Kha");
        $x("//li[@class='ui-select-choices-group']").shouldHave(text("Kha")).click();
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
        $x("//div[@class='pull-right']").find(byText("AVANTI")).click();
            $x("//div[@class='container ng-scope']").shouldBe(visible);




    }
}
