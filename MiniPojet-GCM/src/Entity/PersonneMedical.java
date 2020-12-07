package Entity;

public abstract class PersonneMedical extends Personne{

	public PersonneMedical(int cin, String nom, String prenom, String service) {
		super(cin, nom, prenom, service);
	}

	@Override
	public String toString() {
		return "PersonneMedical [toString()=" + super.toString() + "]";
	}
	
	abstract void Afficher();

}
