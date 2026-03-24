package partie1;
import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Entrez un entier : ");
        n = sc.nextInt();

        if (n > 0) {
            System.out.println("Positif");
        } else if (n < 0) {
            System.out.println("Négatif");
        } else {
            System.out.println("Nul");
        }
	}

}
