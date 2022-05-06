package it.twt.components.products;

import it.twt.components.Interface;
import it.twt.components.tabRichiesta.CalculationsOfTaglioDiBanda;

import java.util.Random;

public class GeneralListOfProductsAndElements extends CalculationsOfTaglioDiBanda implements Interface {
    static Random random = new Random();
    public String[] tipologiaArray = new String[6];
    public String[] tipoLineaArray = new String[2];
    public static String[] taglioDiBandaArray = new String[6];
    public String[] taglioDiBandaFTTOArray = new String[6];
    public String[] taglioDiBandaAltroArray = new String[13];
    public String[] taglioDiBandaAltroFibraCondivisaArray = new String[1];
    public String[] taglioDiBandaWirelessAltroArray = new String[18];
    public String[] taglioDiBandaAlimantazioneArray = new String[18];
    public String[] durataArray = new String[3];
    public String[] bandaVoceArray = new String[3];
    public String[] vlanAggiuntiveArray = new String[2];
    public String[] alimentazioneArray = new String[2];

    public String tipologia;
    public String tipoLinea;
    public static String taglioDiBanda;
    public String buttonAggiungiPreventivo;
    public int indexOfRandomTipologia, indexOfRandomDurata,
            indexOfRandomTipoLinea, indexOfRandomTaglioDiBanda,
            indexOfRandomBandaVoce, indexOfRandomVlanAggiuntive,
            indexOfRandomAlimentazione;

    public Boolean taglioAltro, superTaglio, normalTaglio, taglioAltroForAllimentazioe;

}
