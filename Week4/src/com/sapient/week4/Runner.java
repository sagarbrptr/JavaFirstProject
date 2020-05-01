package com.sapient.week4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Int_Arr_Process obj1 = new Int_Arr_Process(5);
//		obj1=new Int_Arr_Process(new Integer[]{1,3,2,4,5,6,6});
//		System.out.println(obj1.getSum());
//		System.out.print(obj1.getSecondMax());
//		obj1.displayHorizontal();
//		obj1.displayVertical();
//		Int_Arr_Process obj2=new Int_Arr_Process(obj1);
//		obj1.displayHorizontal();
		
		Map< String,Num_Process> map =  new HashMap<>();
		map.put("+",new Addition());
		map.put("-",new Subtract());
		map.put("/",new Divide());
		map.put("*",new Multiply());
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a and b");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		System.out.println("Enter Choice");
		String choice = scanner.next();
		Num_Process callObj = map.get(choice);
		System.out.println("Result is "+a+choice + b+"= "+callObj.call(a,b));
		scanner.close();
	}

}
