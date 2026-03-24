package partie4;
import java.util.Scanner;

public class EX12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch;
        int count = 0;

        System.out.print("Entrez une chaîne : ");
        ch = sc.nextLine().toLowerCase();

        for (int i = 0; i < ch.length(); i++) {
            char c = ch.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                count++;
            }
        }

        System.out.println("Nombre de voyelles = " + count);
    }
}