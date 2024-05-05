package br.unipar.jogo;

public class Mapa {
    private Tripulante tripulante;
    private Impostor impostor;

    private String mapa_The_Skeld;
    private String mapa_Mira_HQ;
    private String mapa_Polus;
    private String mapa_The_Airship;

    public Tripulante getTripulante() {
        return tripulante;
    }

    public void setTripulante(Tripulante tripulante) {
        this.tripulante = tripulante;
    }

    public Impostor getImpostor() {
        return impostor;
    }

    public void setImpostor(Impostor impostor) {
        this.impostor = impostor;
    }

    public String getMapa_The_Skeld() {
        return mapa_The_Skeld;
    }

    public void setMapa_The_Skeld(String mapa_The_Skeld) {
        this.mapa_The_Skeld = mapa_The_Skeld;
    }

    public String getMapa_Mira_HQ() {
        return mapa_Mira_HQ;
    }

    public void setMapa_Mira_HQ(String mapa_Mira_HQ) {
        this.mapa_Mira_HQ = mapa_Mira_HQ;
    }

    public String getMapa_Polus() {
        return mapa_Polus;
    }

    public void setMapa_Polus(String mapa_Polus) {
        this.mapa_Polus = mapa_Polus;
    }

    public String getMapa_The_Airship() {
        return mapa_The_Airship;
    }

    public void setMapa_The_Airship(String mapa_The_Airship) {
        this.mapa_The_Airship = mapa_The_Airship;
    }
}
