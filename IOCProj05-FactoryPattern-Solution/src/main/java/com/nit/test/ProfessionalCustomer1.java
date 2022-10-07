package com.nit.test;

import com.nit.comp.BudgetCar;
import com.nit.comp.Car;
import com.nit.factory.Carfactory;

public class ProfessionalCustomer1 {
	public static void main(String[] args) {
		//get Car obj using factory
			Car car=Carfactory.createCar("budget", "TS08 EN 6688");
			car.driver();
			System.out.println("----------------");
		}
			
	}
  
