package Entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DataBase.ConnectDatabase;
import Interfaces.FactureInterface;

public class Facture implements FactureInterface{
	
	private int numero;
	private String assurance;
	private String nomPatient;
	private int montant;
	private int idPatient;
	private int idAdmin;
	
	Statement statement = null;
	ConnectDatabase conn = new ConnectDatabase();
	Connection connexion= conn.ConnecterDB();
	
	public Facture(int numero, String assurance, String nomPatient, int montant, int idPatient, int idAdmin) {
		super();
		this.numero = numero;
		this.assurance = assurance;
		this.nomPatient = nomPatient;
		this.montant = montant;
		this.idPatient = idPatient;
		this.idAdmin = idAdmin;
	}
	
	public Connection ConnecterDB(){
		try{  
			Class.forName("com.mysql.jdbc.Driver"); 
			 connexion = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/gestionclinique?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
			if (connexion != null) {
		        System.out.println("Connected");
		    }
			return connexion;	        	
			}catch(Exception e){ 
				System.out.println(e);
				return null;
			}
	}
	
	public int getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}

	public int getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}


	public Facture(int numero, String assurance, String nomPatient, int montant, int idPatient, int idAdmin,
			Statement statement, ConnectDatabase conn, Connection connexion) {
		super();
		this.numero = numero;
		this.assurance = assurance;
		this.nomPatient = nomPatient;
		this.montant = montant;
		this.idPatient = idPatient;
		this.idAdmin = idAdmin;
		this.statement = statement;
		this.conn = conn;
		this.connexion = connexion;
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

	@Override
	public ArrayList<Facture> getDossier() {
		try {
			statement = connexion.createStatement();
	        ResultSet resultat = statement.executeQuery( "SELECT *  FROM facture" );
	        ArrayList<Personne> rslt = new ArrayList<Personne>();
	        while(resultat.next())  
	        	System.out.println(resultat.getString(1)+"  "+resultat.getString(2)+"  "+resultat.getString(3));  
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}

	@Override
	public boolean createFacture(Facture facture) {
		String sql = "INSERT INTO facture (numFacture, assurance, nomPatient, montant, idPatient, idPersonAdmin) VALUES (?, ?, ?, ?, ?, ?)";
		try {
	        PreparedStatement pStatement = connexion.prepareStatement(sql);
	        pStatement.setLong(1, facture.getNumero());
	        pStatement.setString(2, facture.getAssurance());
	        pStatement.setString(3, "atef");
	        pStatement.setDouble(4, facture.getMontant());
	        pStatement.setInt(5, 1);
	        pStatement.setInt(6, 1);
	        int rowsInserted = pStatement.executeUpdate();
	        if (rowsInserted > 0) {
	            System.out.println("A new facture was inserted successfully!");
	        }
		}catch(SQLException e) {
			e.printStackTrace();
		}
        
		return false;
	}

	@Override
	public boolean deleteFacture(int num) {
		String sqlDelete = "DELETE FROM facture numeroFacture=?";
        
        PreparedStatement dStatement;
		try {
			dStatement = connexion.prepareStatement(sqlDelete);
            dStatement.setLong(1, num);
             
            int rowsDeleted = dStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A facture was deleted successfully!");
            }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateFacture(Facture facture) {
 String sql2 = "UPDATE facture set assurance=?, nomPatient=?, montant=?, idPatient=?, idPersonAdmin=? WHERE numFacture=?";
         
         PreparedStatement pstatement;
		try {
			pstatement = connexion.prepareStatement(sql2);
			pstatement.setString(1, facture.getAssurance());
	        pstatement.setString(2, "atef");
			pstatement.setDouble(3, facture.getMontant());
			pstatement.setInt(4, 1);
			pstatement.setInt(5, 1);
	        pstatement.setLong(6, facture.getNumero());

	         int rowsUpdated = pstatement.executeUpdate();
	         if (rowsUpdated > 0) {
	             System.out.println("An existing facture was updated successfully!");
	         }

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Facture findByidFacture(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
