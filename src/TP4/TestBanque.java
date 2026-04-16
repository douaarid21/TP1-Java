package TP4;

public class TestBanque extends Compte {
    public TestBanque(String numero, String titulaire, double solde) {
		super(numero, titulaire, solde);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

        Compte[] comptes = new Compte[4];

        comptes[0] = new CompteCourant("C1", "Ali", 1000, 500);
        comptes[1] = new CompteEpargne("E1", "Sara", 2000, 0.05);
        comptes[2] = new ComptePremium("P1", "Youssef", 3000, 1000);
        comptes[3] = new CompteCourant("C2", "Amine", 1500, 300);

        for (Compte c : comptes) {
            c.deposer(200);
            c.retirer(500);
            c.afficher();
            System.out.println("-------------");
        }
        System.out.println("=== Comptes Epargne ===");

        for (Compte c : comptes) {
            if (c instanceof CompteEpargne) {
                c.afficher();
            }
        }
        Compte c = new CompteEpargne("E2", "Omar", 1000, 0.03);
        CompteCourant cc = (CompteCourant) c;
    }
}
