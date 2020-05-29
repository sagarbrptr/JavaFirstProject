package com.sapient.week8;

public class Number {
	int checkPrime(int x) {
		int isPrime=1;
		if(x==1)	return 0;
		for(int i=2;i*i<=x;i++)
		{
			if(x%i==0)
			{
				isPrime=0;
				break;
			}
		}
		return isPrime;
	}
	Boolean checkArmstrong(int x) {
		if(x<0)		return false;
		if(x==0)	return true;
		long sum=0;
		
		int numberOfDigits = (int)Math.log10((double)x) + 1;
		int num=x;
		while(num > 0) 
        {  
            int rem = num % 10; 
            sum = sum + (long)Math.pow(rem,numberOfDigits); 
            num = num / 10; 
        }
		return (sum==x);
	}
	Boolean checkPalindrome(int x) {
		String strNum = Integer.toString(x);
		StringBuilder sb = new StringBuilder(strNum);
		sb.reverse();
		String strRevNum = sb.toString();
//		System.out.println(x + strNum + " " + strRevNum);
		return(strRevNum.equals(strNum));
	}
}
