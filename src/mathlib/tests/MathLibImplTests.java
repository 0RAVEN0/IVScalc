package mathlib.tests;

import mathlib.MathLibImpl;
import mathlib.interfaces.IMathLib;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class MathLibImplTests {

    private IMathLib mathLib;


    @Before
    public void prepare() {
        mathLib = new MathLibImpl();
    }

    @Test
    public void adding(){
        assertEquals(mathLib.add(5,4), 9.0, 0);
        assertEquals(mathLib.add(1,1), 2.0, 0);
        assertEquals(mathLib.add(-5, -5), -10.0, 0);
        assertEquals(mathLib.add(13, -13), 0.0, 0);

    }

    @Test
    public void subtracting(){
        assertEquals(mathLib.subtract(5,4), 1.0, 0);
        assertEquals(mathLib.subtract(5,-4), 9.0, 0);
        assertEquals(mathLib.subtract(5,5), 0.0, 0);
        assertEquals(mathLib.subtract(5,14), -9.0, 0);
    }

    @Test
    public void multiplaying(){
        assertEquals(mathLib.multiply(5,4), 20.0, 0);
        assertEquals(mathLib.multiply(5,-4), -20.0, 0);
        assertEquals(mathLib.multiply(-5,-5), 25.0, 0);
        assertEquals(mathLib.multiply(5,0), 0.0, 0);
    }
    @Test
    public void dividing(){
        assertEquals(mathLib.divide(10,2), 5.0, 0);
        assertEquals(mathLib.divide(5,10), 0.5, 0);
        assertEquals(mathLib.divide(-5,-5), 1.0, 0);
        assertEquals(mathLib.divide(5,0), ArithmeticException.class);

    }




}
