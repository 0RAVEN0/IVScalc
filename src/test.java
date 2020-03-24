import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class test {

    public Calculator calculator;


    @Before
    public void prepare() {
       calculator = new Calculator();
    }

    @Test
    public void adding(){
        assertEquals(calculator.adding(5,4), 9.0, 0);
        assertEquals(calculator.adding(1,1), 2.0, 0);
        assertEquals(calculator.adding(-5, -5), -10.0, 0);
        assertEquals(calculator.adding(13, -13), 0.0, 0);

    }

    @Test
    public void subtracting(){
        assertEquals(calculator.subtracting(5,4), 1.0, 0);
        assertEquals(calculator.subtracting(5,-4), 9.0, 0);
        assertEquals(calculator.subtracting(5,5), 0.0, 0);
        assertEquals(calculator.subtracting(5,14), -9.0, 0);
    }

    @Test
    public void multiplaying(){
        assertEquals(calculator.multiplying(5,4), 20.0, 0);
        assertEquals(calculator.multiplying(5,-4), -20.0, 0);
        assertEquals(calculator.multiplying(-5,-5), 25.0, 0);
        assertEquals(calculator.multiplying(5,0), 0.0, 0);
    }
    @Test
    public void dividing(){
        assertEquals(calculator.dividing(10,2), 5.0, 0);
        assertEquals(calculator.dividing(5,10), 0.5, 0);
        assertEquals(calculator.dividing(-5,-5), 1.0, 0);
        assertEquals(calculator.dividing(5,0), ArithmeticException.class);

    }




}
