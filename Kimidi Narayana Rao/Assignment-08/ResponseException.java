package com.example.demo;

import java.sql.Date;

public class ResponseException {
	private Date timestamp;
	private String message;
	private String details;
	
	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	


		public ResponseException(java.util.Date date, String message2, String description) {
			// TODO Auto-generated constructor stub
		}
	

}