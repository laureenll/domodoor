package modele;

import utils.EnumEtatT;
import java.util.ArrayList;

public class Telecommande {
    public long no_telecommande;
    public EnumEtatT etat_telecommande;
    public ArrayList<Telecommande> telecommandes = new ArrayList<Telecommande>();

    /**
     * Constructeur de la classe Télécommande
     * @param id
     * @param etat
     */
    public void Telecommande(long id, EnumEtatT etat) {
        this.no_telecommande = id;
        this.etat_telecommande = etat;
    }

    /**
     * Méthode qui permet de demander l'ouverture de la porte
     */
    public void demandeOuverture() {

    }

    /**
     * Méthode qui permet de demander la fermeture de la porte
     */
    public void demandeFermeture() {

    }

    /**
     * Ajoute une télécommande supplémentaires à la liste des télécommandes
     * @param tel
     * @return
     */
    public Telecommande ajouterTelecommande(Telecommande tel) {
        telecommandes.add(tel);

        return tel;
    }
}
