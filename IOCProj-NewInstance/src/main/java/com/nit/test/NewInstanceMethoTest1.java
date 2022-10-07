package com.nit.test; 

import java.lang.reflect.Constructor;

public class NewInstanceMethoTest1 {

	public static void main(String[] args)throws Exception {
		//Load classes
		Class c1=Class.forName(args[0]);
	//Get all constructor of the loaded class
		Constructor cons[] = c1.getDeclaredConstructors();
		//Dynamic object using 0-param constructor
		Object object = cons[1].newInstance();
		System.out.println(object); 
		System.out.println("...........................");
		//Dynamic  object using 2-param constructor
		Object object2 = cons[0].newInstance(100,"india");
		System.out.println(object2);
		 
	}
}
