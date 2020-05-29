package com.sapient.week8;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NumberTest {

	public static Number ob = null;
	
	@BeforeClass
	public static void f1() {
		ob = new Number();
//		System.out.print("In f1");
	}
	
	@Test
	public void PrimeTest1()
	{
//		System.out.println("Prime1");
		int actual = ob.checkPrime(5);
		assertEquals(1, actual);
	}
	
	@Test
	public void PrimeTest2()
	{
//		System.out.println("Prime2");
		int actual = ob.checkPrime(56);
		assertEquals(0, actual);
	}
	
	@Test
	public void ArmStrongTest1()
	{
		assertEquals(ob.checkArmstrong(371), true);
	}
	
	@Test
	public void ArmStrongTest2()
	{
		assertEquals(ob.checkArmstrong(10), false);
	}
	
	@Test
	public void Palindrome1()
	{
		assertEquals(ob.checkPalindrome(1), true);
	}
	
	@Test
	public void Palindrome2()
	{
		assertEquals(ob.checkPalindrome(576), false);
	}
	
	@Test
	public void Palindrome3()
	{
		assertEquals(ob.checkPalindrome(12333321), true);
	}
}
