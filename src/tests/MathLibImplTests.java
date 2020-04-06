package tests;

import mathlib.MathLibImpl;
import mathlib.interfaces.IMathLib;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;


public class MathLibImplTests {

    private IMathLib mathLib;


    @Before
    public void prepare() {
        mathLib = new MathLibImpl();
    }

    @Test
    public void adding(){
        assertEquals(mathLib.add(5,4), 9.0, 0.0001);
        assertEquals(mathLib.add(1,1), 2.0, 0.0001);
        assertEquals(mathLib.add(-5, -5), -10.0, 0.0001);
        assertEquals(mathLib.add(13, -13), 0.0, 0.0001);

    }

    @Test
    public void subtracting(){
        assertEquals(mathLib.subtract(5,4), 1.0, 0.0001);
        assertEquals(mathLib.subtract(5,-4), 9.0, 0.0001);
        assertEquals(mathLib.subtract(5,5), 0.0, 0.0001);
        assertEquals(mathLib.subtract(5,14), -9.0, 0.0001);
    }

    @Test
    public void multiplaying(){
        assertEquals(mathLib.multiply(5,4), 20.0, 0.0001);
        assertEquals(mathLib.multiply(5,-4), -20.0, 0.0001);
        assertEquals(mathLib.multiply(-5,-5), 25.0, 0.0001);
        assertEquals(mathLib.multiply(5,0), 0.0, 0.0001);
    }
    @Test
    public void dividing(){
        assertEquals(mathLib.divide(10,2), 5.0, 0.0001);
        assertEquals(mathLib.divide(5,10), 0.5, 0.0001);
        assertEquals(mathLib.divide(-5,-5), 1.0, 0.0001);
    }
    @Test
    public void dividingIllegalNumbers(){
        double resultDiv = mathLib.divide(5, 0);
        assertTrue("Divide by zero gives infinity as result", Double.isInfinite(resultDiv));
        resultDiv = mathLib.divide(5.99, 0);
        assertTrue("Divide by zero gives infinity as result", Double.isInfinite(resultDiv));
    }

    @Test
    public void factorialing(){
        assertEquals(mathLib.factorial(5), new BigInteger("120"));
        assertEquals(mathLib.factorial(13), new BigInteger("6227020800"));
        assertEquals(mathLib.factorial(0), new BigInteger("1"));
    }

    @Test
    public void exponentiating(){
        assertEquals(mathLib.exponentiate(2,2), 4.0, 0.0001);
        assertEquals(mathLib.exponentiate(2,1), 2.0, 0.0001);
        assertEquals(mathLib.exponentiate(2,-2), 0.25, 0.0001);
        assertEquals(mathLib.exponentiate(5,12), 244140625, 0.0001);

    }

    @Test
    public void rooting(){
        assertEquals(mathLib.root(4, 2), 2.0, 0.0001);
        assertEquals(mathLib.root(9, 2), 3.0, 0.0001);
        assertEquals(mathLib.root(256, 4), 4.0, 0.0001);
        assertEquals(mathLib.root(256, -4), 0.25, 0.0001);
    }

    @Test
    public void naturalLogarithming(){
        assertEquals(mathLib.naturalLogarithm(4), 1.38629436112, 0.0001);
        assertEquals(mathLib.naturalLogarithm(2.71828182846), 1, 0.0001);
        assertEquals(mathLib.naturalLogarithm(77), 4.34380542185, 0.0001);
    }

    @Test
    public void naturalLogarithmingIllegalNumber(){
        double resultDiv = mathLib.naturalLogarithm(-1337);
        assertTrue("Nan", Double.isNaN(resultDiv));
        resultDiv = mathLib.naturalLogarithm(0);
        assertTrue(resultDiv == Double.NEGATIVE_INFINITY);
    }



}
