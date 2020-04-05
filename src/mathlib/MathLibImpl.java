package mathlib;

import mathlib.interfaces.IMathLib;

import java.math.BigInteger;

/**
 * Implementation of IMathLib interface.
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
        return x / y;
    }

    public BigInteger factorial(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            factorial = factorial.multiply(BigInteger.valueOf(i));
        return factorial;
    }

    public double exponentiate(double x, int n) {
        return Math.pow(x, n);
    }

    public double root(double x, double n) {
        return Math.pow(x, 1/n);
    }

    public double naturalLogarithm(double x) {
        if (x <= 0) {
            return Double.NaN;
        }
        return Math.log(x);
    }
}
