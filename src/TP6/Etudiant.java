package TP6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Etudiant {
	protected int Id;
	protected String Nom;
	protected double Moyenne;
	public Etudiant(int Id, String Nom, double Moyenne) {
		this.Id= Id;
		this.Nom= Nom;
		this.Moyenne=Moyenne;
	}
	@Override
	public String toString() {		
		return "ID: " + Id + " Nom: " + Nom + " Moyenne: " + Moyenne ;
	}
	public static void main(String[] args) {
    ArrayList<Etudiant> liste = new ArrayList<>();
    //1
    liste.add(new Etudiant(1, "yassir", 14.5));
    liste.add(new Etudiant(2, "hamza", 16.2));
    liste.add(new Etudiant(3, "samir", 12.8));
    liste.add(new Etudiant(4, "yasine", 18.0));
    liste.add(new Etudiant(5, "aamar", 15.3));
    //2
    System.out.println("Les étudiants :");
    for (Etudiant e : liste) {
        System.out.println(e);
    }
    //3
    String nom = "samir";
    for (Etudiant e : liste) {
        if (e.Nom.equalsIgnoreCase(nom)) {
            System.out.println("\nTrouvé : " + e);
        }
    }
    //4
    int idSupprimer = 1;
    liste.removeIf(e -> e.Id == idSupprimer);
    
    System.out.println("Les étudiants :");
    for (Etudiant e : liste) {
        System.out.println(e);
    }
    //5
    Collections.sort(liste, Comparator.comparingDouble(e -> e.Moyenne));

    System.out.println("\nAprès tri :");
    for (Etudiant e : liste) {
        System.out.println(e);
    }
    //6
    Etudiant meilleur = Collections.max(liste, Comparator.comparingDouble(e -> e.Moyenne));

    System.out.println("\nMeilleur étudiant :");
    System.out.println(meilleur);
	}	
}