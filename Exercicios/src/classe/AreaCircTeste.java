package classe;

public class AreaCircTeste {
    public static void main(String[] args) {

        // Construtor padrão
        AreaCirc a1 = new AreaCirc();
        a1.raio = 10;

        // Construtor com valor para iniciar
        AreaCirc a2 = new AreaCirc(5);

        // Método static
        double a3 = AreaCirc.area(15);

        System.out.printf("Área a1 = %.2f\n", a1.area());
        System.out.printf("Área a2 = %.2f\n", a2.area());
        System.out.printf("Área a3 = %.2f\n", a3);
        System.out.println(AreaCirc.PI);

    }
}
