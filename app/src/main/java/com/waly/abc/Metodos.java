package com.waly.abc;

public class Metodos {
    String[] ssdmm = new String[14];
    String[] ssdv = new String[14];
    String[] ssdp = new String[14];
    int [] ssdimg = new int[14];
    String [] ssdo = new String[14];

    public String [] SSDMayMin(){
        ssdmm [1] = "M";
        ssdmm [2] = "m";
        ssdmm [3] = "P";
        ssdmm [4] = "p";
        return ssdmm;
    }
    public String[] SSDirecta(){
        ssdv [1] = "ma";
        ssdv [2] = "me";
        ssdv [3] = "mi";
        ssdv [4] = "mo";
        ssdv [5] = "mu";

        ssdv [6] = "pa";
        ssdv [7] = "pe";
        ssdv [8] = "pi";
        ssdv [9] = "po";
        ssdv [10] = "pu";
        return ssdv;
    }
    public String[] SSDPalabra(){
        ssdp[1] = "mamá";
        ssdp[2] = "mesa";
        ssdp[3] = "minero";
        ssdp[4] = "moto";
        ssdp[5] = "muro";
        ssdp[6] = "papá";
        ssdp[7] = "pera";
        ssdp[8] = "pipa";
        ssdp[9] = "pozo";
        ssdp [10] = "puerto";
        return ssdp;
    }
    public int[] SSDImg(){
        ssdimg[1] = R.drawable.mama;
        ssdimg[2] = R.drawable.mesa;
        ssdimg[3] = R.drawable.minero;
        ssdimg[4] = R.drawable.moto;
        ssdimg[5] = R.drawable.muro;
        return ssdimg;
    }
    public String[] SSDOracion(){
        ssdo[1] = "mi mamá me ama";
        ssdo[2] = "mi papá fuma pipa";
        return ssdo;
    }

}
