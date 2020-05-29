package com.sapient.week8;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {
	private List<Employee> list ;
	
	public AddEmployee()
	{
		list = new ArrayList<Employee>();
	}

	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}
	
	public void addEmployee(Employee emp)
	{
		list.add(emp);
	}
	
	public Employee getEmployee(int id)
	{
		for(Employee e : list)
		{
			if(e.getId()==id)
				return e;
		}
		return null;
	}
}
