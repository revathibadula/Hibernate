package com.mainsample.app;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "suppliers")
public class Suppliers implements Serializable{

	@Id
	@Column(name ="SUP_ID")
	private int supid;
	
	@Column(name ="SUP_NAME")
	private String supname;
	
	@Column(name ="STREET")
	private String street;
	
	@Column(name ="CITY")
	private String city;
	
	@Column(name ="STATE")
	private String state;
	
	@Column(name ="ZIP")
	private int zip;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="SUP_ID")
	private Set<Coffees> cof;
	
	public Suppliers()
	{
		
	}

	public Suppliers(int supid, String supname, String street, String city, String state, int zip) {
		super();
		this.supid = supid;
		this.supname = supname;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	
	

	public Set<Coffees> getCof() {
		return cof;
	}

	public void setCof(Set<Coffees> cof) {
		this.cof = cof;
	}

	public int getSupid() {
		return supid;
	}

	public void setSupid(int supid) {
		this.supid = supid;
	}

	public String getSupname() {
		return supname;
	}

	public void setSupname(String supname) {
		this.supname = supname;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
	
	
	
	
	
	
	
	
	
	
}
