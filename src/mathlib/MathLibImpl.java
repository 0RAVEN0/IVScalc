package mathlib;

import mathlib.interfaces.IMathLib;

/**
 * Implementation of IMathLib interface TODO doc
 */
public class MathLibImpl implements IMathLib {

    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y) throws ArithmeticException {
        return  x / y;
    }

    public int factorial(int n) {
        if(n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public int exponentiate(double x, int n) {
        return 0;
    }

    public double root(double x, double n) {
        return 0;
    }
}
