package com.nit.test;

import org.springframework.aop.support.DefaultBeanFactoryPointcutAdvisor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.nit.beans.WishMessageGenerator;

public class ConstructorInjectionTest2 {
	
	public static void main(String[] args) {
		//create IOC container
		DefaultListableBeanFactory factory =new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader =new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nit/test/cnfgs/applicationContext.xml");
		
		WishMessageGenerator generator =factory.getBean ("wmg",WishMessageGenerator.class); 
	
		String result = generator.generateMessage("asif");
		 
		System.out.println("wish msg:: "+result);
		
	}
	
}
