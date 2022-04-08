package com.library.beans;

import java.util.Date;

public class IssueBook {
	private String callNo,studentId,studentName;
	private long studentMobileNo;
	private Date issueDate;
	private String returnStatus;
	
	public IssueBook() {
		
	}

	public IssueBook(String callNo, String studentId, String studentName, long studentMobileNo, Date issueDate,
			String returnStatus) {
		super();
		this.callNo = callNo;
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMobileNo = studentMobileNo;
		this.issueDate = issueDate;
		this.returnStatus = returnStatus;
	}

	public String getCallNo() {
		return callNo;
	}

	public void setCallNo(String callNo) {
		this.callNo = callNo;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public long getStudentMobileNo() {
		return studentMobileNo;
	}

	public void setStudentMobileNo(long studentMobileNo) {
		this.studentMobileNo = studentMobileNo;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public String getReturnStatus() {
		return returnStatus;
	}

	public void setReturnStatus(String returnStatus) {
		this.returnStatus = returnStatus;
	}
	
	
}
