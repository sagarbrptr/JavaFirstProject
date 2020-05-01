package com.sapient.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class KeyRead_Line2 {
	private int[] data;
	
	public void Read()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size=scanner.nextInt();
		data = new int[size];
		System.out.println("Enter Elements : ");
		for(int i=0;i<size;i++)
			data[i]=scanner.nextInt();
		scanner.close();
	}
	public void sort()
	{
		Arrays.sort(data);
	}
	public Boolean find(int val)
	{
		for(int i:data)
			if(i==val)
				return true;
		return false;
	}
	public void display()
	{
		for(int i:data)
			System.out.print(i+ " ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyRead_Line2 obj = new KeyRead_Line2();
		obj.Read();
		obj.display();
		obj.sort();
		obj.display();
		
		System.out.println(obj.find(7));
	}

}
