package TP7;

public class Gestionlocale {
	public static double lireMontant(String valeur) {

	    try {
	        double montant = Double.parseDouble(valeur);

	        if (montant < 0) {
	            throw new IllegalArgumentException("Montant négatif");
	        }

	        return montant;

	    } catch (NumberFormatException e) {
	        System.out.println("Erreur : valeur non numérique");
	    } catch (IllegalArgumentException e) {
	        System.out.println("Erreur : montant négatif");
	    }

	    return 0; 
	}
	public static void main(String[] args) {

	    // Cas 1 : valeur correcte
	    double m1 = lireMontant("150.5");
	    System.out.println("Montant 1 : " + m1);

	    // Cas 2 : valeur non numérique
	    double m2 = lireMontant("abc");
	    System.out.println("Montant 2 : " + m2);

	    // Cas 3 : valeur négative
	    double m3 = lireMontant("-50");
	    System.out.println("Montant 3 : " + m3);
	}
}