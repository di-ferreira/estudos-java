package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    void testeAcessos() {
        // segredo
        // facoDentroDeCasa
        // formaDeFalar
        // todosSabem

        // System.out.println(mae.segredo);
        // System.out.println(mae.facoDentroDeCasa);
        System.out.println(formaDeFalar);// acessa por herança
        System.out.println(todosSabem);
    }
}
