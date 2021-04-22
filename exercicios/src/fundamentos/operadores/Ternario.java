package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		double media = 7.6;
		String resultadoParcial=media>=5.0?"em recuperacao.":"reprovado.";
		String resultadoFinal = media >= 7.0 ? "aprovado." : resultadoParcial;
		System.out.println("O aluno esta " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota>=7;
		boolean temDesconto=bomComportamento&&passouPorMedia;
		String resultado = temDesconto?"Sim.":"Nao.";
		
		System.out.printf("Tem desconto? %s",resultado);
		
	}
}
