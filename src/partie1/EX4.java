package partie1;
import java.util.Scanner;

public class EX4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int n, i = 1, somme = 0;

	        System.out.print("Entrez N : ");
	        n = sc.nextInt();

	        while (i <= n) {
	            somme += i;
	            i++;
	        }

	        System.out.println("Somme = " + somme);
	}

}
