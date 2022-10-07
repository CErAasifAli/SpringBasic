package com.nit.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nit.beans.WishMessageGenerator;

public class SetterInjectionTest {
	
	public static void main(String[] args) {
		FileSystemResource fsr = new FileSystemResource("src/main/java/com/nit/cnfgs/applicationContext.xml");
	
		XmlBeanFactory factory = new XmlBeanFactory(fsr);
		
		Object obj  = factory.getBean("wmg");
		
		WishMessageGenerator generator = (WishMessageGenerator) obj;
	
		String result = generator.generateMessage("asif");
		
		System.out.println("wish msg:: "+result);
		
	}
	
}
