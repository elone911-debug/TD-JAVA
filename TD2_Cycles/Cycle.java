public abstract class Cycle {
    private String modele;

    public Cycle (String modele) {
        this.modele = modele;
    }

    public String monModele() {
        return this.modele;
    }

    public abstract String affichageInfo();
}