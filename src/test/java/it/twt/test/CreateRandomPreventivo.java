package it.twt.test;

import it.twt.page.TabAnagrafica;
import it.twt.page.TabDashboard;
import it.twt.page.TabRichiesta;
import it.twt.testData.TestBase;
import org.junit.jupiter.api.Test;

public class CreateRandomPreventivo extends TestBase {
    TabAnagrafica tabAnagrafica = new TabAnagrafica();
    TabRichiesta tabRichiesta = new TabRichiesta();
    TabDashboard tabDashboard = new TabDashboard();

    @Test
    void crearePreventivo() throws NullPointerException {
        tabDashboard.openPageCircuitiProgetto();

        tabAnagrafica.checkHeader();
        tabAnagrafica.inputAnagrafica();
        tabAnagrafica.inputAdress();
        tabAnagrafica.clickAvanti();

        tabRichiesta.checkHeader();
        tabRichiesta.inputTipologia();
        tabRichiesta.settingOfProduct();
        tabRichiesta.inputDurata();
        tabRichiesta.inputBandaVoce();
        tabRichiesta.inputVlabAggiuntive();
        tabRichiesta.inputRouter();
        tabRichiesta.inputAlimentazione();
        tabRichiesta.selectPreventivo();
        tabRichiesta.inputNote();
        tabRichiesta.clickAvanti();
    }
}
