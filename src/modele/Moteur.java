package modele;

import utils.EnumEtatM;

public class Moteur {
    private long no_moteur;
    private EnumEtatM etat_moteur;

    /**
     * Constructeur de la classe moteur
     * @param no_moteur
     * @param etat_moteur
     */
    public Moteur(Long no_moteur, EnumEtatM etat_moteur) {
        this.no_moteur = no_moteur;
        this.etat_moteur = etat_moteur;
    }

    /**
     * Récupère le numéro du moteur
     * @return
     */
    public long getNo_moteur() {
        return no_moteur;
    }

    /**
     * Affecte un numéro au moteur
     * @param no_moteur
     */
    public void setNo_moteur(long no_moteur) {
        this.no_moteur = no_moteur;
    }

    /**
     * Récupère l'état du moteur
     * @return
     */
    public EnumEtatM getEtat_moteur() {
        return etat_moteur;
    }

    /**
     * Affecte un état au moteur
     * @param etat_moteur
     */
    public void setEtat_moteur(EnumEtatM etat_moteur) {
        this.etat_moteur = etat_moteur;
    }

    /**
     * Le moteur tire la porte pour l'ouvrir
     */
    public void tirer() {
        this.etat_moteur = EnumEtatM.ENTIREE;
    }

    /**
     * Le moteur pousse la porte pour la fermer
     */
    public void pousser() {
        this.etat_moteur = EnumEtatM.ENPOUSSEE;
    }

    /**
     * Le moteur appel la fonction d'arrêt
     */
    public void stop() {
        arreter();
    }

    /**
     * Arret du moteur
     */
    public void arreter() {
        this.etat_moteur = EnumEtatM.ARRET;
    }

    @Override
    public String toString() {
        return "Moteur{" +
                "no_moteur=" + no_moteur +
                ", etat_moteur=" + etat_moteur +
                '}';
    }
}
