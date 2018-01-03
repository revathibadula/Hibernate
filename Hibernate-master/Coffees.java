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

import com.actionbazaar.persistence.Bid;

@Entity
@Table(name="coffees")
public class Coffees implements Serializable{
@Id
@Column(name="COF_NAME")
private  String cofname;


@Column(name="PRICE")
private  float price;

@Column(name="SALES")
private  int sales;

@Column(name="TOTAL")
private  int total;



public Coffees()
{
}

public Coffees(String cofname,  float price, int sales, int total) {
	super();
	this.cofname = cofname;
	
	this.price = price;
	this.sales = sales;
	this.total = total;
}





public String getCofname() {
	return cofname;
}

public void setCofname(String cofname) {
	this.cofname = cofname;
}



public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public int getSales() {
	return sales;
}

public void setSales(int sales) {
	this.sales = sales;
}

public int getTotal() {
	return total;
}

public void setTotal(int total) {
	this.total = total;
}



}




