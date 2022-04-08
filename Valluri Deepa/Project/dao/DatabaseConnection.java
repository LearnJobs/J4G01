package com.library.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	public static Connection getConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");		//loading a driver i.e. type-4 driver for mysql
			System.out.println("Driver is loaded");
	
			// connect to the sql instance and database
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root","dimple");
			System.out.println("Connection established");
			return connection;
		}
		catch (ClassNotFoundException e) {
			System.err.println("Driver not configured");
			return null;
		}
		catch (SQLException e) {
			System.err.println("Connection not established");
			return null;
		}
	}
}
