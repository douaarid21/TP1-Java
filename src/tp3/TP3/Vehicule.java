package tp3.TP3;

public class Vehicule {
	protected String matricule;
	protected String marque;
	public Vehicule() {
		
	}
	public Vehicule(String matricule,String marque) {
		this.marque=marque;
		this.matricule=matricule;
	}
	
	public void stationner() {
		System.out.println("Le vehicule se gare dans le parking");
	}
	
	public void afficher() {
		System.out.println("Matricule:"+matricule+",Marque:"+marque+".");
	}
}