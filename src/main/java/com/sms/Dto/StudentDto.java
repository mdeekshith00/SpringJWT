package com.sms.dto;


public class StudentDto {
	
	private String sname;
	
	private String eMail;

	private String adress;

	private int sMarks;

	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDto(String sname, String eMail, String adress, int sMarks) {
		super();
		this.sname = sname;
		this.eMail = eMail;
		this.adress = adress;
		this.sMarks = sMarks;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getsMarks() {
		return sMarks;
	}

	public void setsMarks(int sMarks) {
		this.sMarks = sMarks;
	}

	@Override
	public String toString() {
		return "StudentDto [sname=" + sname + ", eMail=" + eMail + ", adress=" + adress + ", sMarks=" + sMarks + "]";
	}
	
	

}
