package TP6;
import java.util.*;
class Livre {
    String isbn, titre, auteur;
    int annee;
    public Livre(String isbn, String titre, String auteur, int annee) {
        this.isbn = isbn;
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
    }
    public String toString() {
        return titre + " (" + auteur + ")";
    }
    public static void main(String[] args) {
        ArrayList<Livre> livres = new ArrayList<>();
        HashSet<String> categories = new HashSet<>();
        HashMap<String, Livre> emprunts = new HashMap<>();
        // 1
        livres.add(new Livre("1", "Java", "Auteur1", 2020));
        livres.add(new Livre("2", "Python", "Auteur2", 2021));
        // 2
        categories.add("Programmation");
        categories.add("Science");
        // 3
        emprunts.put("jad", livres.get(0));
        // 4
        for (Livre l : livres) {
            if (l.titre.equals("Java")) {
                System.out.println("Livre trouvé : " + l);
            }
        }
        // 5
        livres.removeIf(l -> l.isbn.equals("2"));
        // 6
        for (Livre l : livres) {
            System.out.println(l);
        }
        // 7
        System.out.println("Nombre total de livres : " + livres.size());
    }
}