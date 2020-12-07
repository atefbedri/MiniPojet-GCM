package Entity;

public class Infirmier extends PersonneMedical{
	
	String specialite;
	
	public Infirmier(int cin, String nom, String prenom, String service) {
		super(cin, nom, prenom, service);
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	@Override
	void Afficher() {
		System.out.println("Information Infermier");
		System.out.println("Nom : "+nom+" Prenom : "+prenom+" Cin : "+Cin+" Service : "+service+" Specialite : "+specialite);
	}
	
	
	
}
