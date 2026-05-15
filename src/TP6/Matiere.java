package TP6;
import java.util.*;

public class Matiere {
	public static void main(String[] args) {
		HashSet<String> matieres = new HashSet<>();
	    // 1 
		matieres.add("Math");
		matieres.add("Physique");
		matieres.add("Informatique");
		matieres.add("Math"); 
		// 2 et 3
		System.out.println(matieres);
		
		// 4
		TreeSet<String> matieresTriees = new TreeSet<>(matieres);
		
		// 5
		System.out.println(matieresTriees);
	}
}
