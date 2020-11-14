package Entity;

import java.util.Date;

public class Consultation extends Admission{
	
	String ordonnance;

	public Consultation(Date dateDebut, Date dateSortie, String medicinREsponsable, String observatiob) {
		super(dateDebut, dateSortie, medicinREsponsable, observatiob);
	}

	public String getOrdonnance() {
		return ordonnance;
	}

	public void setOrdonnance(String ordonnance) {
		this.ordonnance = ordonnance;
	}
	
	
	
	
}
