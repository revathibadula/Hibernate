package com.classicmodels.app;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="employees")
public class Employees implements Serializable{
@Id
@Column(name="employeeNumber")
private int empnum;

@Column(name="lastName")
private String lname;

@Column(name="firstName")
private String fname;

@Column(name="extension")
private int ext;


@Column(name="email")
private String mail;

@Column(name="officeCode")
private int offcode;

@Column(name="reportsTo")
private int report;


@Column(name="jobTitle")
private String jt;

public Employees()
{
	
}

public Employees(int empnum, String lname, String fname, int ext, String mail, int offcode, int report,
		String jt) {
	super();
	this.empnum = empnum;
	this.lname = lname;
	this.fname = fname;
	this.ext = ext;
	this.mail = mail;
	this.offcode = offcode;
	this.report = report;
	this.jt = jt;
}

public int getEmpnum() {
	return empnum;
}

public void setEmpnum(int empnum) {
	this.empnum = empnum;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public int getExt() {
	return ext;
}

public void setExt(int ext) {
	this.ext = ext;
}

public String getMail() {
	return mail;
}

public void setMail(String mail) {
	this.mail = mail;
}

public int getOffcode() {
	return offcode;
}

public void setOffcode(int offcode) {
	this.offcode = offcode;
}

public int getReport() {
	return report;
}

public void setReport(int report) {
	this.report = report;
}

public String getJt() {
	return jt;
}

public void setJt(String jt) {
	this.jt = jt;
}







}
