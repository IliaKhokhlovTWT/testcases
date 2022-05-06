package it.twt.page;

import com.codeborne.selenide.SelenideElement;
import it.twt.components.Interface;
import it.twt.components.products.*;
import it.twt.components.tabRichiesta.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;
import static it.twt.testData.TestDataForPreventivi.headerOfTabRichiesta;
import static it.twt.testData.TestDataForPreventivi.randomNote;


public class TabRichiesta extends GeneralListOfProductsAndElements {

    private final SelenideElement
        formTitle = $x("//div[@class='panel-heading panel-default']"),

        fibraDedicataDisabledCheck = $x("(//button[normalize-space()='Fibra dedicata'])[1]").shouldBe(disabled),
        fibraDedicataPremiumDisabledCheck = $x("(//button[normalize-space()='Fibra dedicata Premium'])[1]").shouldBe(disabled),
        fibraCondivisaDisabledCheck = $x("//button[normalize-space()='Fibra condivisa']").shouldBe(disabled),
        wirelessLicDisabledCheck = $x("//button[normalize-space()='Wireless licenziato']").shouldBe(disabled),
        wirelessNonLicDisabledCheck = $x("//button[normalize-space()='Wireless non licenziato']").shouldBe(disabled),
        FTTODisabledCheck = $x("//button[normalize-space()='FTTO']").shouldBe(disabled),

        buttonOfAggiungiPreventivo = $x("//a[@class='btn btn-primary btn-addon']"),
        noteInput = $x("//div[@class='col-md-9']"),
        buttonAvanti = $x("//button[@class='btn btn-primary btn-lg ng-scope']");

        private Boolean fibraDedicataSelected = fibraDedicataPremiumDisabledCheck.exists() && fibraCondivisaDisabledCheck.exists() &&
                wirelessLicDisabledCheck.exists() && wirelessNonLicDisabledCheck.exists() && FTTODisabledCheck.exists(),
                fibraDedicataPremiumSelected = fibraDedicataDisabledCheck.exists() && fibraCondivisaDisabledCheck.exists() &&
                wirelessLicDisabledCheck.exists() && wirelessNonLicDisabledCheck.exists() && FTTODisabledCheck.exists(),
                fibraCondivisaSelected = fibraDedicataDisabledCheck.exists() && fibraDedicataPremiumDisabledCheck.exists() &&
                wirelessLicDisabledCheck.exists() && wirelessNonLicDisabledCheck.exists() && FTTODisabledCheck.exists(),
                wirelessLicSelected = fibraDedicataDisabledCheck.exists() && fibraDedicataPremiumDisabledCheck.exists() &&
                fibraCondivisaDisabledCheck.exists() && wirelessNonLicDisabledCheck.exists() && FTTODisabledCheck.exists(),
                wirelessNonLicSelected = fibraDedicataDisabledCheck.exists() && fibraDedicataPremiumDisabledCheck.exists() &&
                fibraCondivisaDisabledCheck.exists() && wirelessLicDisabledCheck.exists() && FTTODisabledCheck.exists(),
                FTTOSelected = fibraDedicataDisabledCheck.exists() && fibraDedicataPremiumDisabledCheck.exists() &&
                fibraCondivisaDisabledCheck.exists() && wirelessLicDisabledCheck.exists() && wirelessNonLicDisabledCheck.exists();

    TipologiaComponent tipologiaComponent = new TipologiaComponent();
    FibraDedicataProduct fibraDedicataProduct = new FibraDedicataProduct();
    FibraDedicataPremiumProduct fibraDedicataPremiumProduct = new FibraDedicataPremiumProduct();
    FibraCondivisaProduct fibraCondivisaProduct = new FibraCondivisaProduct();
    FibraWirelessLicProduct fibraWirelessLicProduct = new FibraWirelessLicProduct();
    FibraWirelessNonLicProduct fibraWirelessNonLicProduct = new FibraWirelessNonLicProduct();
    FTTOProduct fttoProduct = new FTTOProduct();
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
    public void settingOfProduct() {
        if(fibraDedicataSelected) {
            fibraDedicataProduct.settingOfFibraDedicata();
        } else if(fibraDedicataPremiumSelected) {
            fibraDedicataPremiumProduct.settingOfFibraDedicataPremium();
        } else if(fibraCondivisaSelected) {
            fibraCondivisaProduct.settingOfFibraCondivisa();
        } else if(wirelessLicSelected) {
            fibraWirelessLicProduct.settingOfWirelessLic();
        } else if(wirelessNonLicSelected) {
            fibraWirelessNonLicProduct.settingOfWirelessNonLic();
        } else if(FTTOSelected) {
            fttoProduct.settingOfFTTO();
        }
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
        buttonOfAggiungiPreventivo.find(byText(buttonAggiungiPreventivo)).click();
    }
    public void inputNote() {
        noteInput.setValue(randomNote);
    }
    public void clickAvanti() {
        buttonAvanti.shouldBe(visible);
        buttonAvanti.click();
    }
}
