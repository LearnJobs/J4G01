package com.library.dao;

 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.library.beans.Librarian;

public class LibrarianDAO {
	public static int addLibrarian(Librarian librarian)
	{
		int librarianStatus=0;
		try{
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement("insert into librarian(name,email,password,mobile) values(?,?,?,?)");
			preparedStatement.setString(1,librarian.getLibrarianName());
			preparedStatement.setString(2,librarian.getLibrarianEmail());
			preparedStatement.setString(3,librarian.getLibrarianPassword());
			preparedStatement.setLong(4,librarian.getLibrarianMobileNo());
			librarianStatus = preparedStatement.executeUpdate();
			connection.close();
		}catch(Exception e){System.out.println(e);}
		return librarianStatus;
	}
	
	public static int updateLibrarian(Librarian librarian)
	{
		int librarianStatus=0;
		try{
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("update librarian set name=?,email=?,password=?,mobile=? where id=?");
			preparedStatement.setString(1,librarian.getLibrarianName());
			preparedStatement.setString(2,librarian.getLibrarianEmail());
			preparedStatement.setString(3,librarian.getLibrarianPassword());
			preparedStatement.setLong(4,librarian.getLibrarianMobileNo());
			preparedStatement.setInt(5,librarian.getLibrarianId());
			librarianStatus = preparedStatement.executeUpdate();
			connection.close();
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		return librarianStatus;
	}
	
	public static List<Librarian> viewLibrarians()
	{
		List<Librarian> librarianList = new ArrayList<Librarian>();
		try{
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from librarian");
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next())
			{
				Librarian librarian = new Librarian();
				librarian.setLibrarianId(resultSet.getInt("id"));
				librarian.setLibrarianName(resultSet.getString("name"));
				librarian.setLibrarianEmail(resultSet.getString("email"));
				librarian.setLibrarianPassword(resultSet.getString("password"));
				librarian.setLibrarianMobileNo(resultSet.getLong("mobile"));
				librarianList.add(librarian);
			}
			connection.close();
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		return librarianList;
	}
	
	public static Librarian viewById(int id)
	{
		Librarian librarian = new Librarian();
		try{
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from librarian where id=?");
			preparedStatement.setInt(1,id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next())
			{
				librarian.setLibrarianId(resultSet.getInt(1));
				librarian.setLibrarianName(resultSet.getString(2));
				librarian.setLibrarianPassword(resultSet.getString(3));
				librarian.setLibrarianEmail(resultSet.getString(4));
				librarian.setLibrarianMobileNo(resultSet.getLong(5));
			}
			connection.close();	
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		return librarian;
	}
	
	public static int deleteLibrarian(int id)
	{
		int librarianStatus=0;
		try{
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("delete from librarian where id=?");
			preparedStatement.setInt(1,id);
			librarianStatus = preparedStatement.executeUpdate();
			connection.close();
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		return librarianStatus;
	}

	public static boolean authenticateLibrarian(String email,String password)
	{
		boolean authenticateStatus=false;
		try{
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from librarian where email=? and password=?");
			preparedStatement.setString(1,email);
			preparedStatement.setString(2,password);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next())
				authenticateStatus = true;
			connection.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return authenticateStatus;
	}
}
 
