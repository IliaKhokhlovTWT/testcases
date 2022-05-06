package it.twt.components.tabRichiesta;

import it.twt.components.Interface;
import it.twt.components.products.GeneralListOfProductsAndElements;

import java.util.Random;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;

public class TipologiaComponent extends GeneralListOfProductsAndElements {

    Random random = new Random();

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
    }
}
