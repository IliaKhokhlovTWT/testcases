package it.twt.components.tabRichiesta;

import it.twt.components.Interface;

import java.util.Random;

public class ListOfProducts implements Interface {
    Random random = new Random();
    public String[] taglioDiBandaArray = new String[6],
            taglioDiBandaFTTOArray = new String[6],
            taglioDiBandaAltroArray = new String[13],
            taglioDiBandaAltroFibraCondivisaArray = new String[1],
            taglioDiBandaWirelessAltroArray = new String[18],
            durataArray = new String[3],
            bandaVoceArray = new String[3],
            vlanAggiuntiveArray = new String[2],
            alimentazioneArray = new String[2];

    public String durata, bandaVoce, vlanAggiuntive, buttonAggiungiPreventivo;
    int  indexOfRandomDurata,
            indexOfRandomBandaVoce, indexOfRandomVlanAggiuntive, indexOfRandomAlimentazione;

    public void selectProduct() throws NullPointerException {
        /* Taglio di banda normale */
        taglioDiBandaArray[0] = "10 Mbps";
        taglioDiBandaArray[1] = "20 Mbps";
        taglioDiBandaArray[2] = "30 Mbps";
        taglioDiBandaArray[3] = "50 Mbps";
        taglioDiBandaArray[4] = "60 Mbps";
        taglioDiBandaArray[5] = "100 Mbps";
        taglioDiBandaArray[6] = "Altro";
        /* Taglio di banda FTTO */
        taglioDiBandaFTTOArray[0] = "2 Mbps";
        taglioDiBandaFTTOArray[1] = "4 Mbps";
        taglioDiBandaFTTOArray[2] = "8 Mbps";
        taglioDiBandaFTTOArray[3] = "10 Mbps";
        taglioDiBandaFTTOArray[4] = "1 Gbps (10 MCR)";
        taglioDiBandaFTTOArray[5] = "1 Gbps (100 MCR)";
        /* Taglio di banda Altro */
        taglioDiBandaAltroArray[0] = "200 Mbps";
        taglioDiBandaAltroArray[1] = "300 Mbps";
        taglioDiBandaAltroArray[2] = "400 Mbps";
        taglioDiBandaAltroArray[3] = "500 Mbps";
        taglioDiBandaAltroArray[4] = "600 Mbps";
        taglioDiBandaAltroArray[5] = "700 Mbps";
        taglioDiBandaAltroArray[6] = "800 Mbps";
        taglioDiBandaAltroArray[7] = "900 Mbps";
        taglioDiBandaAltroArray[8] = "1000 Mbps";
        taglioDiBandaAltroArray[9] = "2000 Mbps";
        taglioDiBandaAltroArray[10] = "3000 Mbps";
        taglioDiBandaAltroArray[11] = "5000 Mbps";
        taglioDiBandaAltroArray[12] = "10000 Mbps";
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
