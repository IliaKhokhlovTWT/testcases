package it.twt.testData;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static it.twt.testData.TestDataForPreventivi.*;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
       //Configuration.baseUrl = ("http://") + environmentPrefics + (".milano.twt/npr/#/home");
        //open(baseUrl, " ", usernameForPortal, passwordForPortal);
        Configuration.browserSize = "1900x1600";
        //sleep(5000);
    }

}
