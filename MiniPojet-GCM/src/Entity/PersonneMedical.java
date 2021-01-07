package Entity;

public abstract class PersonneMedical extends Personne{

	public PersonneMedical(int cin, String nom, String prenom, String service, String sexe) {
		super(cin, nom, prenom, service,sexe);
	}

	@Override
	public String toString() {
		return "PersonneMedical [toString()=" + super.toString() + "]";
	}
	
	abstract void Afficher();

}
