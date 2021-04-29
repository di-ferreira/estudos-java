package classe;

public class AreaCirc {

    double raio;
    static final double PI = 3.1415;

    AreaCirc() {
    }

    AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    double area() {
        return Math.pow(raio, 2) * PI;
    }

    static double area(double raio) {
        return Math.pow(raio, 2) * PI;
    }

}
