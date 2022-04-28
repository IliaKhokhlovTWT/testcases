package it.twt.components.tabRichiesta;

import it.twt.components.Interface;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;

public class TipologiaComponent extends ListOfProducts implements Interface {
    String[] tipologiaArray = new String[6], tipoLineaArray = new String[2];
    Boolean fibraDedicata, fibraDedicataPremium, fibraCondivisa, wirelessLicenziato, wirelessNonLicenziato, ftto;
    String tipologia, tipoLinea;
    int indexOfRandomTipologia, indexOfRandomTipoLinea, indexOfRandomTaglioDiBanda;

    public void setTipologia() {
        /* Array of products */
        tipologiaArray[0] = "Fibra dedicata";
        tipologiaArray[1] = "Fibra dedicata Premium";
        tipologiaArray[2] = "Fibra condivisa";
        tipologiaArray[3] = "Wireless licenziato";
        tipologiaArray[4] = "Wireless non licenziato";
        tipologiaArray[5] = "FTTO";
        /* Tipo linea */
        tipoLineaArray[0] = "Linea a doppio link e singolo apparato";
        tipoLineaArray[1] = "Linea a doppio link e doppio apparato";

        /* Random tipologia */
        indexOfRandomTipologia = random.nextInt(tipologiaArray.length);
        tipologia = tipologiaArray[indexOfRandomTipologia];
        /* Set tipologia */
        $x("//select-buttons[@model='$ctrl.model.Tipologia']//div[@class='btn-group col-md-11']").shouldBe(visible);
        $x("//select-buttons[@model='$ctrl.model.Tipologia']//div[@class='btn-group col-md-11']").find(byText(tipologia)).click();

        /* Booleans */
        fibraDedicata = tipologia.equals(tipologiaArray[0]);
        fibraDedicataPremium = tipologia.equals(tipologiaArray[1]);
        fibraCondivisa = tipologia.equals(tipologiaArray[2]);
        wirelessLicenziato = tipologia.equals(tipologiaArray[3]);
        wirelessNonLicenziato = tipologia.equals(tipologiaArray[4]);
        ftto = tipologia.equals(tipologiaArray[5]);


         if (fibraDedicataPremium) {
            indexOfRandomTipoLinea = random.nextInt(tipoLineaArray.length);
            tipoLinea = tipoLineaArray[indexOfRandomTipoLinea];
            $x("//div@[class='form-group m-b-xs ng-scope']").shouldBe(visible);
            $x("//div[@class='btn-group col-md-11']").shouldBe(visible);
            $x("//div@[class='form-group m-b-xs ng-scope']").find(byText(tipoLineaArray[indexOfRandomTipologia])).click();
        }
    }
}
