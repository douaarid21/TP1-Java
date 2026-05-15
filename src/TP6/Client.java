package TP6;

import java.util.*;

public class Client {
	protected int Num;
	protected String Nom;
	
	public Client(int Num, String Nom) {
		this.Num=Num;
		this.Nom = Nom;
	}
	
	public String toString() {
        return "numero :" +Num+ " nom :" + Nom;
    }
	public static void main(String[] args) {

        LinkedList<Client> file = new LinkedList<>();

        // 1. Ajouter
        file.add(new Client(1, "Ali"));
        file.add(new Client(2, "hind"));
        file.add(new Client(3, "yousef"));

        // 2
        System.out.println(file);

        // 3
        file.poll();

        // 4
        file.addLast(new Client(4, "jana"));

        // 5
        System.out.println("Premier client : " + file.peek());
    }	
}	