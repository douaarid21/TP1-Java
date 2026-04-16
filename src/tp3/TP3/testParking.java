package tp3.TP3;
public class testParking extends Vehicule {
	public static void main(String[] argv) {
		//Qa:
		Vehicule[] v= new Vehicule[4];
		//Qb:
		v[0] = new Voiture("a12346","clio",5);
		v[1] = new Voiture("s09876","Dacia",7);
		v[2] = new Moto("S333333","yamaha",true);
		v[3]= new Camion("toyota","R4444", 10000);
		//Qc:
		for (Vehicule veh : v) {
            veh.stationner();
            veh.afficher();
        }
		//Qd:
		System.out.println(" Les voitures: ");
        for (Vehicule veh : v) {
            if (veh instanceof Voiture) {
                veh.afficher();
            }
        }
        //Qe:
        Vehicule x = new Moto("11C22", "Yamaha", true);
		//Voiture v1 = (Voiture) x;
        //System.out.println("Downcasting réussi !");
        //code correct :
        if (x instanceof Voiture) {
            Voiture v1 = (Voiture) x;
            System.out.println("Downcasting réussi !");
        } else {
            System.out.println("Erreur : ce n'est pas une voiture !");
        }
	}
}
