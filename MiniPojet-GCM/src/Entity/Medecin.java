package Entity;

public class Medecin extends PersonneMedical{

	String specialit�;

	public Medecin(int cin, String nom, String prenom, String service) {
		super(cin, nom, prenom, service);
	}
	
	public String getSpecialit�() {
		return specialit�;
	}

	public void setSpecialit�(String specialit�) {
		this.specialit� = specialit�;
	}

}
