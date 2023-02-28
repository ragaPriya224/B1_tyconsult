package com.tyconsult.jdbcDemo;

//model
public class Persons {
	private int personID;
	private String firstName;
	private String lastName;
	private String address;
	private String town;
	//getter & setter
	public int getPersonID() {
		return personID;
	}
	public void setPersonID(int personID) {
		this.personID = personID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
//constructors 
	public Persons(int personID,  String lastName, String firstName,String address, String town) {
		super();
		this.personID = personID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.town = town;
	}
	public Persons() {
		
	}
	//override tostring
	@Override
	public String toString() {
		return "Persons [personID=" + personID + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", town=" + town + "]";
	}
	
	
	
	
}
