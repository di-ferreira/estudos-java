package classe.desafio;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Diego", 80.0);

        double pesoAnterior = p1.peso;

        Comida feijao = new Comida("Feijão", 0.236);
        Comida arroz = new Comida("Arroz", 0.500);

        p1.Comer(feijao);

        System.out.printf("%s tinha o peso %.3fkg, comeu %s e ficou com %.3fkg.\n", p1.nome, pesoAnterior, feijao.nome,
                p1.peso);

        pesoAnterior = p1.peso;
        p1.Comer(arroz);

        System.out.printf("%s tinha o peso %.3fkg, comeu %s e ficou com %.3fkg.\n", p1.nome, pesoAnterior, arroz.nome,
                p1.peso);

    }
}
