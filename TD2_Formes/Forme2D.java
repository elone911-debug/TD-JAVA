import java.awt.Color;
import java.util.Objects;


public abstract class Forme2D { // class abstract car au moins une méthode abstract
    private Color couleur;

    public Forme2D () {
        this(Color.BLACK); // permet de renvoyer directement au cosntructeur suivant
    }

    public Forme2D (Color couleur) {
        this.couleur = Objects.requireNonNull(couleur , "couleur");
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {                 // sert de modification
        this.couleur = Objects.requireNonNull(couleur , "couleur");
    }

    public abstract double aire(); //on ecrit abstract parce qu'on a pas assez d'information pour définir l'aire

    public abstract double perimetre();

}


