package Entity;

import java.util.ArrayList;

public class DossierAdministratif extends Dossier{
	
	ArrayList<String> listAdmission = new ArrayList<String>();
	String Prestation;
	
	public DossierAdministratif(int idDossier, String typeDossier) {
		super(idDossier, typeDossier);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<String> getListAdmission() {
		return listAdmission;
	}

	public void setListAdmission(ArrayList<String> listAdmission) {
		this.listAdmission = listAdmission;
	}

	public String getPrestation() {
		return Prestation;
	}

	public void setPrestation(String prestation) {
		Prestation = prestation;
	}

	@Override
	public String toString() {
		return "DossierAdministratif [listAdmission=" + listAdmission + ", Prestation=" + Prestation + ", toString()="
				+ super.toString() + "]";
	}

	
	
}
