package modele;

import utils.EnumEtatP;

public class Porte {
    private long no_porte;
    private EnumEtatP etat_porte;
    private EnumEtatP etatPorteBloquee;

    /**
     * Constructeur de la classe Porte
     * @param no_porte
     * @param etat_porte
     */
    public Porte(Long no_porte, EnumEtatP etat_porte) {
        this.no_porte = no_porte;
        this.etat_porte = etat_porte;
    }

    /**
     * Récupère le numéro de la porte
     * @return
     */
    public long getNo_porte() {
        return no_porte;
    }

    /**
     * Affecte un numéro à la porte
     * @param no_porte
     */
    public void setNo_porte(long no_porte) {
        this.no_porte = no_porte;
    }

    /**
     * Récupère l'état de la porte
     * @return
     */
    public EnumEtatP getEtat_porte() {
        return etat_porte;
    }

    /**
     * Affecte un nouvel état à la porte
     * @param etat_porte
     */
    public void setEtat_porte(EnumEtatP etat_porte) {
        this.etat_porte = etat_porte;
    }

    /**
     * Récupère l'état de la porte avant qu'elle ne soit bloquée
     * @return
     */
    public EnumEtatP getEtatPorteBloquee() {
        return etatPorteBloquee;
    }

    /**
     * Affecte un état à la porte avant qu'elle ne soit bloquée
     * @param etatPorteBloquee
     */
    public void setEtatPorteBloquee(EnumEtatP etatPorteBloquee) {
        this.etatPorteBloquee = etatPorteBloquee;
    }

    /**
     * Permet d'ouvrir la porte
     */
    public void ouvre() {
        moteur.tirer();
        this.etat_porte = EnumEtatP.ENOUVERTURE;
    }

    /**
     * Permet de fermer la porte
     */
    public void ferme() {
        moteur.pousser();
        this.etat_porte = EnumEtatP.ENFERMETURE;
    }

    /**
     * Arrête l'action de la porte
     */
    public void pause() {
        moteur.stop();
        this.etat_porte = EnumEtatP.ARRETEE;
    }

    /**
     * Passe l'état de la porte à fermée
     */
    public void fermee() {
        this.etat_porte = EnumEtatP.FERMEE;
    }

    /**
     * Passe l'état de la porte à ouverte
     */
    public void ouverte() {
        this.etat_porte = EnumEtatP.OUVERTE;
    }

    /**
     * Passe la porte dans l'état bloquée
     * @return
     */
    public EnumEtatP bloque() {
        this.etatPorteBloquee = this.etat_porte;
        this.etat_porte = EnumEtatP.BLOQUEE;

        return this.etatPorteBloquee;
    }

    /**
     * Reprise de la porte après un arrêt
     * @param etat
     */
    public void reprend(EnumEtatP etat) {
        this.etat_porte = etat;
        if (etat == EnumEtatP.ENFERMETURE) {
            moteur.pousser();
        } else if (etat == EnumEtatP.ENOUVERTURE) {
            moteur.tirer();
        } else {
            //Problème : avant que la porte se bloque, son état n'est pas bien enregistré
        }
    }

    @Override
    public String toString() {
        return "Porte{" +
                "no_porte=" + no_porte +
                ", etat_porte=" + etat_porte +
                '}';
    }
}
