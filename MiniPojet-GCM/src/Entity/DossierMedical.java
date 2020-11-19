package Entity;

import java.util.Date;

public class DossierMedical extends Dossier{
	
	Date date = new Date();
	String Diagnostic;
	String traitement;
	String opertation;

	public DossierMedical(int idDossier, String typeDossier) {
		super(idDossier, typeDossier);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDiagnostic() {
		return Diagnostic;
	}

	public void setDiagnostic(String diagnostic) {
		Diagnostic = diagnostic;
	}

	public String getTraitement() {
		return traitement;
	}

	public void setTraitement(String traitement) {
		this.traitement = traitement;
	}

	public String getOpertation() {
		return opertation;
	}

	public void setOpertation(String opertation) {
		this.opertation = opertation;
	}

	@Override
	public String toString() {
		return "DossierMedical [date=" + date + ", Diagnostic=" + Diagnostic + ", traitement=" + traitement
				+ ", opertation=" + opertation + ", toString()=" + super.toString() + "]";
	}
	
	

}
