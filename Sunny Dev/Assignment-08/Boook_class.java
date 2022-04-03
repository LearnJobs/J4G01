package com.example.demo1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Boook_class 
{
	@Id
	@GeneratedValue
	Integer bookid;
	String bookname;
	String bookauthor;
	public Boook_class() 
	{
		
	}
	@Override
	public String toString() 
	{
		return "Boook_class [bookid=" + bookid + ", bookname=" + bookname + ", bookauthor=" + bookauthor + "]";
	}
	public Boook_class(Integer bookid, String bookname, String bookauthor)
	{
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookauthor = bookauthor;
	}
	public Integer getBookid()
	{
		return bookid;
	}
	public void setBookid(Integer bookid) 
	{
		this.bookid = bookid;
	}
	public String getBookname() 
	{
		return bookname;
	}
	public void setBookname(String bookname) 
	{
		this.bookname = bookname;
	}
	public String getBookauthor() 
	{
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) 
	{
		this.bookauthor = bookauthor;
	}
	
	

}