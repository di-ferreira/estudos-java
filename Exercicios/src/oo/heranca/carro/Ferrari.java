package oo.heranca.carro;

public class Ferrari extends Carro implements Esportivo {

    public Ferrari() {
        this(315);
    }

    public Ferrari(int velMaxima) {
        super(velMaxima);
        delta = 15;
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

    @Override
    public void LigarTurbo() {
        delta = 35;
    }

    @Override
    public void DesligarTurbo() {
        delta = 15;
    }

}
