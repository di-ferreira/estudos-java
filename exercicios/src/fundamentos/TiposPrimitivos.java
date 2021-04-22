package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informa��es do Funcionario
		// Tipos Inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;

		// Tipos num�ricos Reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;

		// Tipo booleano
		boolean estaDeFerias = false; // true

		// Tipo caracter
		char status = 'A';

		// Dias de empresa
		System.out.println("Dias trabalhados = " + anosDeEmpresa * 365);

		// N�mero de viagens
		System.out.println("Quantidade de voos realizados = " + numeroDeVoos / 2);

		// Pontos por real
		System.out.println("Pontos por venda = " + pontosAcumulados / vendasAcumuladas);

		// Salario
		System.out.println("Funcion�rio " + id + ": recebe por m�s " + salario);

		// F�rias?
		System.out.println("Est� de F�rias? " + estaDeFerias);

		// Est� Ativo
		System.out.println("Est� ativo? " + status);
	}
}
