package oo.heranca.desafio;

public class Carro {
    // var velocidade atual
    // metodo acelerara, frear
    int velAtual = 0;

    public void acelerar() {
        velAtual += 5;
    }

    public void frear() {
        if (velAtual > 0) {
            velAtual -= 5;
        } else {
            velAtual = 0;
        }
    }
}
