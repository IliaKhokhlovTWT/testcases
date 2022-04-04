package it.twt.testData;
import com.github.javafaker.Faker;

public class TestDataForPreventivi {
    static Faker faker = new Faker();
    public static String
            environmentPrefics = "114",
            circuitiProgettoDashboardUrl = "http://114.milano.twt/api/reseller/Authorization/GetMenu",
            urlCRM = "http://staging-web.oryx.milano.twt/workspace#/my",
            urlGOReportOfferte = "http://main.milano.twt/go/Report_OfferteCRM.aspx",

            usernameForPortal = "i.khokhlov:",
            passwordForPortal = "Gfhjkm32",
            usernameForCRM = "test",
            passwordForCRM = "123",
            usernameForGO = "twtmilano\\i.khokhlov",
            passwordForGO = "Gfhjkm32",

            randomComplesso = faker.number().numberBetween(1, 999) + "",
            randomScala = faker.number().numberBetween(1, 99) + "",
            randomPiano = faker.number().numberBetween(1, 99) + "",
            randomInterno = faker.number().numberBetween(1, 999) + "",
            randomLatitudine = faker.address().latitude(),
            randomLongitudine = faker.address().longitude(),

            randomFirstname = faker.name().firstName(),
            randomLastname = faker.name().lastName(),
            telephoneNumber = "0000000000",
            cellularNumber = "3333333333",
            randomEmail = faker.internet().emailAddress(),
            randomNote = faker.random().toString();
}
