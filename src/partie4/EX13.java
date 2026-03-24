package partie4;
import java.util.Scanner;

public class EX13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch;

        System.out.print("Entrez une chaîne : ");
        ch = sc.nextLine();

        String inverse = "";

        for (int i = ch.length() - 1; i >= 0; i--) {
            inverse += ch.charAt(i);
        }

        System.out.println("Inverse = " + inverse);
    }
}