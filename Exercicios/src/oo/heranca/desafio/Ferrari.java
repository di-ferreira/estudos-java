package oo.heranca.desafio;

public class Ferrari extends Carro {

    Ferrari(int velMaxima) {
        super(velMaxima);
    }

    @Override
    public void acelerar() {
        super.acelerar();
        super.acelerar();
        super.acelerar();
    }

    @Override
    public void frear() {
        velAtual -= 15;
    }

}
