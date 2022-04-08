package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.library.beans.Book;
import com.library.beans.IssueBook;

public class BookDAO {
	public static int addBook(Book book)
	{
		int bookStatus=0;
		try {
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("insert into books values(?,?,?,?,?,?)");
			preparedStatement.setString(1, book.getCallNo());
			preparedStatement.setString(2, book.getBookName());
			preparedStatement.setString(3, book.getBookAuthor());
			preparedStatement.setString(4, book.getBookPublisher());
			preparedStatement.setInt(5, book.getBookQuantity());
			preparedStatement.setInt(6, book.getBookIssued());
			bookStatus = preparedStatement.executeUpdate();
			connection.close();
		}
		catch (Exception e) {
			System.err.println(e);
		}
		return bookStatus;
	}
	
	public static List<Book> viewAllBooks()
	{
		List<Book> bookList = new ArrayList<Book>();
		try {
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from books");
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next())
			{
				Book book = new Book();
				book.setCallNo(resultSet.getString("callno"));
				book.setBookName(resultSet.getString("name"));
				book.setBookAuthor(resultSet.getString("author"));
				book.setBookPublisher(resultSet.getString("publisher"));
				book.setBookQuantity(resultSet.getInt("quantity"));
				book.setBookIssued(resultSet.getInt("issued"));
				bookList.add(book);
			}
			connection.close();
		}
		catch (Exception e) {
			System.err.println(e);
		}
		return bookList;
	}
	
	public static int deleteBookById(String callNo)
	{
		int bookStatus=0;
		try{
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("delete from books where callno=?");
			preparedStatement.setString(1,callNo);
			bookStatus = preparedStatement.executeUpdate();
			connection.close();	
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		return bookStatus;
	}
	
	public static int getBookIssued(String callNo)
	{
		int bookIssued=0;
		try{
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from books where callno=?");
			preparedStatement.setString(1,callNo);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next())
				bookIssued = resultSet.getInt("issued");
			connection.close();
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		return bookIssued;
	}
	
	public static boolean checkBookIssue(String callNo){
		boolean bookIssueStatus = false;
		try{
			Connection connection = DatabaseConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from books where callno=? and quantity>issued");
			preparedStatement.setString(1,callNo);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next())
				bookIssueStatus = true;
			connection.close();
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		return bookIssueStatus;
	}
	
	public static int issueBook(IssueBook issue_book){
		String callNo = issue_book.getCallNo();
		boolean checkstatus=checkBookIssue(callNo);
		System.out.println("Check status: "+checkstatus);
		if(checkstatus)
		{
			int status=0;
			try{
				Connection connection = DatabaseConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement("insert into issuebook values(?,?,?,?,?,?)");
				preparedStatement.setString(1,issue_book.getCallNo());
				preparedStatement.setString(2,issue_book.getStudentId());
				preparedStatement.setString(3,issue_book.getStudentName());
				preparedStatement.setLong(4,issue_book.getStudentMobileNo());
				java.sql.Date currentDate=new java.sql.Date(System.currentTimeMillis());
				preparedStatement.setDate(5,currentDate);
				preparedStatement.setString(6,"no");

				status=preparedStatement.executeUpdate();
				if(status>0)
				{
					PreparedStatement preparedStatement2 = connection.prepareStatement("update books set issued=? where callno=?");
					preparedStatement2.setInt(1,getBookIssued(callNo)+1);
					preparedStatement2.setString(2,callNo);
					status = preparedStatement2.executeUpdate();
				}
				connection.close();
			}
			catch(Exception e)
			{
				System.err.println(e);
			}
			return status;
		}
		else
		{
			return 0;
		}
	}
	
	public static int returnBook(String callNo,int studentId)
	{
		int returnStatus=0;
			try{
				Connection connection = DatabaseConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement("update issuebook set returnstatus='yes' where callno=? and studentid=?");
				preparedStatement.setString(1,callNo);
				preparedStatement.setInt(2,studentId);
				
				returnStatus = preparedStatement.executeUpdate();
				if(returnStatus>0)
				{
					PreparedStatement preparedStatement2 = connection.prepareStatement("update books set issued=? where callno=?");
					preparedStatement2.setInt(1,getBookIssued(callNo)-1);
					preparedStatement2.setString(2,callNo);
					returnStatus = preparedStatement2.executeUpdate();
				}
				connection.close();
			}
			catch(Exception e)
			{
				System.err.println(e);
			}
			return returnStatus;
	}
	
	public static List<IssueBook> viewIssuedBooks(){
		List<IssueBook> issueBookList=new ArrayList<IssueBook>();
		try{
			Connection connection=DatabaseConnection.getConnection();
			PreparedStatement preparedStatement=connection.prepareStatement("select * from issuebook order by issueddate desc");
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next())
			{
				IssueBook issueBook = new IssueBook();
				issueBook.setCallNo(resultSet.getString("callno"));
				issueBook.setStudentId(resultSet.getString("studentid"));
				issueBook.setStudentName(resultSet.getString("studentname"));
				issueBook.setStudentMobileNo(resultSet.getLong("studentmobile"));
				issueBook.setIssueDate(resultSet.getDate("issueddate"));
				issueBook.setReturnStatus(resultSet.getString("returnstatus"));
				issueBookList.add(issueBook);
			}
			connection.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return issueBookList;
	}
}
