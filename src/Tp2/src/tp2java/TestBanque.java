package Tp2.src.tp2java;

public class TestBanque {

	public static void main(String[] args) {
		// Q1:
        Banque b = new Banque("MarocBank", 1500);
        
        // Q2:
        CompteBancaire c1 = new CompteBancaire("samir", 1999, -300);
        CompteBancaire c2 = new CompteBancaire("Bilal", -100, 200);
        CompteBancaire c3 = new CompteBancaire("inas", 2000, 400);
        
        // Q3:
        b.ajouterCompte(c1);
        b.ajouterCompte(c2);
        b.ajouterCompte(c3);
        
        // Q4:
        c1.deposer(500);
        c1.retirer(200);
        c2.virementVers(c3, 300);
        
        // Q5:
        System.out.println("\n--- Comptes ---");
        b.afficherTous();
        
        // Q6:
        System.out.println("\nSolde c2 avec intérêts: " + c2.calculerSoldeAvecInterets());
        System.out.println("Solde c2 avec bonus: " + c2.calculerSoldeAvecInterets(0.015));

        // Q7:
        System.out.println("\nNombre total de comptes: " + CompteBancaire.getNbComptes());
        System.out.println("Taux d'intérêt annuel: " + CompteBancaire.gettauxInteret());
	}

}
