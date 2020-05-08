package com.sapient.week5;

import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private String city;
	Student(){
		id=0;
		name="";
		city="";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void readStudent(Scanner scanner)
	{
		System.out.println("Enter ID : ");
		int newid=scanner.nextInt();
		setId(newid);
		System.out.println("Enter name : ");
		String newname=scanner.next();
		setName(newname);
		System.out.println("Enter city : ");
		String newcity=scanner.next();
		setCity(newcity);
	}
	public String toString()
	{
		return "ID : "+id + "\n Name : " + name + "\n City : "+city;
	}
}
