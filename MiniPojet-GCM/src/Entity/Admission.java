package Entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import Interfaces.AdmissionInterface;

public class Admission implements AdmissionInterface{
		
	Date dateDebut = new Date();
	Date dateSortie = new Date();
	String medicinREsponsable;
	String observation;
	
	public Admission(Date dateDebut, Date dateSortie, String medicinREsponsable, String observation) {
		super();
		this.dateDebut = dateDebut;
		this.dateSortie = dateSortie;
		this.medicinREsponsable = medicinREsponsable;
		this.observation = observation;
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

	public String getObservation() {
		return observation;
	}

	public void setObservatiob(String observation) {
		this.observation = observation;
	}

	@Override
	public String toString() {
		return "Admission [dateDebut=" + dateDebut + ", dateSortie=" + dateSortie + ", medicinREsponsable="
				+ medicinREsponsable + ", observatiob=" + observation + "]";
	}

	@Override
	public ArrayList<Admission> getAdmission() {
		return null;
	}

	@Override
	public boolean createAdmission(Admission admission) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAdmission(Admission admission) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAdmission(Admission admission) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Admission findByidAdmission(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
