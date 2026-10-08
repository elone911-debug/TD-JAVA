public class Animal {
    protected String nom ;
    protected int age ;
    protected int energie;
    protected int santePhysique ;
    protected int santeMentale;

    public Animal ( String nom , int age ) {
        this.nom = nom;
        this.age = age;
        this.energie = 100;
        this.santePhysique = 100;
        this.santeMentale = 100;
    }

    public void communiquer () {
        energie = Math.max ( energie - 1 , 0) ;
        System.out.println ( nom + " émet un son. " ) ;
    }

    public void manger () {
        santePhysique = Math.min(this.santePhysique + 10,100); 
        santeMentale = Math.min(this.santeMentale + 5,100);
        energie = Math.min(this.energie + 10,100);
        System.out.println(nom + " mange.");
    }

    public void jouer () {
        santeMentale = Math.min(this.santeMentale + 10,100);
        energie = Math.max (this.energie - 20, 0);
        System.out.println(nom + " joue.");
    }

    public void dormir () {
        energie = Math.min ( energie + 30 , 100);
        santePhysique = Math.min(this.santePhysique + 5, 100);
        santeMentale = Math.min(this.santeMentale + 5, 100);
        System.out.println(nom + " dort.");

    }

    boolean estSouffrant () {
        if (this.santePhysique < 10|| this.santeMentale < 10 || this.energie < 10)
            return true;
        else 
            return false;
    }

    public String affichageEtat () {
        return " Nom : " + nom + " \n" + "Energie : " + energie + " SP : " + santePhysique + " SM : " + santeMentale;
    }

    public static void main(String[] args) {
        Animal[] animaux = {
            new Animal("Monstro", 5),
            new Chien("Médor", 3),
            new Chat("Figaro", 2)
        };

        for (Animal animal : animaux) {
            animal.communiquer();
            animal.jouer();
            System.out.println(animal.affichageEtat());
            animal.dormir();
            System.out.println(animal.affichageEtat());
        }

        System.out.println(animaux[2].nom + " est souffrant ? " + animaux[2].estSouffrant());
        
        for (int i = 0; i < 5; i++) {
            animaux[2].jouer();
        }
        
        System.out.println(animaux[2].nom + " est souffrant ? " + animaux[2].estSouffrant());
    }
}


class Chien extends Animal {
    public Chien(String nom, int age) {
        super(nom, age);
    }

    
    public void communiquer() {
        santeMentale = Math.min(this.santeMentale + 3, 100);
        energie = Math.max(this.energie - 2, 0);
        System.out.println(nom + " aboie");
    }
}


class Chat extends Animal {
    public Chat(String nom, int age){
        super(nom, age);
    }

    public void communiquer() {
        santeMentale = Math.min(this.santeMentale + 2, 100);
        energie = Math.max(energie - 1, 0);
        System.out.println(nom + " miaule");
    }
}