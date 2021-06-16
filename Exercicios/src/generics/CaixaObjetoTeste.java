package generics;

public class CaixaObjetoTeste {
    public static void main(String[] args) {
//         Sem generics
        CaixaObjeto CaixaA = new CaixaObjeto();
        CaixaA.guardar(2.3);// auto cast double->Double

        Double coisaA = (Double) CaixaA.abrir();
        System.out.println(coisaA);

        CaixaObjeto CaixaB = new CaixaObjeto();
        CaixaB.guardar("Olá");// auto cast string->String

        String coisaB = (String) CaixaB.abrir();
        System.out.println(coisaB);
    }
}
