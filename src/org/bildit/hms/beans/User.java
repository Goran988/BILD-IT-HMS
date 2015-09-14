package org.bildit.hms.beans;

import java.util.ArrayList;
import java.util.Date;

/**
 * 
 * @author Goran M
 *
 */
public class User {
	// data fields
	private String firstName;
	private String lastName;
	private char gender;
	private String idNumber;
	private short age;
	private int roomNumber;
	private Date checkInDate;
	private Date checkOutDate;
	private String username;
	private String userPassword;
	private boolean isActiveGuest;
	private boolean isLogged;
	private byte role;
	private ArrayList<Service> list;

	// default constructor
	public User() {

	}

	// constructor that sets values for datafields
	public User(String firstName, String lastName, char gender,
			String idNumber, short age, int roomNumber,
			String username, String userPassword, byte role) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.idNumber = idNumber;
		this.age = age;
		this.roomNumber = roomNumber;
		this.username = username;
		this.userPassword = userPassword;
		this.checkInDate = new Date();
		this.role = role;
		// by registering a new user assume he will be a guest for the time
		// being
		isActiveGuest = true;
	}

	public final Date getCheckInDate() {
		return checkInDate;
	}

	public final void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public final Date getCheckOutDate() {
		return checkOutDate;
	}

	public final void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public final boolean isActiveGuest() {
		return isActiveGuest;
	}

	public final void setActiveGuest(boolean isActiveGuest) {
		this.isActiveGuest = isActiveGuest;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public boolean isLogged() {
		return isLogged;
	}

	public void setLogged(boolean isLogged) {
		this.isLogged = isLogged;
	}

	public byte getRole() {
		return role;
	}

	public void setRole(byte role) {
		this.role = role;
	}

	public ArrayList<Service> getList() {
		return list;
	}

	public void setList(ArrayList<Service> list) {
		this.list = list;
	}

	// overriden toString method
	public String toString() {
		if (role == 0)
			return "Admin name: " + firstName + ", user name: " + username;

		else
			return "Guest name: " + firstName + ", user name: " + username
					+ ", room number: " + roomNumber;
	}
}