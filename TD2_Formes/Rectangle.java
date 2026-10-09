public class Rectangle extends Forme2D {
    private double longueur;
    private double largeur;

    public Rectangle (double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public void ModifCaract(double l, double L) {
        this.longueur = l;
        this.largeur = L;
    }

    public double getLongueur () {
        return longueur;
    }

    public double getLargeur () {
        return largeur;
    }

    @Override
    public double aire() {
        return this.longueur * this.largeur;
    }


    @Override
    public double perimetre() {
        return 2 * (this.longueur + this.largeur);
    }
}

