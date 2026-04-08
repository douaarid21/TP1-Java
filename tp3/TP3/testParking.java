package tp3.TP3;

public class testParking extends Vehicule {
	public static void main(String[] argv) {
		Vehicule[] v= new Vehicule[4];
		v[0] = new Voiture("a12346","clio",5);
		v[1] = new Voiture("s09876","Dacia",7);
		v[2] = new Moto("S333333","yamaha",true);
		v[3]= new Camion("toyota","R4444", 10000);
		
		for (Vehicule veh : v) {
            veh.stationner();
            veh.afficher();
        }
		System.out.println(" Les voitures: ");
        for (Vehicule veh : v) {
            if (veh instanceof Voiture) {
                veh.afficher();
            }
        }
        
        Vehicule x = new Moto("11C22", "Yamaha", true);
		//Voiture v1 = (Voiture) x;
        //System.out.println("Downcasting réussi !");
        
        if (x instanceof Voiture) {
            Voiture v1 = (Voiture) x;
            System.out.println("Downcasting réussi !");
        } else {
            System.out.println("Erreur : ce n'est pas une voiture !");
        }
	}
}