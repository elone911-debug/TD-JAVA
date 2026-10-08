public class CompteBancaire {
    protected String titulaire;
    protected double solde;


    public CompteBancaire(String titulaire, double solde) {
        this.titulaire = titulaire;
        this.solde = solde;
    }


    public void deposer (double montant) {
        this.solde += montant;
    }

    public void retirer (double montant) {
        if (this.solde >= montant){
            this.solde -= montant;
        }
        else
            System.out.println("Fonds insuffisants");

    }

    public String afficherSolde () {
        return "titulaire : " + this.titulaire + " | Solde : " + this.solde;
    }

    public static void main(String[] args) {
        CompteBancaire compteBob = 
        new CompteBancaire("Bob",100);

        CompteEpargne compteKevin = new CompteEpargne("Kevin",500,5.0);
        System.out.println(compteKevin.afficherSolde());

        compteBob.deposer(50);
        System.out.println(compteBob.solde);

        compteBob.retirer(150);
        System.out.println(compteBob.solde);

        compteKevin.verserInterets();
        System.out.println(compteKevin.afficherSolde());



    }

}

class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

    public CompteEpargne (String titulaire, double SoldeInitial, double tauxInteret) {
        super(titulaire, SoldeInitial);
        this.tauxInteret = tauxInteret;
    }

    public void verserInterets() {
        double interet = this.solde * (this.tauxInteret/100);
        deposer(interet);
    }
}

class CompteCourant extends CompteBancaire {
    private double decouvertAutorise;
    
    public CompteCourant (String titutlaire, double SoldeInitial, double decouvertAutorise) {
        super(titutlaire, SoldeInitial);
        this.DecouvertAutorise = DecouvertAutorise;
    }

    @Override
    public void retirer(double montant) {
        // TODO Auto-generated method stub
        if ((this.solde - montant) >= -this.decouvertAutorise) { // montant n'est qu'un attribut temporaire
            this.solde -= montant;
        }
        else {
            System.out.println("Plafond de découvert dépassé");
        }
    }
}