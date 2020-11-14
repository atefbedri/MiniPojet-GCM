package Entity;

public class Facture {
	
	private int numero;
	private String assurance;
	private String nomPatient;
	private int montant;
	
	public Facture(int numero, String assurance, String nomPatient, int montant) {
		super();
		this.numero = numero;
		this.assurance = assurance;
		this.nomPatient = nomPatient;
		this.montant = montant;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAssurance() {
		return assurance;
	}

	public void setAssurance(String assurance) {
		this.assurance = assurance;
	}

	public String getNomPatient() {
		return nomPatient;
	}

	public void setNomPatient(String nomPatient) {
		this.nomPatient = nomPatient;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

}
