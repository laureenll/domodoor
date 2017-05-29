package modele;

import utils.EnumEtatP;

public class Porte {
    private Long no_porte;
    private EnumEtatP etat_porte;

    public Porte(Long no_porte, EnumEtatP etat_porte) {
        this.no_porte = no_porte;
        this.etat_porte = etat_porte;
    }

    public Long getNo_porte() {
        return no_porte;
    }

    public void setNo_porte(Long no_porte) {
        this.no_porte = no_porte;
    }

    public EnumEtatP getEtat_porte() {
        return etat_porte;
    }

    public void setEtat_porte(EnumEtatP etat_porte) {
        this.etat_porte = etat_porte;
    }

    public void ouvre() {
        //TODO
    }

    public void ferme() {
        //TODO
    }

    public void pause() {
        //TODO
    }

    public void fermee() {
        //TODO
    }

    public void ouverte() {
        //TODO
    }

    public EnumEtatP bloque() {
        //TODO
        return null;
    }

    public void reprend(EnumEtatP etat) {
        //TODO
    }

    @Override
    public String toString() {
        return "Porte{" +
                "no_porte=" + no_porte +
                ", etat_porte=" + etat_porte +
                '}';
    }
}
