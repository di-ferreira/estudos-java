package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Diego");
        lista.add(u1);

        lista.add(new Usuario("Thaís"));
        lista.add(new Usuario("Aquiles"));
        lista.add(new Usuario("Priscila"));
        lista.add(new Usuario("Rita"));
        lista.add(new Usuario("Josué"));

        System.out.println(lista.get(3));// Acessa pelo indice

        System.out.println(">>>>>" + lista.remove(1));
        System.out.println(lista.remove(new Usuario("Rita")));
        System.out.println("Tem?" + lista.contains(new Usuario("Aquiles")));

        for (Usuario u : lista) {
            System.out.println(u);
        }

    }
}
