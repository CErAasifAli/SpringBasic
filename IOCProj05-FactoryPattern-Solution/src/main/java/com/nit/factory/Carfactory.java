package com.nit.factory;

import com.nit.comp.BudgetCar;
import com.nit.comp.Car;
import com.nit.comp.LuxuryCar;
import com.nit.comp.SportsCar;

public class Carfactory {
	
	//Factory having factory pattern logic (Logic to create and return one of several related classes obj)
	public static  Car createCar(String type, String regNo) {
		if(type.equalsIgnoreCase("sports"))
			return new SportsCar(regNo);
		else if(type.equalsIgnoreCase("budget"))
			return new BudgetCar(regNo);
		else if(type.equalsIgnoreCase("luxury"))
			return new LuxuryCar(regNo);
		else
			throw new IllegalArgumentException("Invalid car Type");
	}
}
