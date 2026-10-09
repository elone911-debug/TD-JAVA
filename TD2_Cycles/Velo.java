public class Velo extends Cycle {

    public Velo (String modele) {
        super(modele);
    }

    @Override 
    public String affichageInfo() {
        return "Ceci est un velo de modèle : " + monModele();
    }
}