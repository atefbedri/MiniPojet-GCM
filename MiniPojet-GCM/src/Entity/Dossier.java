package Entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DataBase.ConnectDatabase;
import Interfaces.DossierInterface;

public class Dossier implements DossierInterface{
	
	int idDossier;
	String typeDossier;
	
	Statement statement = null;
	ConnectDatabase conn = new ConnectDatabase();
	Connection connexion= conn.ConnecterDB();
	public Dossier(int idDossier, String typeDossier) {
		super();
		this.idDossier = idDossier;
		this.typeDossier = typeDossier;
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

	@Override
	public ArrayList<Dossier> getDossier() {
		try {
			statement = connexion.createStatement();
	        ResultSet resultat = statement.executeQuery( "SELECT *  FROM dossier" );
	        ArrayList<Dossier> rslt = new ArrayList<Dossier>();
	        while(resultat.next())  
	        	System.out.println(resultat.getString(1)+"  "+resultat.getString(2)+"  "+resultat.getString(3));  
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}

	@Override
	public boolean createDossier(Dossier dossier) {
		String sql = "INSERT INTO dossier (	idDossier, typeDossier) VALUES (?, ?)";
		try {
	        PreparedStatement pStatement = connexion.prepareStatement(sql);
	        pStatement.setLong(1, dossier.getIdDossier());
	        pStatement.setString(2, dossier.getTypeDossier());
	        int rowsInserted = pStatement.executeUpdate();
	        if (rowsInserted > 0) {
	            System.out.println("A new dossier was inserted successfully!");
	        }
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteDossier(int num) {
		String sqlDelete = "DELETE FROM dossier WHERE idDossier=?";
        
        PreparedStatement dStatement;
		try {
			dStatement = connexion.prepareStatement(sqlDelete);
            dStatement.setLong(1, num);
             
            int rowsDeleted = dStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A dossier was deleted successfully!");
            }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateDossier(Dossier dossier) {
		String sql2 = "UPDATE dossier SET typeDossier=? WHERE idDossier=?";
        
        PreparedStatement pstatement;
		try {
			pstatement = connexion.prepareStatement(sql2);
			pstatement.setLong(1, dossier.getIdDossier());
			pstatement.setString(2, dossier.getTypeDossier());
	         int rowsUpdated = pstatement.executeUpdate();
	         if (rowsUpdated > 0) {
	             System.out.println("An existing dossier was updated successfully!");
	         }

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Dossier findByidDossier(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
