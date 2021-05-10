package oo.polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(99.65);

        Arroz ingrediente01 = new Arroz(0.2);
        Feijao ingrediente02 = new Feijao(0.1);

        System.out.println(convidado.getPeso());

        convidado.comer(ingrediente01);
        convidado.comer(ingrediente02);
        System.out.println(convidado.getPeso());

        Sorvete sobremesa = new Sorvete(0.4);

        convidado.comer(sobremesa);
        System.out.println(convidado.getPeso());

    }
}
