package Entity;

import java.util.Date;

public class Patient extends Personne{

	private Date dateNaissance = new Date();
	private String sexe;
	
	public Patient(int cin, String nom, String prenom, String service, Date dateNaissance, String sexe) {
		super(cin, nom, prenom, service);
		this.dateNaissance = dateNaissance;
		this.sexe = sexe;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	@Override
	public String toString() {
		return "Patient [dateNaissance=" + dateNaissance + ", sexe=" + sexe + ", toString()=" + super.toString() + "]";
	}
}
