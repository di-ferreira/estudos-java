package streams;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter02 {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500.00, 0.3, 0.0);
        Produto p2 = new Produto("Impressora", 600.00, 0.2, 100.0);
        Produto p3 = new Produto("Tablet", 1600.00, 0.40, 0.0);
        Produto p4 = new Produto("Fone", 800.00, 0.7, 35.00);
        Produto p5 = new Produto("Monitor Wide", 1200.00, 0.5, 150.00);
        Produto p6 = new Produto("Teclado", 250.00, 0.5, 25.55);
        Produto p7 = new Produto("Mouse", 100.00, 0.1, 0.0);

        List<Produto> prod = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        Predicate<Produto> filtraDesconto = p -> p.getDesconto() >= 0.3;
        Predicate<Produto> filtraFrete = p -> p.getFrete() == 0;
        Function<Produto, String> promocao = p -> "Promoção " + p.getNome() + " de ==> "
                + new DecimalFormat("R$#,##0.00").format(p.getPreco()) + " por ==> "
                + new DecimalFormat("R$#,##0.00").format(p.getPreco() * (1 - p.getDesconto())) + " com frete grátis!";

        prod.stream().filter(filtraDesconto).filter(filtraFrete).map(promocao).forEach(System.out::println);
    }
}
