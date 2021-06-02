package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {

        BinaryOperator<Double> cal = (x, y) -> {
            return x + y;
        };
        System.out.println(cal.apply(2.0, 3.0));

        cal = (x, y) -> x * y;
        System.out.println(cal.apply(2.0, 3.0));

        BinaryOperator<Integer> cal2 = (x, y) -> {
            return x + y;
        };
        System.out.println(cal2.apply(2, 3));

        cal2 = (x, y) -> x * y;
        System.out.println(cal2.apply(2, 3));
    }
}
