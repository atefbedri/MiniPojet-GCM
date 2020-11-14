package Entity;

import java.util.Date;

public class Hospitalisation extends Admission{
	
	int duree;

	public Hospitalisation(Date dateDebut, Date dateSortie, String medicinREsponsable, String observatiob) {
		super(dateDebut, dateSortie, medicinREsponsable, observatiob);
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}
}
