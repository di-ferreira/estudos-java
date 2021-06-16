package generics;

public class CaixaTeste {
	public static void main(String[] args) {
		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("Teste String");

		String coisaA = caixaA.abrir();
		System.out.println(coisaA);

		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guardar(3.523);

		Double coisaB = caixaB.abrir();
		System.out.println(coisaB);
	}
}
