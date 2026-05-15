package TP6;

import java.util.*;

public class Note {
    public static void main(String[] args) {
    	// 1 
        HashMap<String, Double> notes = new HashMap<>();

        // 2
        notes.put("ibtissam", 18.5);
        notes.put("salima", 12.0);
        notes.put("ilyas", 10.0);

        // 3
        System.out.println(notes);

        // 4
        System.out.println("Note de ibtissam : " + notes.get("ibtissam"));

        // 5
        notes.put("ilyas", 14.0);

        // 6
        notes.remove("salima");

        // 7
        double somme = 0;
        for (double n : notes.values()) {
            somme += n;
        }

        double moyenne = somme / notes.size();
        System.out.println("Moyenne générale : " + moyenne);
    }
}