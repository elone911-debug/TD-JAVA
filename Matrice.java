// 1. La classe Vecteur N'EST PLUS "public" pour pouvoir cohabiter dans ce fichier
class Vecteur {
    int[] donnees;
    int taille;

    Vecteur(int capacite) {
        this.donnees = new int[capacite];
        this.taille = 0;
    }

    Vecteur(int[] tab) {
        this.donnees = tab;
        this.taille = tab.length;
    }

    Vecteur(int[] tab, int i, int j) {
        this.taille = j - i;
        this.donnees = new int[this.taille];
        for (int k = 0; k < this.taille; k++) {
            this.donnees[k] = tab[i + k];
        }
    }

    int getTaille() { return this.taille; }
    
    int getVal(int i) { return this.donnees[i]; }

    void ajouter(int ind, int val) {
        for (int k = this.taille; k > ind; k--) {
            this.donnees[k] = this.donnees[k - 1];
        }
        this.donnees[ind] = val;
        this.taille++;
    }

    void supprimer(int ind) {
        for (int k = ind; k < this.taille - 1; k++) {
            this.donnees[k] = this.donnees[k + 1];
        }
        this.taille--;
    }

    void setVal(int i, int v) {
        this.donnees[i] = v;
    }

    String affichage() {
        String texte = "";
        for (int i = 0; i < this.taille; i++) {
            texte += this.donnees[i] + ", ";
        }
        return texte;
    }

    int somme() {
        int total = 0;
        for (int i = 0; i < this.taille; i++) {
            total += this.donnees[i];
        }
        return total;
    }

    int min() {
        if (this.taille == 0) 
            throw new IllegalStateException("Vecteur vide");
        int minimum = this.donnees[0];
        for (int i = 1; i < this.taille; i++) {
            if (this.donnees[i] < minimum) 
                minimum = this.donnees[i];
        }
        return minimum;
    }

    void trier() {
        for (int i = 0; i < this.taille; i++) {
            for (int j = i + 1; j < this.taille; j++) {
                if (this.donnees[i] > this.donnees[j]) {
                    int attend = this.donnees[i];
                    this.donnees[i] = this.donnees[j];
                    this.donnees[j] = attend;
                }
            }
        }
    }

    void reverse() {
        int gauche = 0;
        int droite = this.taille - 1;
        while (gauche < droite) {
            int wait = this.donnees[gauche];
            this.donnees[gauche] = this.donnees[droite];
            this.donnees[droite] = wait;
            gauche++;
            droite--;
        }
    }

    int occ(int v) {
        int i = this.taille - 1;
        while (i >= 0) {
            if (this.donnees[i] == v) return i;
            i--;
        }
        return -1;
    }

    int proprieteUniverselle() {
        int negatif = 0;
        int i = 0;
        while (i < this.taille) {
            if (this.donnees[i] < 0) negatif += 1;
            i++;
        }
        return negatif;
    }

    boolean proprieteUniverselle2() {
        boolean tousNegatifs = true;
        for (int i = 0; i < this.taille; i++) {
            if (!(this.donnees[i] > 0)) tousNegatifs = false;
        }
        return !(tousNegatifs);
    }

    boolean proprieteExistentielle() {
        boolean tousPositifs = true;
        for (int i = 0; i < this.taille; i++) {
            if (!(this.donnees[i] > 0)) tousPositifs = false;
        }
        return !(tousPositifs);
    }

    int rechercheDico(int v) {
        int gauche = 0;
        int droite = this.taille - 1;
        while (gauche <= droite) {
            int milieu = (gauche + droite) / 2;
            if (this.donnees[milieu] == v) return milieu;
            if (this.donnees[milieu] < v) gauche = milieu + 1;
            else droite = milieu - 1;
        }
        return -1;
    }

    void supprAll(int v) {
        for (int i = this.taille - 1; i >= 0; i--) {
            if (this.donnees[i] == v) this.supprimer(i);
        }
    }

    Boolean avoid13_2() {
        int n = this.donnees.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 2; j < n; j++) {
                if (this.donnees[i] < this.donnees[j] && this.donnees[j] < this.donnees[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    /* Ancien main de test du vecteur mis en commentaire pour éviter les conflits
    public static void main(String[] args) {
        // ... tes anciens tests ...
    }
    */
}

// 2. La classe Matrice est la SEULE classe "public" du fichier
public class Matrice {
    private Vecteur[] mat;

    Matrice(Vecteur[] mat) {
        if (mat == null || mat.length == 0) {
            throw new IllegalArgumentException("Le tableau ne doit pas être vide.");
        }
        this.mat = new Vecteur[mat.length];
        for (int i = 0; i < mat.length; i++) {
            this.mat[i] = mat[i];
        }
    }

    Matrice(int m, int n) {
        if (m <= 0 || n <= 0) {
            throw new IllegalArgumentException("Dimensions positives requises.");
        }
        this.mat = new Vecteur[m];
        for (int i = 0; i < m; i++) {
            this.mat[i] = new Vecteur(n);
            // Conformément à la question 21, on initialise à 1
            for (int j = 0; j < n; j++) {
                this.mat[i].setVal(j, 1);
            }
        }
    }

    int getNbLignes() {
        return this.mat.length;
    }

    int getNbColonnes() {
        return this.mat[0].donnees.length;
    }

    int getVal(int i, int j) {
        return this.mat[i].donnees[j];
    }

    void setVal(int i, int j, int v) {
        this.mat[i].donnees[j] = v;
    }

    public String affichage() {
    String texte = ""; 

    // On parcourt uniquement les lignes
    for (int i = 0; i < this.getNbLignes(); i++) {
        // On délègue le travail : le vecteur crée sa propre ligne de texte, 
        // et on ajoute le saut de ligne demandé par l'énoncé
        texte += this.mat[i].affichage() + "\n"; 
    }

    return texte;
    }


    Matrice vect2mat(int n) {
    // 1. On vérifie si le découpage est possible sans reste[cite: 1]
    if (this.taille % n != 0) {
        throw new IllegalStateException("La dimension n'est pas un multiple de n"); //[cite: 1]
    }

    // 2. On calcule le nombre de lignes (m) nécessaires
    int m = this.taille / n;

    // 3. On fabrique la grille (la matrice) vide avec m lignes et n colonnes
    Matrice nouvelleMatrice = new Matrice(m, n);

    // 4. On parcourt notre ruban plat (le vecteur) case par case
    for (int k = 0; k < this.taille; k++) {
        
        // Calcul des coordonnées 2D grâce à la division euclidienne[cite: 1]
        int q = k / n; // q représente l'indice de la ligne[cite: 1]
        int r = k % n; // r représente l'indice de la colonne[cite: 1]
        
        // On prend la valeur à l'index k, et on la range dans la matrice aux coordonnées (q, r)
        nouvelleMatrice.setVal(q, r, this.donnees[k]);
    }

    // 5. La grille est remplie, on la renvoie !
    return nouvelleMatrice;
    }


    Vecteur mat2vect() {
    // 1. On fabrique le ruban vide à la bonne taille
    int tailleTotale = this.getNbLignes() * this.getNbColonnes();
    Vecteur nouveauVecteur = new Vecteur(tailleTotale);
    
    // 2. Le doigt qui avance sur le ruban plat
    int k = 0;
    
    // 3. On parcourt la grille (lignes puis colonnes)
    for (int i = 0; i < this.getNbLignes(); i++) {
        for (int j = 0; j < this.getNbColonnes(); j++) {
            
            // LA LIGNE MAGIQUE : 
            // On lit la valeur dans la matrice en (i, j)
            // On l'écrit dans le nouveau vecteur à la position (k)
            nouveauVecteur.setVal(k, this.getVal(i, j));
            
            // On fait avancer le doigt sur le ruban plat pour la prochaine valeur
            k++;
        }
    }
    
    // 4. On renvoie le ruban complètement rempli
    return nouveauVecteur;
    }   

    
    public static void main(String[] args) {
        Vecteur v1 = new Vecteur(new int[]{10, 20, 30});
        Vecteur v2 = new Vecteur(new int[]{40, 50, 60});
        Vecteur v3 = new Vecteur(new int[]{70, 80, 90});

        Vecteur[] palette = new Vecteur[]{v1, v2, v3};
        Matrice maMatrice = new Matrice(palette);

        System.out.println("La matrice a été créée avec succès !");
        System.out.println("Lignes : " + maMatrice.getNbLignes());
        System.out.println("Colonnes : " + maMatrice.getNbColonnes());
        System.out.println("Valeur en (1,2) : " + maMatrice.getVal(1, 2));

        maMatrice.setVal(2, 1, 8);
        System.out.println("\nAffichage complet :");
        System.out.println(maMatrice.affichage());

        
    }
}