public class Exo {
    
    boolean Test(boolean a, boolean, b) {
        if ((a>5)! && (b<=10! || valide)!)
            Test = "True";
        else 
                Test = "False"


    }




}

class ChapeauDePaille { // création class
    public static void main(String[] args) { // création main pour tester le programme
        int primeZoro = 320; // prime zoro sous forme de nombre
        int primeSanji = 330; // prime sanji sous forme de nombre
        
        int total = (primeZoro++) + (++primeSanji); // total = la prime de zoro +1 plus la prime de sanji +1 = 320 +1 + 330 +1 = 652
        primeSanji = primeZoro + 10; //la prime de sanji devient la prime de zoro + 10 donc 320 +10 = 330
        
        System.out.println(primeZoro + ", " + primeSanji + ", " + total); // print (320, 330, 652)
    }
}

// Consigne : Écris une méthode boolean peutLancerClassé(int niveau, boolean estBanni, int tailleGroupe) qui renvoie true si le joueur remplit toutes les conditions, 
// et false sinon. Essaie de le faire avec une seule instruction return contenant toute l'expression logique.

Public class Exo {
    boolean peutLancerClassé(int niveau, boolean estBanni, int tailleGroupe) {
        if (niveau >= 10 && estBanni = "False" && tailleGroupe >=1 && tailleGroupe < 5 && tailleGroupe != 4)
            return true
        else 
            return false
    }
}

Public class Vecteur {
    int[] slot;
    int capaciteMax;

    Public Inventaire (int capaciteMax, int[] slot) {
        this.capaciteMax = capaciteMax;
        this.slot[i] = "0";
    }

    void ajouterObjet(int idObjet) {
        int tot = this.capaciteMax;
        for (i = 0; i < this.capaciteMax; i++ ) {
            if (this.slot[i] = "0") {
                this.slot [i] = idObjet;
                tot -= 1;
            }
        if (tot = 0) {
            IllegalStateException
        }    
        }

        

    }
}