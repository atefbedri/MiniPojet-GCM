package Entity;

public abstract class PersonneAdministratif extends Personne{

	public PersonneAdministratif(int cin, String nom, String prenom, String service, String sexe) {
		super(cin, nom, prenom, service,sexe);
	}

	@Override
	public String toString() {
		return "PersonneAdministratif [toString()=" + super.toString() + "]";
	}
	abstract void Afficher();

}
