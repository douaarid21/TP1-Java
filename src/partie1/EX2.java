package partie1;
import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.print("Entrez 3 nombres : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int max = a;

        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("Le plus grand est : " + max);
    }
}
