package com.nit.test;

import com.nit.comp.Flipkart;
import com.nit.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		try {
			//get target class  object from factory
			Flipkart fpkt= FlipkartFactory.createFlipkart("bDart");
			//invoke the b.method
			String result=fpkt.shopping(new String[] {"shirt","trouser","mobile"},
					new float[] {3400.0f,5600.0f,60000.0f});
			 System.out.println(result);
		}//try
		catch (Exception e) {
			e.printStackTrace();
		}//catch

	}//main 

}//class 
