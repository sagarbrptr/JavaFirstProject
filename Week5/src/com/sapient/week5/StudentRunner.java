package com.sapient.week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class StudentNotFoundException extends Exception{
}
class CityCompare implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getCity().compareTo(o2.getCity());
	}
	
}
class NameCompare implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}
public class StudentRunner {
	ArrayList<Student> students ;
	
	public StudentRunner()
	{
		students=new ArrayList<>();
	}
	public void readStudents()
	{
		System.out.println("Enter Number of students : ");
		Scanner scanner= new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("kjnkjn");
			Student obj = new Student();
			obj.readStudent(scanner);
			students.add(obj);
		}
		scanner.close();
	}
	public void displayStudentsWithCity(String city)
	{
		for(Student i:students)
		{
			if(i.getCity().equals(city))
				System.out.println(i);
		}
	}
	public Student findStudentWithId(int id) throws StudentNotFoundException
	{
		for(Student i:students)
		{
			if(i.getId()==id)
				return i;
		}
		throw new StudentNotFoundException(); 
	}
	public void sortByCity()
	{
		Collections.sort(this.students,new CityCompare());
	}

	public void sortByName()
	{
		Collections.sort(this.students,new NameCompare());
	}
	public void display()
	{
		for(Student i:students)
			System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student stud= new Student();
//		stud.readStudent();
//		System.out.println(stud);
		StudentRunner runner = new StudentRunner();
		runner.readStudents();
		runner.display();
		try {
			Student res = runner.findStudentWithId(1);
			System.out.println("Found : "+ res);
		}
		catch(StudentNotFoundException e)
		{
			System.out.println("Student not found");
		}
		runner.sortByCity();
		runner.display();
		runner.sortByName();
		runner.display();
	}

}
