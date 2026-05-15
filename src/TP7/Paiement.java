package TP7;

public class Paiement {
	public static double effectuerPaiement(double montant, double solde) {

	    if (montant <= 0) {
	        throw new IllegalArgumentException("Montant invalide");
	    }

	    if (montant > solde) {
	        throw new ArithmeticException("Solde insuffisant");
	    }

	    return solde - montant;
	}
	public static void main(String[] args) {

	    double solde = 1000;

	    try {
	        double nouveauSolde = effectuerPaiement(150, solde);
	        System.out.println("Nouveau solde : " + nouveauSolde);

	    } catch (IllegalArgumentException e) {
	        System.out.println("Erreur : montant invalide");

	    } catch (ArithmeticException e) {
	        System.out.println("Erreur : solde insuffisant");

	    } finally {
	        System.out.println("Fin de la transaction");
	    }
	}
}
