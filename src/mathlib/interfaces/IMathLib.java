package mathlib.interfaces;

/**
 * Basic math library providing methods for adding, substracting, multiplying, dividing, factorial, natural exponentiation,
 * rooting and natural logarithm calculation.
 */
public interface IMathLib {

    /**
     * Adds numbers x and y.
     * @param x number to add
     * @param y number to add
     * @return x added to y
     */
    double add(double x, double y);

    /**
     * Subtracts y from x.
     * @param x number to be subtracted
     * @param y number to subtract
     * @return y subtracted from x.
     */
    double subtract(double x, double y);

    /**
     * Multiplies x by y.
     * @param x number to be multiplied
     * @param y number to multiply by
     * @return x mutliplied by Y.
     */
    double multiply(double x, double y);

    /**
     * Divides x by y.
     * @param x number to be divided
     * @param y divisor of the operation
     * @return x divided by y.
     */
    double divide(double x, double y);

    /**
     * Calculates factorial of n.
     * @param n base of the factorial
     * @return product of all positeve integers lower than n
     */
    int factorial(int n);

    /**
     * Exponentiates x by n.
     * @param x base
     * @param n exponent
     * @return x to the power of n
     */
    int exponentiate(double x, int n);

    /**
     * Calculates nth root of x.
     * @param x base
     * @param n degree of the root
     * @return nth root of x
     */
    double root(double x, double n);

    /**
     * Calculates natural logarithm of x.
     * @param x input of logarithm
     * @return ln(x)
     */
    double naturalLogarithm(double x);
}
