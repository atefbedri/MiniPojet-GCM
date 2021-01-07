package Entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import DataBase.ConnectDatabase;
import Interfaces.PersonneInterface;
public class Personne implements PersonneInterface{

	int Cin;
	String nom;
	String prenom;
	String service;
	String sexe;
	Statement statement = null;
	ConnectDatabase conn = new ConnectDatabase();
	Connection connexion= conn.ConnecterDB();
	
	public Personne() {
		
	}
	
	public Personne(int cin, String nom, String prenom, String service, String sexe) {
		super();
		Cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.service = service;
		this.sexe = sexe;
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
	
	public int getCin() {
		return Cin;
	}
	
	public void setCin(int cin) {
		Cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}


	@Override
	public String toString() {
		return "Personne [Cin=" + Cin + ", nom=" + nom + ", prenom=" + prenom + ", service=" + service + "]";
	}


	@Override
	public ArrayList<Personne> getPersonne(){
		try {
			statement = connexion.createStatement();
	        ResultSet resultat = statement.executeQuery( "SELECT *  FROM personne;" );
	        while(resultat.next())  
	        	System.out.println(resultat.getString(1)+"  "+resultat.getString(2)+"  "+resultat.getString(3));  
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public boolean createPersonne(Personne personne){
		String sql = "INSERT INTO personne (cin, nom, prenom, service, sexe) VALUES (?, ?, ?, ?, ?)";
		try {
	        PreparedStatement pStatement = connexion.prepareStatement(sql);
	        pStatement.setLong(1, personne.getCin());
	        pStatement.setString(2, personne.getNom());
	        pStatement.setString(3, personne.getPrenom());
	        pStatement.setString(4, personne.getService());
	        pStatement.setString(5, personne.getSexe());
	        int rowsInserted = pStatement.executeUpdate();
	        if (rowsInserted > 0) {
	            System.out.println("A new user was inserted successfully!");
	        }
		}catch(SQLException e) {
			e.printStackTrace();
		}
        
		return false;
	}


	@Override
	public boolean deletePersonne(int cin) {
		String sqlDelete = "DELETE FROM personne WHERE cin=?";
        
        PreparedStatement dStatement;
		try {
			dStatement = connexion.prepareStatement(sqlDelete);
            dStatement.setLong(1, cin);
             
            int rowsDeleted = dStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A user was deleted successfully!");
            }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}


	@Override
	public boolean updatePersonne(Personne personne) {
		 String sql2 = "UPDATE personne SET nom=?, prenom=?, service=?, sexe=? WHERE cin=?";
         
         PreparedStatement pstatement;
		try {
			pstatement = connexion.prepareStatement(sql2);
			pstatement.setString(1, personne.getNom());
			pstatement.setString(2, personne.getPrenom());
			pstatement.setString(3, personne.getService());
			pstatement.setString(4, personne.getSexe());
			pstatement.setLong(5, personne.getCin());
	         int rowsUpdated = pstatement.executeUpdate();
	         if (rowsUpdated > 0) {
	             System.out.println("An existing user was updated successfully!");
	         }

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
		return false;
	}
	@Override
	public boolean findByidPersonne(int cin) {
		return false;
	}
}
