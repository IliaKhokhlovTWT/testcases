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

            headerOfTabAnagrafica = "Selezionare l'intestatario per cui inviare la richiesta di preventivo.",
            headerOfTabRichiesta = "Richiesta preventivo per Circuiti a progetto.",
            headerOfTabConfigurazione = "Configurazione degli indirizzi IP.",
            headerOfTabRiepilogo = "Riepilogo",

            randomComplesso = faker.number().numberBetween(1, 999) + "",
            randomNumberForAltro = faker.number().numberBetween(7, 19) + "",
            randomScala = faker.number().numberBetween(1, 99) + "",
            randomPiano = faker.number().numberBetween(1, 99) + "",
            randomInterno = faker.number().numberBetween(1, 999) + "",
            randomLatitudine = faker.address().latitude(),
            randomLongitudine = faker.address().longitude(),

            randomFirstname = faker.name().firstName(),
            randomLastname = faker.name().lastName(),
            telephoneNumber = "0000000000",
            cellularNumber = "3333333333",
            slaBase = "Base",
            slaPremium = "Premium",
            router = "Nessun router",
            randomEmail = faker.internet().emailAddress(),
            randomNote = faker.random().toString();
}
