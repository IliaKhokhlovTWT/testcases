package it.twt.page;

import com.codeborne.selenide.SelenideElement;
import it.twt.components.tabAnagrafica.AdressOfAppartamentoComponent;
import it.twt.components.tabAnagrafica.AnagraficaComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;
import static it.twt.testData.TestDataForPreventivi.headerOfTabAnagrafica;

public class TabAnagrafica {
    AnagraficaComponent anagraficaComponent = new AnagraficaComponent();
    AdressOfAppartamentoComponent adressOfAppartamentoComponent = new AdressOfAppartamentoComponent();

    private SelenideElement formTitle = $x("//div[@class='panel-heading panel-default']"),
            buttonAvanti = $x("//div[@class='pull-right']");

    public void checkHeader() {
        formTitle.shouldHave(text(headerOfTabAnagrafica));
    }

    public void inputAnagrafica() {
        anagraficaComponent.setAnagrafica();
    }

    public void inputAdress() {
        adressOfAppartamentoComponent.setAdressOfAppartamento();
    }

    public void clickAvanti() {
        buttonAvanti.shouldBe(visible);
        buttonAvanti.find(byText("AVANTI")).click();
    }
}
