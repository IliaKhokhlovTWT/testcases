package it.twt.components;

import java.util.Random;

public class ListOfProducts implements Interface{
    Random random = new Random();

    public String[] tipologiaArray = new String[6],
            tipoLineaArray = new String[2],
            taglioDiBandaArray = new String[6],
            taglioDiBandaFTTOArray = new String[6],
            taglioDiBandaAltroFibraCondivisaArray = new String[1],
            taglioDiBandaWirelessAltroArray = new String[18],
            durataArray = new String[3],
            bandaVoceArray = new String[3],
            vlanAggiuntiveArray = new String[2],
            alimentazioneArray = new String[2];

    public String tipologia, tipoLinea, taglioDiBanda, taglioDiBandaFTTO, taglioDiBandaWireless, durata, bandaVoce, vlanAggiuntive, alimentazione, buttonAggiungiPreventivo;

    int indexOfRandomTipoLinea, indexOfRandomTaglioDiBanda, indexOfRandomTaglioDiBandaFTTO,
            indexOdRandomTaglioDiBandaFibraCondivisa, indexOfRandomTaglioDiBandaWireless, indexOfRandomDurata,
            indexOfRandomBandaVoce, indexOfRandomVlanAggiuntive, indexOfRandomAlimentazione;

    public void selectProduct() {

        /* Taglio di banda */
        taglioDiBandaArray[0] = "10 Mbps";
        taglioDiBandaArray[1] = "20 Mbps";
        taglioDiBandaArray[2] = "30 Mbps";
        taglioDiBandaArray[3] = "50 Mbps";
        taglioDiBandaArray[4] = "60 Mbps";
        taglioDiBandaArray[5] = "100 Mbps";
        taglioDiBandaArray[6] = "Altro";
        taglioDiBandaArray[7] = "200 Mbps";
        taglioDiBandaArray[8] = "300 Mbps";
        taglioDiBandaArray[9] = "400 Mbps";
        taglioDiBandaArray[10] = "500 Mbps";
        taglioDiBandaArray[11] = "600 Mbps";
        taglioDiBandaArray[12] = "700 Mbps";
        taglioDiBandaArray[13] = "800 Mbps";
        taglioDiBandaArray[14] = "900 Mbps";
        taglioDiBandaArray[15] = "1000 Mbps";
        taglioDiBandaArray[16] = "2000 Mbps";
        taglioDiBandaArray[17] = "3000 Mbps";
        taglioDiBandaArray[18] = "5000 Mbps";
        taglioDiBandaArray[19] = "10000 Mbps";
        /* Taglio di banda FTTO */
        taglioDiBandaFTTOArray[0] = "2 Mbps";
        taglioDiBandaFTTOArray[1] = "4 Mbps";
        taglioDiBandaFTTOArray[2] = "8 Mbps";
        taglioDiBandaFTTOArray[3] = "10 Mbps";
        taglioDiBandaFTTOArray[4] = "1 Gbps (10 MCR)";
        taglioDiBandaFTTOArray[5] = "1 Gbps (100 MCR)";
        /* Taglio di banda Altro Fibra Condivisa */
        taglioDiBandaAltroFibraCondivisaArray[0] = "1000 Mbps";
        /* Taglio di banda Altro Wireless */
        taglioDiBandaWirelessAltroArray[0] = "150 Mbps";
        taglioDiBandaWirelessAltroArray[1] = "200 Mbps";
        taglioDiBandaWirelessAltroArray[2] = "250 Mbps";
        taglioDiBandaWirelessAltroArray[3] = "300 Mbps";
        taglioDiBandaWirelessAltroArray[4] = "350 Mbps";
        taglioDiBandaWirelessAltroArray[5] = "400 Mbps";
        taglioDiBandaWirelessAltroArray[6] = "450 Mbps";
        taglioDiBandaWirelessAltroArray[7] = "500 Mbps";
        taglioDiBandaWirelessAltroArray[8] = "550 Mbps";
        taglioDiBandaWirelessAltroArray[9] = "600 Mbps";
        taglioDiBandaWirelessAltroArray[10] = "650 Mbps";
        taglioDiBandaWirelessAltroArray[11] = "700 Mbps";
        taglioDiBandaWirelessAltroArray[12] = "750 Mbps";
        taglioDiBandaWirelessAltroArray[13] = "800 Mbps";
        taglioDiBandaWirelessAltroArray[14] = "850 Mbps";
        taglioDiBandaWirelessAltroArray[15] = "900 Mbps";
        taglioDiBandaWirelessAltroArray[16] = "950 Mbps";
        taglioDiBandaWirelessAltroArray[17] = "1000 Mbps";
        /* Durata */
        durataArray[0] = "12";
        durataArray[1] = "24";
        durataArray[2] = "36";
        /* Banda voce */
        bandaVoceArray[0] = "Nessuna";
        bandaVoceArray[1] = "1 Mbps";
        bandaVoceArray[2] = "2 Mbps";
        /* Vlan aggiuntive */
        vlanAggiuntiveArray[0] = "Si";
        vlanAggiuntiveArray[1] = "No";
        /* Alimentazione */
        alimentazioneArray[0] = "48 Vcc";
        alimentazioneArray[1] = "220 Vca";

        /* Random */

        /* Random tipo linea */

        /* Random durata */
        indexOfRandomDurata = random.nextInt(durataArray.length);
        durata = durataArray[indexOfRandomDurata];
        /* Random banda voce */
        indexOfRandomBandaVoce = random.nextInt(bandaVoceArray.length);
        bandaVoce = bandaVoceArray[indexOfRandomBandaVoce];
        /* Random vlan aggiuntive */
        indexOfRandomVlanAggiuntive = random.nextInt(vlanAggiuntiveArray.length);
        vlanAggiuntive = vlanAggiuntiveArray[indexOfRandomVlanAggiuntive];

        buttonAggiungiPreventivo = "AGGIUNGI PREVENTIVO";
    }
}
