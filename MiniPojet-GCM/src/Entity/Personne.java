package Entity;

public class Personne {

	int Cin;
	String nom;
	String prenom;
	String service;

	public Personne(int cin, String nom, String prenom, String service) {
		super();
		Cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.service = service;
	}
	
	
	public int getCin() {
		return Cin;
	}
	public void setCin(int cin) {
		Cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}


	@Override
	public String toString() {
		return "Personne [Cin=" + Cin + ", nom=" + nom + ", prenom=" + prenom + ", service=" + service + "]";
	}
	
	
	
}
