package modele;

import java.util.ArrayList;

public class Usager {
    public long id;
    public String prenom;
    public String nom;
    public ArrayList<Usager> usagers = new ArrayList<Usager>();

    /**
     * Constructeur de la classe Usager
     * @param id
     * @param prenom
     * @param nom
     */
    public Usager(long id, String prenom, String nom) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
    }

    /**
     * Récupère le prénom d'un usager
     * @return
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Récupère le nom d'un usager
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     * Met le prénom d'un usager
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Met le nom d'un usager
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Ajoute un uager supplémentaire
     * @param usager
     * @return
     */
    public Usager ajouterUsager(Usager usager) {
        usagers.add(usager);

        return usager;
    }

    /**
     * Supprime un usager
     * @param id
     */
    public void supprimerUsager(long id) {
        usagers.remove(id);
    }

    /**
     * Récupère un usager en utilisant le nom et le prénom comme clé d'identification
     * @param nom
     * @param prenom
     * @return
     */
    public Usager getUsager(String nom, String prenom) {
        Usager usg = null;
        for (Usager usager : usagers) {
            if (usager.getNom() == nom && usager.getPrenom() == prenom) {
                usg =  usager;
            }
        }
        return usg;
    }

    /**
     * Met à jour les valeur nom et prenom d'un usager
     * @param oldNom
     * @param oldPrenom
     * @param newNom
     * @param newPrenom
     * @return
     */
    public Usager setUsager(String oldNom, String oldPrenom, String newNom, String newPrenom) {
        Usager usager = null;
        for (int i = 0; i < usagers.size(); i++) {
            if(usagers.get(i).getNom() == oldNom && usagers.get(i).getPrenom() == oldPrenom) {
                usager.setPrenom(newPrenom);
                usager.setNom(newNom);
                usagers.set(i, usager);
            }
        }
        return usager;
    }
}
