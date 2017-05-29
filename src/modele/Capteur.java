package modele;

import utils.EnumEtatCa;
import utils.EnumEtatP;

/**
 * Created by lloison on 29/05/2017.
 */
public class Capteur {
    private Long no_capteur;
    private EnumEtatCa etat_capteur;

    public Capteur(Long no_capteur, EnumEtatCa etat_capteur) {
        this.no_capteur = no_capteur;
        this.etat_capteur = etat_capteur;
    }

    public Long getNo_capteur() {
        return no_capteur;
    }

    public void setNo_capteur(Long no_capteur) {
        this.no_capteur = no_capteur;
    }

    public EnumEtatCa getEtat_capteur() {
        return etat_capteur;
    }

    public void setEtat_capteur(EnumEtatCa etat_capteur) {
        this.etat_capteur = etat_capteur;
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
        return "Capteur{" +
                "no_capteur=" + no_capteur +
                ", etat_capteur=" + etat_capteur +
                '}';
    }
}
