package Entity;

public class Dossier {
	
	int idDossier;
	String typeDossier;
	
	public Dossier(int idDossier, String typeDossier) {
		super();
		this.idDossier = idDossier;
		this.typeDossier = typeDossier;
	}
	
	public int getIdDossier() {
		return idDossier;
	}
	public void setIdDossier(int idDossier) {
		this.idDossier = idDossier;
	}
	public String getTypeDossier() {
		return typeDossier;
	}
	public void setTypeDossier(String typeDossier) {
		this.typeDossier = typeDossier;
	}

	@Override
	public String toString() {
		return "Dossier [idDossier=" + idDossier + ", typeDossier=" + typeDossier + "]";
	}
	
	
	
}
