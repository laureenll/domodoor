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


    @Override
    public String toString() {
        return "Porte{" +
                "no_porte=" + no_porte +
                ", etat_porte=" + etat_porte +
                '}';
    }
}
