package controleur.impl;

import controleur.IPorteControleur;
import modele.Capteur;
import modele.Porte;
import utils.EnumEtatCo;

public class PorteControleur implements IPorteControleur{
    private Porte porte;
    private EnumEtatCo etat_controleur;

    public PorteControleur(Porte porte) {
        this.etat_controleur = EnumEtatCo.PORTEFERMEE;
        this.porte = porte;
    }

    public void enregistreContact(Capteur capteur) {

    }

    public void ouvre() {
        porte.ferme();
        this.etat_controleur = EnumEtatCo.ENOUVERTURE;
    }

    public void ferme() {
        porte.ferme();
        this.etat_controleur = EnumEtatCo.ENFERMETURE;
    }

    public EnumEtatCo urgence() {
        porte.bloque();
        this.etat_controleur = EnumEtatCo.URGENCE;
        return EnumEtatCo.URGENCE;
    }

    // appelé par capteur
    public boolean contact(Capteur capteur) {
        return true;
    }

    public void repriseCle() {

    }
}
