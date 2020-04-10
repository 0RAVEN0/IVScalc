package profiling;

import mathlib.MathLibImpl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

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
