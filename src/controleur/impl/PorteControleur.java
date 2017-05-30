package controleur.impl;

import controleur.IPorteControleur;
import modele.Capteur;
import modele.Porte;
import utils.EnumEtatCo;
import utils.EnumEtatP;

public class PorteControleur implements IPorteControleur{
    private Porte porte;
    private EnumEtatCo etat_controleur;
    private EnumEtatCo etat_controleur_urgence;

    public PorteControleur(Porte porte) {
        this.etat_controleur = EnumEtatCo.PORTEFERMEE;
        this.porte = porte;
    }

    public void enregistreContact(Capteur capteur) {

    }

    public void ouvre() {
        porte.ferme();
        etat_controleur = EnumEtatCo.ENOUVERTURE;
    }

    public void ferme() {
        porte.ferme();
        etat_controleur = EnumEtatCo.ENFERMETURE;
    }

    public EnumEtatCo urgence() {
        porte.bloque();
        etat_controleur_urgence = etat_controleur;
        etat_controleur = EnumEtatCo.URGENCE;
        return EnumEtatCo.URGENCE;
    }

    // appelé par capteur
    public boolean contact(Capteur capteur) {
        return true;
    }

    public void repriseCle() {
        porte.reprend();
        etat_controleur = etat_controleur_urgence;
    }
}
