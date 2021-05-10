package oo.heranca.desafio;

public class Teste {
    public static void main(String[] args) {

        Carro f1 = new Ferrari();

        f1.acelerar();
        System.out.println("Velocidade atual Ferrari: " + f1.velAtual + "km/h");
        f1.acelerar();
        System.out.println("Velocidade atual Ferrari: " + f1.velAtual + "km/h");
        f1.acelerar();
        System.out.println("Velocidade atual Ferrari: " + f1.velAtual + "km/h");

        f1.frear();
        System.out.println("Velocidade atual Ferrari: " + f1.velAtual + "km/h");
        f1.frear();
        System.out.println("Velocidade atual Ferrari: " + f1.velAtual + "km/h");
        f1.frear();
        System.out.println("Velocidade atual Ferrari: " + f1.velAtual + "km/h");

        Carro c1 = new Civic();

        c1.acelerar();
        System.out.println("Velocidade atual Civic: " + c1.velAtual + "km/h");
        c1.acelerar();
        System.out.println("Velocidade atual Civic: " + c1.velAtual + "km/h");
        c1.acelerar();
        System.out.println("Velocidade atual Civic: " + c1.velAtual + "km/h");
        c1.acelerar();
        System.out.println("Velocidade atual Civic: " + c1.velAtual + "km/h");

        c1.frear();
        System.out.println("Velocidade atual Civic: " + c1.velAtual + "km/h");
        c1.frear();
        System.out.println("Velocidade atual Civic: " + c1.velAtual + "km/h");
        c1.frear();
        System.out.println("Velocidade atual Civic: " + c1.velAtual + "km/h");
        c1.frear();
        System.out.println("Velocidade atual Civic: " + c1.velAtual + "km/h");
        c1.frear();
        System.out.println("Velocidade atual Civic: " + c1.velAtual + "km/h");
    }
}
