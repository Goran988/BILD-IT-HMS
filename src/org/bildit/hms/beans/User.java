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
	private char roomType;
	private Date timeRegistered;
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
			String idNumber, short age, int roomNumber, char roomType,
			String username, String userPassword, byte role) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.idNumber = idNumber;
		this.age = age;
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.username = username;
		this.userPassword = userPassword;
		this.timeRegistered = new Date();
		this.role = role;
		// by registering a new user assume he will be a guest for the time being
		isActiveGuest = true;
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

	public char getRoomType() {
		return roomType;
	}

	public void setRoomType(char roomType) {
		this.roomType = roomType;
	}

	public Date getTimeRegistered() {
		return timeRegistered;
	}

	public void setTimeRegistered(Date timeRegistered) {
		this.timeRegistered = timeRegistered;
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