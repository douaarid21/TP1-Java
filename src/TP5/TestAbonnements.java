package TP5;

public class TestAbonnements {
    public static void main(String[] args) {

        Abonnement[] abonnements = new Abonnement[3];

        abonnements[0] = new AbonnementVideo("Netflix", 80, 4, true, true);
        abonnements[1] = new AbonnementMusique("Spotify", 50, 2, 25, true);
        abonnements[2] = new AbonnementJeux("jeux", 70, 3, 60, 50);

        for (Abonnement a : abonnements) {
            System.out.println("\n----- Abonnement -----");
            a.afficherInfos();
            System.out.println("Coût mensuel: " + a.calculerCoutMensuel());
            System.out.println("Score satisfaction: " + a.calculerScoreSatisfaction());
        }

        Reducible[] reducibles = new Reducible[2];
        reducibles[0] = (Reducible) abonnements[0];
        reducibles[1] = (Reducible) abonnements[1];

        System.out.println("\n--- Test Réduction ---");

        for (Reducible r : reducibles) {
            System.out.println("\n20% réduction:");
            System.out.println(r.appliquerReduction(20));

            System.out.println("50% réduction:");
            System.out.println(r.appliquerReduction(50));
        }
    }
}