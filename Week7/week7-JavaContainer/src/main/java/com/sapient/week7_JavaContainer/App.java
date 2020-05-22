package com.sapient.week7_JavaContainer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


class EmployeeNotFoundException extends Exception{
	
}

public class App 
{
	public static Employee getFromMap(String keyId) throws EmployeeNotFoundException	
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaContainer.class);
		Map<String,Employee> map = (Map<String,Employee>)context.getBean(HashMap.class);
		Employee emp = map.get(keyId);
		if(emp==null)
			throw new EmployeeNotFoundException();
		else
			return emp;
		
	}
    public static void main( String[] args )
    {
//		ApplicationContext context = new AnnotationConfigApplicationContext(JavaContainer.class);
//    	Employee emp = context.getBean(Employee.class);
    	System.out.println("Enter employee code : ");
    	Scanner scanner = new Scanner(System.in);
    	String key = scanner.next();
    	Employee emp;
    	try {
    		emp = getFromMap(key);
    		System.out.println( emp );
    	}
    	catch(EmployeeNotFoundException e)
    	{
    		System.out.println("Employee Not Found");
    	}
    }
}
