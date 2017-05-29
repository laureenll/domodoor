package modele;

import utils.EnumEtatM;

/**
 * Created by lloison on 29/05/2017.
 */
public class Moteur {
    Long no_moteur;
    EnumEtatM etat_moteur;

    public Long getNo_moteur() {
        return no_moteur;
    }

    public void setNo_moteur(Long no_moteur) {
        this.no_moteur = no_moteur;
    }

    public EnumEtatM getEtat_moteur() {
        return etat_moteur;
    }

    public void setEtat_moteur(EnumEtatM etat_moteur) {
        this.etat_moteur = etat_moteur;
    }

    @Override
    public String toString() {
        return "Moteur{" +
                "no_moteur=" + no_moteur +
                ", etat_moteur=" + etat_moteur +
                '}';
    }
}
