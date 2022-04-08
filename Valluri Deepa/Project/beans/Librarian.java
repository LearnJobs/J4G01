package com.library.beans;

public class Librarian {
	private int librarianId;
	private String librarianName,librarianEmail,librarianPassword;
	private long librarianMobileNo;
	
	public Librarian() {
		 
	}

	public Librarian(int librarianId, String librarianName, String librarianEmail, String librarianPassword,
			long librarianMobileNo) {
		super();
		this.librarianId = librarianId;
		this.librarianName = librarianName;
		this.librarianEmail = librarianEmail;
		this.librarianPassword = librarianPassword;
		this.librarianMobileNo = librarianMobileNo;
	}

	public int getLibrarianId() {
		return librarianId;
	}

	public void setLibrarianId(int librarianId) {
		this.librarianId = librarianId;
	}

	public String getLibrarianName() {
		return librarianName;
	}

	public void setLibrarianName(String librarianName) {
		this.librarianName = librarianName;
	}

	public String getLibrarianEmail() {
		return librarianEmail;
	}

	public void setLibrarianEmail(String librarianEmail) {
		this.librarianEmail = librarianEmail;
	}

	public String getLibrarianPassword() {
		return librarianPassword;
	}

	public void setLibrarianPassword(String librarianPassword) {
		this.librarianPassword = librarianPassword;
	}

	public long getLibrarianMobileNo() {
		return librarianMobileNo;
	}

	public void setLibrarianMobileNo(long librarianMobileNo) {
		this.librarianMobileNo = librarianMobileNo;
	}
}
