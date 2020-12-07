package Entity;

public class Medecin extends PersonneMedical{

	String specialite;

	public Medecin(int cin, String nom, String prenom, String service) {
		super(cin, nom, prenom, service);
	}
	
	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	@Override
	public String toString() {
		return "Medecin [specialité=" + specialite + ", Cin=" + Cin + ", nom=" + nom + ", prenom=" + prenom
				+ ", service=" + service + "]";
	}

	@Override
	void Afficher() {
		System.out.println("Information Infermier");
		System.out.println("Nom : "+nom+" Prenom : "+prenom+" Cin : "+Cin+" Service : "+service+" Specialite :  "+specialite);
	}
	
}
