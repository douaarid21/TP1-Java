package partie1;
import java.util.Scanner;

public class EX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Entrez un nombre : ");
        n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
	}

}
