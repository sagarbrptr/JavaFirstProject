package com.sapient.week1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class CheckEvenTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CheckEvenTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CheckEvenTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testZero()
    {
        CheckEven obj = new CheckEven();
    	Boolean res = obj.check(0);
        assertTrue( res==true );
    }

    public void testPositiveEven()
    {
        CheckEven obj = new CheckEven();
    	Boolean res = obj.check(8);
        assertTrue( res==true );
    }

    public void testPositiveOdd()
    {
        CheckEven obj = new CheckEven();
    	Boolean res = obj.check(3);
        assertTrue( res==false );
    }

    public void testNegativeEven()
    {
        CheckEven obj = new CheckEven();
    	Boolean res = obj.check(-4);
        assertTrue( res==true );
    }

    public void testNegativeOdd()
    {
        CheckEven obj = new CheckEven();
    	Boolean res = obj.check(-5);
        assertTrue( res==false );
    }
}
