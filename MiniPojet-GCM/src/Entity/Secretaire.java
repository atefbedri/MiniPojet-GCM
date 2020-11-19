package Entity;

public class Secretaire extends PersonneMedical{

	public Secretaire(int cin, String nom, String prenom, String service) {
		super(cin, nom, prenom, service);
	}

	@Override
	public String toString() {
		return "Secretaire [toString()=" + super.toString() + "]";
	}

}
