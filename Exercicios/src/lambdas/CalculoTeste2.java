package lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {

        Calculo cal = (x, y) -> {
            return x + y;
        };
        System.out.println(cal.executar(2, 3));

        cal = (x, y) -> x * y;
        System.out.println(cal.executar(2, 3));
    }
}
