package Entity;

public class Clinique {
	
	int id;
	String nom;
	String adresse;
	int nbreChambre;
	private final Chambre chambre;
	public Clinique(int id, String nom, String adresse, int nbreChambre) {
		super();
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		this.nbreChambre = nbreChambre;
		chambre = new Chambre();
	}
	
	
	public Chambre getChambre() {
		return chambre;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getNbreChambre() {
		return nbreChambre;
	}
	public void setNbreChambre(int nbreChambre) {
		this.nbreChambre = nbreChambre;
	}
	
	
	
}
