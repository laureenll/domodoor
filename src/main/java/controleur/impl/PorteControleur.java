package controleur.impl;

import controleur.IPorteControleur;
import modele.Capteur;
import utils.EnumEtatCo;

public class PorteControleur implements IPorteControleur{
    public void enregistreContact(Capteur capteur) {

    }

    public void ouvre() {

    }

    public void ferme() {

    }

    public EnumEtatCo urgence() {
        return EnumEtatCo.URGENCE;
    }

    public boolean contact(Capteur capteur) {
        return true;
    }

    public void repriseCle() {

    }
}
