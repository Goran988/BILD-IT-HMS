package org.bildit.hms.beans;

/*
 * @author Goran Arsenic
 */
public class Room {
	
	private int number;
	private String type;
	private boolean occupied;
	private double costForNight;
	/**
	 * no-arg constructor
	 */
	public Room(){
		
	}
	/**
	 * Construct object with specified value.
	 * 
	 * @param number
	 * number of room, int value
	 * @param type
	 * type od room, String value
	 * @param occupied
	 * is room occupied, boolean value
	 * @param costForNight
	 * how much room cost for night, double value
	 */
	public Room(int number, String type, boolean occupied, double costForNight){
		this.number = number;
		this.type = type;
		this.occupied = occupied;
		this.costForNight = costForNight;
	}
	
	/* getters and setters */
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isOccupied() {
		return occupied;
	}
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	public double getCostForNight() {
		return costForNight;
	}
	public void setCostForNight(double costForNight) {
		this.costForNight = costForNight;
	}
	
	@Override
	public String toString() {
		return "Number: " + number + " Type: " + type + " Occupied: " + occupied + " Cost for night: " + costForNight;
	}
	
}
