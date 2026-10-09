public class TestCycle {
    public static void main(String[] args) {

        Cycle[] MesModeles = new Cycle[2]; 
        
        MesModeles[0] = new Velo("BMX");
        MesModeles[1] = new TriCycle("TAE");

        for (int i=0; i < MesModeles.length; i++) {
            System.out.println(MesModeles[i].affichageInfo());
            System.out.println(MesModeles[i].monModele());
        }
        
    }
}

//Q4 la classe Cycle a été déclarée avec le mot-clé abstract à la question 6.1. 
// Comme elle possède une méthode "vide" (affichageInfo()), 
// le plan de construction est considéré comme incomplet. 
// Java interdit formellement de créer un objet concret (avec new) à partir d'un 
// plan incomplet. Il faut donc obligatoirement instancier une de ses sous-classes concrètes,
//  comme Velo, qui a pris la peine d'écrire le vrai code manquant.