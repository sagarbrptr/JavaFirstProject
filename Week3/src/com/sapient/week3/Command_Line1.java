package com.sapient.week3;

import java.util.ArrayList;

public class Command_Line1 {
	private int[] data;
	
	public int getSum()
	{
		int sum=0;
		for(int i:data)
			sum+=i;
		return sum;
	}
	public double getAverage()
	{
		int sum=getSum();
		return sum/(1.0*data.length);
	}
	public int getMax()
	{
		int maxval=Integer.MIN_VALUE;
		for(int i:data)
			maxval=Math.max(i,maxval);
		return maxval;
	}
	public int getMin()
	{
		int minval=Integer.MAX_VALUE;
		for(int i:data)
			minval=Math.min(i,minval);
		return minval;
	}
	
	public int[] getData() {
		return data;
	}
	public void setData(int[] data) {
		this.data = data;
	}
	public void displayData()
	{
		for(int i:data)
			System.out.print(i+ " ");
		System.out.println("\n Sum = "+getSum());
		System.out.println("Average = "+getAverage());
		System.out.println("Maximum = "+getMax());
		System.out.println("Minimum = "+getMin());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Command_Line1 obj = new Command_Line1();
		ArrayList<Integer> arr= new ArrayList<>();
		for(String arg:args)
		{
			arr.add(Integer.parseInt(arg));
		}
		int a[] =new int[arr.size()];
		for(int i=0;i<arr.size();i++)
			a[i]=arr.get(i);
		obj.setData(a);
		obj.displayData();
		//Run with Terminal or Cmd
	}

}
