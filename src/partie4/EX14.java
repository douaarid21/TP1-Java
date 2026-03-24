package partie4;
import java.util.Scanner;

public class EX14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez une chaîne : ");
        String ch = sc.nextLine();

        String inverse = "";

        for (int i = ch.length() - 1; i >= 0; i--) {
            inverse += ch.charAt(i);
        }

        if (ch.equalsIgnoreCase(inverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Non palindrome");
        }
    }
}