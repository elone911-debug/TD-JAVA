import java.util.Scanner;

public class ChoisirLangage {

    // --- POINT D'ENTRÉE DU QUESTIONNAIRE ---
    public String demarrerQuestionnaire(Scanner scanner) {
        System.out.println("Vous souhaitez faire une carrière en Informathique ? (Oui/Non)");
        if (scanner.nextLine().equalsIgnoreCase("Oui")) {
            return evaluerAlgo(scanner);
        }
        return evaluerJeux(scanner);
    }


    // BRANCHE GAUCHE / BAS : CARRIÈRE (OUI)
    

    public String evaluerAlgo(Scanner scanner) {
        System.out.println("Vous avez de bonnes connaissances en algorithmique ? (Oui/Non)");
        if (scanner.nextLine().equalsIgnoreCase("Oui")) {
            return evaluerMaths(scanner);
        }
        return evaluerArgent(scanner);
    }

    public String evaluerArgent(Scanner scanner) {
        System.out.println("Vous aimez l'argent ? (Oui/Non)");
        if (scanner.nextLine().equalsIgnoreCase("Oui")) {
            return "Cobol";
        }
        return evaluerMaths(scanner);
    }

    public String evaluerMaths(Scanner scanner) {
        System.out.println("Vous avez de bonnes connaissances en mathématiques ? (Oui/Non)");
        if (scanner.nextLine().equalsIgnoreCase("Oui")) {
            return evaluerHeures(scanner);
        }
        return evaluerTerminal(scanner);
    }

    // --- Sous-branche : Mathématiques (Oui) ---
    public String evaluerHeures(Scanner scanner) {
        System.out.println("Vous êtes prêt(e) à travailler 14 heures par jour ? (Oui/Non)");
        if (scanner.nextLine().equalsIgnoreCase("Oui")) {
            return evaluerBonnet(scanner);
        }
        return evaluerConcentration(scanner);
    }

    public String evaluerBonnet(Scanner scanner) {
        System.out.println("Vous voyez dans un bonnet péruvien traditionnel un lambda terme ? (Oui/Non)");
        if (scanner.nextLine().equalsIgnoreCase("Oui")) {
            return "Haskell";
        }
        return evaluerProuver(scanner);
    }

    public String evaluerProuver(Scanner scanner) {
        System.out.println("Vous aimez prouver ? (Oui/Non)");
        if (scanner.nextLine().equalsIgnoreCase("Oui")) {
            return evaluerPragmatique(scanner);
        }
        return "Ocaml";
    }

    public String evaluerPragmatique(Scanner scanner) {
        System.out.println("Vous êtes pragmatique ? (Oui/Non)");
        if (scanner.nextLine().equalsIgnoreCase("Oui")) {
            return "Lean";
        }
        return "Rocq";
    }

    public String evaluerConcentration(Scanner scanner) {
        System.out.println("Vous avez une bonne concentration ? (Oui/Non)");
        if (scanner.nextLine().equalsIgnoreCase("Oui")) {
            return evaluerAbstraction(scanner);
        }
        return "Python";
    }

    public String evaluerAbstraction(Scanner scanner) {
        System.out.println("Votre sens de l'abstraction est très développé ? (Oui/Non)");
        if (scanner.nextLine().equalsIgnoreCase("Oui")) {
            return "Prolog";
        }
        return "Fortran";
    }

    // --- Sous-branche : Mathématiques (Non) ---
    public String evaluerTerminal(Scanner scanner) {
        System.out.println("Tout de suite après le démarrage du PC vous ouvrez un terminal ? (Oui/Non)");
        if (scanner.nextLine().equalsIgnoreCase("Oui")) {
            return evaluerLinux(scanner);
        }
        return evaluerEsthetique(scanner);
    }

    public String evaluerLinux(Scanner scanner) {
        System.out.println("Vous êtes plutôt Linux que Windows ? (Oui/Non)");
        if (scanner.nextLine().equalsIgnoreCase("Oui")) {
            return evaluerMatinSoir(scanner);
        }
        return evaluerEditeur(scanner);
    }

    public String evaluerEditeur(Scanner scanner) {
        System.out.println("Vous aimez que votre éditeur (Visual Studio) écrive la moitié du code à votre place ? (Oui/Non)");
        if (scanner.nextLine().equalsIgnoreCase("Oui")) {
            return "C#";
        }
        return "PowerShell";
    }

    public String evaluerMatinSoir(Scanner scanner) {
        System.out.println("Vous êtes prêt(e) à travailler du matin au soir ? (Oui/Non)");
        if (scanner.nextLine().equalsIgnoreCase("Oui")) {
            return evaluerNuit(scanner);
        }
        return evaluerProblemesArgent(scanner);
    }

    public String evaluerNuit(Scanner scanner) {
        System.out.println("la nuit aussi ? (Oui/Non)");
        if (scanner.nextLine().equalsIgnoreCase("Oui")) {
            return "langage C: pour préparer la version 7 du noyau Linux";
        }
        return "Java";
    }

    public String evaluerProblemesArgent(Scanner scanner) {
        System.out.println("Vous êtes prêt(e) à faire face aux problèmes d'argent ? (Oui/Non)");
        if (scanner.nextLine().equalsIgnoreCase("Oui")) {
            return "LaTeX";
        }
        return "Solidity";
    }

    public String evaluerEsthetique(Scanner scanner) {
        System.out.println("Vous avez un sens de l'esthétique ? (Oui/Non)");
        if (scanner.nextLine().equalsIgnoreCase("Oui")) {
            return evaluerFramework(scanner);
        }
        return evaluerBavard(scanner);
    }

    public String evaluerFramework(Scanner scanner) {
        System.out.println("Vous adorez apprendre un nouveau framework toutes les deux semaines ? (Oui/Non)");
        if (scanner.nextLine().equalsIgnoreCase("Oui")) {
            return evaluerGrillePain(scanner);
        }
        return "HTML/CSS";
    }

    public String evaluerGrillePain(Scanner scanner) {
        System.out.println("Acceptez-vous qu'une fonction qui attend un nombre puisse recevoir un grille-pain ? (Oui/Non)");
        if (scanner.nextLine().equalsIgnoreCase("Oui")) {
            return "Javascript";
        }
        return "Typescript";
    }

    public String evaluerBavard(Scanner scanner) {
        System.out.println("Vous êtes très bavard(e) ? (Oui/Non)");
        if (scanner.nextLine().equalsIgnoreCase("Oui")) {
            return evaluerBricolage(scanner);
        }
        return "MarkDown";
    }

    public String evaluerBricolage(Scanner scanner) {
        System.out.println("Vous aimez le bricolage ? (Oui/Non)");
        if (scanner.nextLine().equalsIgnoreCase("Oui")) {
            return "Arduino (C++)";
        }
        return "XML";
    }

    
    // BRANCHE DROITE : LOISIRS (NON)
    

    public String evaluerJeux(Scanner scanner) {
        System.out.println("Vous aimez les jeux vidéo ? (Oui/Non)");
        if (scanner.nextLine().equalsIgnoreCase("Oui")) {
            return evaluerHackers(scanner);
        }
        return evaluerStarWars(scanner);
    }

    public String evaluerHackers(Scanner scanner) {
        System.out.println("Vous aimez des films de hackers qui tapent vite sur un clavier. ? (Oui/Non)");
        if (scanner.nextLine().equalsIgnoreCase("Oui")) {
            return evaluerPopcorns(scanner);
        }
        
        return evaluerParler(scanner);
    }

    public String evaluerStarWars(Scanner scanner) {
        System.out.println("Vous regardez tous les Star Wars à la suite. au moins une fois par an ? (Oui/Non)");
        if (scanner.nextLine().equalsIgnoreCase("Oui")) {
            return evaluerParler(scanner);
        }
        return "Excel";
    }

    public String evaluerParler(Scanner scanner) {
        System.out.println("Vous avez besoin de parler pour réfléchir ? (Oui/Non)");
        if (scanner.nextLine().equalsIgnoreCase("Oui")) {
            return "Power Point";
        }
        return "VBA";
    }

    public String evaluerPopcorns(Scanner scanner) {
        System.out.println("Vous mangez des popcorns au cinéma ? (Oui/Non)");
        if (scanner.nextLine().equalsIgnoreCase("Oui")) {
            return "scratch";
        }
        return evaluerDecu(scanner);
    }

    public String evaluerDecu(Scanner scanner) {
        System.out.println("Êtes-vous déçu d'apprendre qu'un développeur passe 90% de son temps à réfléchir en silence devant une page blanche, sans toucher son clavier ? (Oui/Non)");
        if (scanner.nextLine().equalsIgnoreCase("Oui")) {
            return "HackerTyper.net";
        }
        return "Whitespace";
    }

    // --- LE MAIN ---
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChoisirLangage jeu = new ChoisirLangage();
        
        System.out.println("--- TEST : QUEL LANGAGE EST FAIT POUR VOUS ? ---");
        String langageIdeal = jeu.demarrerQuestionnaire(scanner);
        
        System.out.println("\nLe langage qu'il vous faut est : " + langageIdeal);
        
        scanner.close(); 
    }
}