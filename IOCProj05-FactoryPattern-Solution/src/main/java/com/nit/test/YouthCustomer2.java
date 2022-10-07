package com.nit.test;

import com.nit.comp.BudgetCar;
import com.nit.comp.Car;
import com.nit.factory.Carfactory;

public class YouthCustomer2 {
	public static void main(String[] args) {
		//get Car obj using factory
		Car car=Carfactory.createCar("sports", "TS08 EN 6688");
		car.driver();
		System.out.println("----------------");
	}
	
}
 