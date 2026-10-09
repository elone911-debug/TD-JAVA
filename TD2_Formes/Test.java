import java.awt.Color;
import java.util.Objects;

//Q4 : le code de Forme2D contient une variable pour stocker sa couleur 
// (private Color couleur;) ainsi que des constructeurs pour s'initialiser. 
// En Java, une interface fonctionne uniquement comme un contrat listant des actions 
// à réaliser : elle n'a absolument pas le droit de stocker des caractéristiques 
// personnelles (les variables) ni de posséder des constructeurs. Puisque notre forme 
// devait être capable de retenir concrètement sa couleur, la classe abstraite était le 
// seul choix possible.

public class Test{
    public static void main(String[] args) {

        Forme2D[] mesFormes = new Forme2D[2];

        mesFormes[0] = new Rectangle(5.0, 10.0);
        mesFormes[1] = new Disque(3.0, Color.RED);

        for (int i=0; i < mesFormes.length; i++) {
            System.out.println("Aire :" + mesFormes[i].aire());
            System.out.println("Perimetre :" + mesFormes[i].perimetre());
        }
    }
}