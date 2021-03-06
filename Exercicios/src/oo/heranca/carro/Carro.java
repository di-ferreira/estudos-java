package oo.heranca.carro;

public class Carro {
    // var velocidade atual
    // metodo acelerara, frear
    final int VELOCIDADE_MAXIMA;
    public int velAtual = 0;
    protected int delta = 5;

    protected Carro(int VELOCIDADE_MAXIMA) {
        this.VELOCIDADE_MAXIMA = VELOCIDADE_MAXIMA;
    }

    public void acelerar() {
        if (velAtual + delta > VELOCIDADE_MAXIMA) {
            velAtual = VELOCIDADE_MAXIMA;
        } else {
            velAtual += 5;
        }

    }

    public void frear() {
        if (velAtual > 0) {
            velAtual -= 5;
        } else {
            velAtual = 0;
        }
    }
}
