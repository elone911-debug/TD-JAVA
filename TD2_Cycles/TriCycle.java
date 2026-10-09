public class TriCycle extends Cycle {

    public TriCycle (String modele) {
        super(modele);
    }

    @Override 
    public String affichageInfo () {
        return "Ceci est un TriCycle dont le modele est : " + monModele();
    }
    
}