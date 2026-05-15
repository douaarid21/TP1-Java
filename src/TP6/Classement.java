package TP6;
import java.util.*;

public class Classement {
    public static void main(String[] args) {
    	// 1
        TreeMap<Integer, String> etudiants = new TreeMap<>();

        // 2
        etudiants.put(101, "amin");
        etudiants.put(120, "laila");
        etudiants.put(90, "ali");

        // 3
        System.out.println(etudiants);

        // 4
        System.out.println("Premier : " + etudiants.firstEntry());
        System.out.println("Dernier : " + etudiants.lastEntry());

        // 5
        System.out.println(etudiants.tailMap(100));
    }
}
