package fr.adaming.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import fr.adaming.util.ConnectionDB;

public class ConnectionDB {
	
	private static final String url = "jdbc:mysql://localhost:3306/bibliotheque";
	private static final String user = "root";
	private static final String password = "";

	private static Connection connect;

	public ConnectionDB() throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(url, user, password);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws ClassNotFoundException {
		if (connect == null) {
			new ConnectionDB();
			System.out.println("Ouverture d'une nouvelle connexion");
		}
		else {
			System.out.println("Une connexion existe déjà");
		}
		return connect;
	}
	
	public static void closeConnection() {
		try {
			connect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	


}
