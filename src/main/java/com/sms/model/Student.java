package com.sms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
public class Student {
	@Id
	private int sid;
	@Column
	private String sname;
	@Column
	private String eMail;
	@Column
	private String adress;
	@Column
	private int sMarks;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int sid, String sname, String eMail, String adress, int sMarks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.eMail = eMail;
		this.adress = adress;
		this.sMarks = sMarks;
	}

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
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
		return "Student [sid=" + sid + ", sname=" + sname + ", eMail=" + eMail + ", adress=" + adress + ", sMarks="
				+ sMarks + "]";
	}
	
	
	
	
	
	
	
	
}
