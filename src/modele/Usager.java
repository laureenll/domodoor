package modele;

import java.util.ArrayList;
import java.util.Iterator;

public class Usager {
    public long id;
    public String prenom;
    public String nom;

    public ArrayList<Usager> usagers = new ArrayList<Usager>();

    public Usager(long id, String prenom, String nom) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Usager ajouterUsager(Usager usager) {
        usagers.add(usager);

        return usager;
    }

    public void supprimerUsager(long id) {
        usagers.remove(id);
    }

    public Usager getUsager(String nom, String prenom) {
        for (Usager usager : usagers) {
            if (usager.getNom() == nom && usager.getPrenom() == prenom) {
                return usager;
            } else {
                return null;
            }
        }
    }

    public Usager setUsager(String oldNom, String oldPrenom, String newNom, String newPrenom) {
        Usager usager = getUsager(oldNom, oldPrenom);
        usager.setPrenom(newPrenom);
        usager.setNom(newNom);


        return usager;
    }
}
