package com.sapient.week7_JavaContainer;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//@EnableAspectJAutoProxy
public class JavaContainer {
	
	@Bean
	public Employee f1()
	{
		return new Employee(4,"Tejas","Pune");
	}
	
	@Bean
	public Map<String,Employee> getMap()
	{
		Map<String,Employee> map = new HashMap<String,Employee>();
		map.put("employee4", new Employee(4,"Tejas","Pune"));
		map.put("employee5", new Employee(5,"Mihir","Amravati"));
		map.put("employee6", new Employee(6,"Kapse","Pune"));
		return map;
	}
}
