import java . util . Scanner ;

class Lire {
public static void main ( String [] args ) {
Scanner sc = new Scanner ( System . in ) ;
System.out.println("Saisissez un nombre : ");
int i = sc . nextInt () ;

if (i > 0) {
    System.out.println("strictement positif");}

else if (i < 0){
    System.out.println("strictement négitif");}

else {System.out.println("nul");}
}
}

static boolean xor(boolean a, boolean b) {
    if (a == true) {
        if (b == true) { 
            return false; // Les deux sont vrais, c'est refusé par le XOR
        } else { // sous-entendu b == false
            return true;  // Un seul des deux est vrai, c'est bon
        }
    } else { // sous-entendu a == false
        if (b == true) { 
            return true;  // Un seul des deux est vrai, c'est bon
        } else { // sous-entendu b == false
            return false; // Les deux sont faux, c'est refusé
        }
    }
}

