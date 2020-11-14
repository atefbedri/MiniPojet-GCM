package Entity;

public class Medecin extends PersonneMedical{

	String specialité;

	public Medecin(int cin, String nom, String prenom, String service) {
		super(cin, nom, prenom, service);
	}
	
	public String getSpecialité() {
		return specialité;
	}

	public void setSpecialité(String specialité) {
		this.specialité = specialité;
	}

}
