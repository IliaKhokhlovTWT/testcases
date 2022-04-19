package it.twt.page;

import com.codeborne.selenide.SelenideElement;
import it.twt.components.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;
import static it.twt.testData.TestDataForPreventivi.headerOfTabRichiesta;
import static it.twt.testData.TestDataForPreventivi.randomNote;


public class TabRichiesta extends ListOfProducts implements Interface {
    private SelenideElement
        formTitle = $x("//div[@class='panel-heading panel-default']"),
        tipologiaSelect = $x("//div[@class='btn-group col-md-11']").$(byText(tipologia)),
        tipoLineaSelect = $x("//div[@class='btn-group col-md-11']").$(byText(tipoLinea)),
        taglioDiBandaSelect = $x("//div[@class='btn-group col-md-11']").$(byText(taglioDiBanda)),
        taglioDiBandaFTTOSelect = $x("//div[@class='btn-group col-md-11']").$(byText(taglioDiBandaFTTO)),
        durataSelect = $x("//div[@class='btn-group col-md-11']").$(byText(durata)),
        vlanAggiuntiveSelect = $x("//div[@class='btn-group col-md-11']").$(byText(vlanAggiuntive)),
        alimentazioneSelect = $x("//div[@class='btn-group col-md-11']").$(byText(alimentazione)),
        buttonOfAggiungiPreventivo = $x("//a[@class='btn btn-primary btn-addon']").$(byText(buttonAggiungiPreventivo)),
        noteInput = $x("//div[@class='col-md-9']"),
        buttonAvanti = $x("//button[@class='btn btn-primary btn-lg ng-scope']");

    TipologiaComponent tipologiaComponent = new TipologiaComponent();
    TaglioDiBandaComponent tagliodiBandaComponent = new TaglioDiBandaComponent();
    DurataComponent durataComponent = new DurataComponent();
    BandaVoceComponent bandaVoceComponent = new BandaVoceComponent();
    VlanAggiuntiveComponent vlanAggiuntiveComponent = new VlanAggiuntiveComponent();
    RouterComponent routerComponent = new RouterComponent();
    AlimentazioneComponent alimentazioneComponent = new AlimentazioneComponent();

    public void checkHeader() {
        formTitle.shouldHave(text(headerOfTabRichiesta));
    }
    public void inputTipologia() {
        tipologiaComponent.setTipologia();
    }
    public void inputTaglioDiBanda() {
        tagliodiBandaComponent.setTaglioDiBanda();
    }
    public void inputDurata() {
        durataComponent.setDurata();
    }
    public void inputBandaVoce() {
        bandaVoceComponent.setBandaVoce();
    }
    public void inputVlabAggiuntive() {
        vlanAggiuntiveComponent.setVlanAggiuntive();
    }
    public void inputRouter() {
        routerComponent.setRouter();
    }
    public void inputAlimentazione() {
        alimentazioneComponent.setAlimentazione();
    }
    public void selectPreventivo() {
        buttonOfAggiungiPreventivo.click();
    }
    public void inputNote() {
        noteInput.setValue(randomNote);
    }
    public void clickAvanti() {
        buttonAvanti.shouldBe(visible);
        buttonAvanti.click();
    }
}
