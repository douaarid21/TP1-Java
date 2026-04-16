package Tp2.src.tp2java;
// Q1:
public class CompteBancaire {
// Q2:
	private int numero;
	private String titulaire;
	private double solde;
	private double decouvertAutorise;
// Q3:
	private static int nbComptes=0;
	private static double tauxInteret=0.03;
// Q4:

	public CompteBancaire() {
        this.numero = ++nbComptes;
        this.titulaire = "Inconnu";
        this.solde = 0;
        this.decouvertAutorise = 0;
    }
// Q5:
	public CompteBancaire(String titulaire,double solde,double decouvertAutorise) {
		this.numero = ++nbComptes;
		this.titulaire=titulaire;
		this.solde=solde;
		this.decouvertAutorise=decouvertAutorise;
	}
// Q6:
	public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        if (titulaire != null && !titulaire.isEmpty()) {
            this.titulaire = titulaire;
        }
    }
    
    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(double decouvertAutorise) {
        if (decouvertAutorise >= 0) {
            this.decouvertAutorise = decouvertAutorise;
        }
    }

    public static int getNbComptes() {
        return nbComptes;
    }

    public static double gettauxInteret() {
        return tauxInteret;
    }

    public static void settauxInteret(double taux) {
    	tauxInteret = taux;
    }
// Q7: 
    public void afficher() {
        System.out.println("Compte n°: " + numero +
                ", Titulaire: " + titulaire +
                ", Solde: " + solde +
                ", Découvert: " + decouvertAutorise);
    }
// Q8:
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        } else {
            System.out.println("Montant de dépôt invalide.");
        }
    }
    
    public void retirer(double montant) {
        if (montant > 0 && solde - montant >= -decouvertAutorise) {
            solde -= montant;
        } else {
            System.out.println("Retrait refusé.");
        }
    }
    
    public void virementVers(CompteBancaire autre, double montant) {
        if (montant > 0 && solde - montant >= -decouvertAutorise) {
            this.retirer(montant);
            autre.deposer(montant);
        } else {
            System.out.println("Virement impossible : montant ou solde insuffisant.");
        }
    }
 // Q9:
    public double calculerSoldeAvecInterets() {
        return solde + (solde * tauxInteret);
    }
    
    public double calculerSoldeAvecInterets(double bonus) {
        return solde + (solde * (tauxInteret + bonus));
    }

}

