package Entity;

import java.util.Date;

public class Admission {
	
	Date dateDebut = new Date();
	Date dateSortie = new Date();
	String medicinREsponsable;
	String observatiob;
	
	public Admission(Date dateDebut, Date dateSortie, String medicinREsponsable, String observatiob) {
		super();
		this.dateDebut = dateDebut;
		this.dateSortie = dateSortie;
		this.medicinREsponsable = medicinREsponsable;
		this.observatiob = observatiob;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	public String getMedicinREsponsable() {
		return medicinREsponsable;
	}

	public void setMedicinREsponsable(String medicinREsponsable) {
		this.medicinREsponsable = medicinREsponsable;
	}

	public String getObservatiob() {
		return observatiob;
	}

	public void setObservatiob(String observatiob) {
		this.observatiob = observatiob;
	}

	@Override
	public String toString() {
		return "Admission [dateDebut=" + dateDebut + ", dateSortie=" + dateSortie + ", medicinREsponsable="
				+ medicinREsponsable + ", observatiob=" + observatiob + "]";
	}
	
	

}
