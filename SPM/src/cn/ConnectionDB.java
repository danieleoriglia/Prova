package cn;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;



public class ConnectionDB {

	
	public static void main(String[] args) throws SQLException {
		ConnectionDB ob_ConnectionDB = new ConnectionDB();
		
		System.out.println(ob_ConnectionDB.getConnection());
		}
		
		//Connection cn = null;
		Statement stmt;
		 ResultSet rs;
	public Connection getConnection(){
		Connection cn = null;
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//.newInstance()
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/spm?serverTimezone=UTC" ,"root", "");
			if(!cn.isClosed())
				System.out.println("Connessione riuscita con MYSQL");
			
			  stmt = cn.createStatement();
			 
						  
		} catch (ClassNotFoundException e) {
		    e.printStackTrace();
		  } catch (SQLException e) {
		    e.printStackTrace();
		  }
		 
		 
	
		return cn;
	}
	  public String hash(String password) throws NoSuchAlgorithmException {

	        MessageDigest md = MessageDigest.getInstance("MD5");
	        byte[] hashInBytes = md.digest(password.getBytes(StandardCharsets.UTF_8));

	        StringBuilder sb = new StringBuilder();
	        for (byte b : hashInBytes) {
	            sb.append(String.format("%02x", b));
	        }
	        return(sb.toString());

	 }

		
	}// fine main

