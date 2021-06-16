package generics;

public class CaixaNumeroTeste {

    public static void main(String[] args) {
        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.guardar(123.56);

        Double coisaA = caixaA.abrir();
        System.out.println(coisaA);
    }
}
