package Entity;

public abstract class PersonneAdministratif extends Personne{

	public PersonneAdministratif(int cin, String nom, String prenom, String service) {
		super(cin, nom, prenom, service);
	}

	@Override
	public String toString() {
		return "PersonneAdministratif [toString()=" + super.toString() + "]";
	}
	abstract void Afficher();

}
