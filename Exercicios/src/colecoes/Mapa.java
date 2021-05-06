package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuario = new HashMap<>();

        usuario.put(1, "Diego");
        usuario.put(2, "Priscila");
        usuario.put(3, "Aquiles");
        usuario.put(4, "Helena");

        System.out.println(usuario.size());
        System.out.println(usuario.isEmpty());

        System.out.println(usuario.keySet());
        System.out.println(usuario.values());
        System.out.println(usuario.entrySet());

        System.out.println(usuario.containsKey(2));
        System.out.println(usuario.containsValue("Helena"));

        System.out.println(usuario.get(2));

        for (int chave : usuario.keySet()) {
            System.out.println(chave);
        }

        for (String valor : usuario.values()) {
            System.out.println(valor);
        }

        for (Entry<Integer, String> registro : usuario.entrySet()) {
            System.out.print(registro.getKey() + " --> ");
            System.out.println(registro.getValue());
        }

    }
}
