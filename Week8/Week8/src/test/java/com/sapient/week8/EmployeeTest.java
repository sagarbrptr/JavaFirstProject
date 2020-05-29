package com.sapient.week8;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeeTest {
	
	public static AddEmployee obj;
	
	@BeforeClass
	public static void initialize()
	{
		obj = new AddEmployee();
		
	}
	
	@Test
	public void addEmployeeTest()
	{
		Employee e = new Employee(1,"Sagar","Pune");
		obj.addEmployee(e);
		assertEquals(obj.getList().contains(e),true);
	}
	
	@Test
	public void findEmployeeTest()
	{
		Employee e = new Employee(2,"Akshat","Pune");
		obj.addEmployee(e);
		Employee employee = obj.getEmployee(2);
		assertEquals(employee,e);
	}
}
