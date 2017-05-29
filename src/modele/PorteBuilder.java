package modele;

import utils.EnumEtatP;

public class PorteBuilder {
    private Long no_porte;
    private EnumEtatP etat_porte;

    public PorteBuilder setNo_porte(Long no_porte) {
        this.no_porte = no_porte;
        return this;
    }

    public PorteBuilder setEtat_porte(EnumEtatP etat_porte) {
        this.etat_porte = etat_porte;
        return this;
    }

    public Porte createPorte() {
        return new Porte(no_porte, etat_porte);
    }
}