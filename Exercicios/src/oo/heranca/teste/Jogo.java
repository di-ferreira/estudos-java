package oo.heranca.teste;

import oo.heranca.jogo.Heroi;
import oo.heranca.jogo.Monstro;

public class Jogo {
    public static void main(String[] args) {

        Heroi heroi = new Heroi(10, 10);

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 11;

        System.out.println("Heroi tem => " + heroi.vida + " de vida.");
        System.out.println("Monstro tem => " + monstro.vida + " de vida.");

        heroi.atacar(monstro);
        monstro.atacar(heroi);

        System.out.println("Heroi tem => " + heroi.vida + " de vida.");
        System.out.println("Monstro tem => " + monstro.vida + " de vida.");

        // andar
        // heroi.andar(Direcao.NORTE);
        // heroi.andar(Direcao.LESTE);
        // heroi.andar(Direcao.NORTE);
        // heroi.andar(Direcao.LESTE);

        // System.out.println(heroi.y);
        // System.out.println(heroi.x);
    }
}
