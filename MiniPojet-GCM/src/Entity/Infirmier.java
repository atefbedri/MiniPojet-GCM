package Entity;

public class Infirmier extends PersonneMedical{
	
	String specialité;
	
	public Infirmier(int cin, String nom, String prenom, String service) {
		super(cin, nom, prenom, service);
	}

	public String getSpecialité() {
		return specialité;
	}

	public void setSpecialité(String specialité) {
		this.specialité = specialité;
	}
	
	
	
}
