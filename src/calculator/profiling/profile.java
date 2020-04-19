package profiling;

import mathlib.MathLibImpl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class does a profiling of the mathlib by calculating standard deviation from numbers provided from standard input.
 * Uses https://cs.wikipedia.org/wiki/Sm%C4%9Brodatn%C3%A1_odchylka#V%C3%BDb%C4%9Brov%C3%A1_sm%C4%9Brodatn%C3%A1_odchylka
 */
public class profile {

    public static void main(String[] args) {
        int max = 1000;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        List<String> stream = in.lines().limit(max).collect(Collectors.toList());
        List<Double> numbers = stream.stream().map(Double::valueOf).collect(Collectors.toList());

        MathLibImpl mathLib = new MathLibImpl();
        double average = 0;
        double powersum = 0;

        for (Double n: numbers) {
            average = mathLib.add(average, n);
            powersum = mathLib.add(powersum, mathLib.exponentiate(n, 2));
        }
        double res = mathLib.root(
                mathLib.divide(
                mathLib.add(
                mathLib.multiply(
                mathLib.exponentiate(
                mathLib.divide(average, numbers.size())
                        , 2),
                        -numbers.size())
                        , powersum)
                        , numbers.size()-1)
                         , 2);

        System.out.println(res);
    }
}
