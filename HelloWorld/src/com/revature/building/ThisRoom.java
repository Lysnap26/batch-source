package com.revature.building;
import java.util.Scanner;

//let's pretend this room is a rectangle... 
public class ThisRoom extends Room implements Rectangle {
	public ThisRoom(Double side1, Double side2, RoomType rt) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.type = rt;
	}
	public ThisRoom() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private Double side1;
	private Double side2;
	private String passcode = "12345";	
	
	public Double getSide1() {
		return side1;
	}
	public void setSide1(Double side1) throws ImpossibleRoomException {
		this.side1 = side1;
		if (side1.isNaN() || side1.isInfinite() || side1.doubleValue()==0.0) {
			throw new ImpossibleRoomException();
		}
		this.side1 = side1;
	}
	public Double getSide2()  {
		return side2;
	}
	public void setSide2(Double side2) throws ImpossibleRoomException {
		if (side2.isNaN() || side2.isInfinite() || side2.doubleValue()==0.0) {
			throw new ImpossibleRoomException();
		}
		
		this.side2 = side2;
	}
	
	public RoomType getType() {
		return this.type;
	}
	
	public void setType(RoomType type) {
		this.type = type;
	}
	
	@Override
	public void unlockDoor() {
		if (!this.isOpen) {
		//get passcode from user
			Scanner scanner = new Scanner(System.in);
			System.out.println("please enter the passcode");
			
			String passString = scanner.nextLine();
			//validate against the existing passcode
			if (passString.equals(this.passcode)) {
				this.isOpen = true;
				System.out.println("The door is locked");
			}
			else {
				System.out.println("Wrong code");
			}
			scanner.close();
		}
		else {
			System.out.println("Door is already unlocked!");
		}
	}
	
	public Double calculateArea() {
		Double area = this.side1 * this.side2;
		return area;
	}
	
	public Double calculatePerimeter() {
		return 2*this.side1 + 2*this.side2;
	}
	@Override
	public String toString() {
		return "ThisRoom [side1=" + side1 + ", side2=" + side2 + ", isOpen=" + isOpen + ", type=" + type + "]";
	}
	
	

}