import java.awt.Color;
import java.util.Objects;

public class Disque extends Forme2D {
    private double rayon;


    public Disque (double rayon, Color couleur) {
        super(couleur);
        this.rayon = rayon;
    }

    public void ModifR (double valeur) {
        this.rayon = valeur;
    }

    public double GetR () {
        return rayon;
    }

    @Override 
    public double aire() {
        return Math.PI * this.rayon * this.rayon ;
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * this.rayon;
    }
}

