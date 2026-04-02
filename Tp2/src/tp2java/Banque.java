package tp2java;
//Q1:
public class Banque {
	private String nom;
    private CompteBancaire[] comptes;
    private int nbActuels;
    
// Q2:
    public Banque(String nom, int capacite) {
        this.nom = nom;
        this.comptes = new CompteBancaire[capacite];
        this.nbActuels = 0;
    }
    
 // Q3:
    public void ajouterCompte(CompteBancaire c) {
        if (nbActuels < comptes.length) {
            comptes[nbActuels++] = c;
        } else {
            System.out.println("Capacité maximale atteinte.");
        }
    }

    public void afficherTous() {
        for (int i = 0; i < nbActuels; i++) {
            comptes[i].afficher();
        }
    }
}