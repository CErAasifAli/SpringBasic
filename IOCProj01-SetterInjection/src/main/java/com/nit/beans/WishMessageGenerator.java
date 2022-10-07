package com.nit.beans;

import java.util.Date;
import java.util.Objects;

public class WishMessageGenerator {
	//HAS-A property(Supporting composition)
	private Date date;
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::0-param constructor");
	}
	//Setter method for setter injection 
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate(-)");
		this.date = date;
	}
	
	//B.method
	public String generateMessage(String user) {
		System.out.println("WishMessageGenerator.generateMessage()");
		//get current hour of the day
		int hour= date.getHours();//24 hour formats(0 to 23)
		//generate  wish message
		if (hour<6) {
			return"Good Night::"+user;
		}
		if (hour<12)
			return"Good Morning::"+user;
		else if(hour<16)
			return"Good AfterNoon::"+user;
		else if(hour<20)
			return"Good Evening::"+user;
		else 
			return"Good Night::"+user;
	}//method
	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(date);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WishMessageGenerator other = (WishMessageGenerator) obj;
		return Objects.equals(date, other.date);
	}
	
	
	
}	//class
	
		



