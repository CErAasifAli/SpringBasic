package com.nit.test;

import com.nit.comp.Car;
import com.nit.comp.LuxuryCar;
import com.nit.factory.Carfactory;

public class BussinessManCustomer3{
	public static void main(String[] args) {
		//get Car obj using factory
		Car car=Carfactory.createCar("luxury", "TS08 EN 6688");
		car.driver();
		System.out.println("----------------");
	}
}
 