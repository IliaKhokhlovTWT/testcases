package it.twt.testData;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static it.twt.testData.TestDataForPreventivi.*;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        /* String mainUrlaForOpen = String.format("http://" + usernameForPortal + ":" + passwordForPortal + "@" + environmentPrefics +
                ".milano.twt/api/reseller/Authorization/GetMenu"); */
        Configuration.browserSize = "1900x1000";
        Configuration.timeout = 25000;
        Configuration.pageLoadTimeout = 25000;
        open("http://i.khokhlov:Gfhjkm43@114.milano.twt/api/reseller/Authorization/GetMenu");
        open("http://" + environmentPrefics + ".milano.twt/npr/#");
        $x("//div[@class='aside-wrap b-r custom-scrollbar ng-scope']").shouldBe(visible);
        $(byText("Capito")).scrollIntoView(true);
        $(byText("Capito")).click();

    }

}
