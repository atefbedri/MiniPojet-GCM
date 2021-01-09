package Entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DataBase.ConnectDatabase;
import Interfaces.CliniqueInterface;

public class Clinique implements CliniqueInterface{
	
	int id;
	String nom;
	String adresse;
	int nbreChambre;
	private final Chambre chambre;
	
	Statement statement = null;
	ConnectDatabase conn = new ConnectDatabase();
	Connection connexion= conn.ConnecterDB();
	public Clinique(int id, String nom, String adresse, int nbreChambre) {
		super();
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		this.nbreChambre = nbreChambre;
		chambre = new Chambre();
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
	
	public Chambre getChambre() {
		return chambre;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getNbreChambre() {
		return nbreChambre;
	}
	public void setNbreChambre(int nbreChambre) {
		this.nbreChambre = nbreChambre;
	}

	@Override
	public ArrayList<Clinique> getClinique() {
		try {
			statement = connexion.createStatement();
	        ResultSet resultat = statement.executeQuery( "SELECT *  clinique" );
	        ArrayList<Clinique> rslt = new ArrayList<Clinique>();
	        while(resultat.next())  
	        	System.out.println(resultat.getString(1)+"  "+resultat.getString(2)+"  "+resultat.getString(3));  
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean createClinique(Clinique clinique) {
		String sql = "INSERT INTO clinique (idClinique, nomClinique, adresse, nbreChambre, idChambre) VALUES (?, ?, ?, ?, ?)";
		try {
	        PreparedStatement pStatement = connexion.prepareStatement(sql);
	        pStatement.setLong(1, clinique.getId());
	        pStatement.setString(2, clinique.getNom());
	        pStatement.setString(3, clinique.getAdresse());
	        pStatement.setInt(4, clinique.getNbreChambre());
	        pStatement.setInt(5, clinique.getChambre().getNumero());
	        int rowsInserted = pStatement.executeUpdate();
	        if (rowsInserted > 0) {
	            System.out.println("A new clinique was inserted successfully!");
	        }
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteClinique(int num) {
		String sqlDelete = "DELETE FROM clinique WHERE idClinique=?";
        
        PreparedStatement dStatement;
		try {
			dStatement = connexion.prepareStatement(sqlDelete);
            dStatement.setLong(1, num);
             
            int rowsDeleted = dStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A Clinique was deleted successfully!");
            }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateClinique(Clinique clinique) {
		String sql2 = "UPDATE clinique SET nomClinique=?, adresse=?, nbreChambre=?, idChambre=? WHERE idClinique=?";
        
        PreparedStatement pstatement;
		try {
			pstatement = connexion.prepareStatement(sql2);
			pstatement.setLong(1, clinique.getId());
			pstatement.setString(2, clinique.getNom());
			pstatement.setString(3, clinique.getAdresse());
			pstatement.setInt(4, clinique.getNbreChambre());
			pstatement.setInt(5, clinique.getChambre().getNumero());
	         int rowsUpdated = pstatement.executeUpdate();
	         if (rowsUpdated > 0) {
	             System.out.println("An existing clinique was updated successfully!");
	         }

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Clinique findByidClinique(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
