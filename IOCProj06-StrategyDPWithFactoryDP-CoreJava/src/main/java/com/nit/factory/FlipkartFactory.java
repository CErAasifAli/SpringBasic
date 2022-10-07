package com.nit.factory;

import com.nit.comp.BlueDart;
import com.nit.comp.Courier;
import com.nit.comp.DTDC;
import com.nit.comp.Flipkart;

public class FlipkartFactory {
	//static factory method supporting Factory pattern
	public static Flipkart createFlipkart(String courierType) {
		//create  target class  obj 
		Flipkart fpkt=new Flipkart();
		Courier courier= null;
		//create dependent class based on given courier type
		if(courierType.equalsIgnoreCase("dtdc"))
			courier=new DTDC();
		else if(courierType.equalsIgnoreCase("bDart"))
		courier=new BlueDart();
		else
			throw new IllegalArgumentException("invalid courier type");
		//set Dependent class  object to get target class obj
		fpkt.setCourier(courier);
		return fpkt;
			
	}

}
