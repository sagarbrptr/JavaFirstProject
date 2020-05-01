package com.sapient.week4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Int_Arr_Process {
	private Integer[] array;
	private int size;
	Int_Arr_Process()
	{
		System.out.print("inCondu");
		size=10;
		array=new Integer[10];
	}
	Int_Arr_Process(int size)
	{
		this.size=size;
		array=new Integer[size];
	}
	Int_Arr_Process(Integer[] arr)
	{
		this.array=arr;
		size=arr.length;
	}
	Int_Arr_Process(Int_Arr_Process obj)
	{
		size=obj.size;
		array=obj.array;
	}
	public Integer[] getArray() {
		return array;
	}
	public void setArray(Integer[] array) {
		size=array.length;
		this.array = array;
	}
	public void readArray()
	{
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<size;i++)
			array[i]=scanner.nextInt();
		scanner.close();
	}
	public void displayHorizontal()
	{
		for(int i=0;i<size;i++)
			System.out.print(array[i]+" ");
	}
	public void displayVertical()
	{
		for(int i=0;i<size;i++)
			System.out.println(array[i]+" ");
	}
	public void sort()
	{
		Arrays.sort(array);
	}
	public void printBiggestandSmallest()
	{
		Integer big=Collections.max(Arrays.asList(array));
		Integer small=Collections.min(Arrays.asList(array));
		System.out.println("Biggest = " + big + " Smallest = " + small);
	}
	public Integer getSum()
	{
		Integer sum=0;
		for(int i=0;i<size;i++)
			sum+=array[i];
		return sum;
	}
	public Integer getSecondMax()
	{
		Integer big=Collections.max(Arrays.asList(array));
		Integer secondBig=Integer.MIN_VALUE;
		for(Integer i:array)
		{
			if(i>secondBig && i<big)
				secondBig=i;
		}
		return secondBig;
	}
}
