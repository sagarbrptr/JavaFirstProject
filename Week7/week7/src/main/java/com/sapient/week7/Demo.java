package com.sapient.week7;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
class EmployeeNotFoundException extends Exception{
	
}
public class Demo
{
	public static Employee getFromMap(String keyId) throws EmployeeNotFoundException	
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Map<String,Employee> map = (Map<String,Employee>)context.getBean("employeelist");
		Employee emp = map.get(keyId);
		if(emp==null)
			throw new EmployeeNotFoundException();
		else
			return emp;
	}
    public static void main( String[] args )
    {
    	
//    	BeanFactory factory = new XmlBeanFactory(new FileSystemResource("bean.xml"));
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
