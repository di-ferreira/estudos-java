package fundamentos.operadores;

public class DesafioAritmeticosResposta {
	public static void main(String[] args) {

		/*
		 * 
		 * Minha resolus�o do desafio
		 * 
		 */
		// Variaveis
		double mNumA = Math.pow(6 * (3 + 2), 2);

		double mSuperiorA = mNumA / (3 * 2);
		double mSuperiorB = Math.pow(((1 - 5) * (2 - 7)) / 2, 2);
		double mSuperior = Math.pow(mSuperiorA - mSuperiorB, 3);

		double mInferior = Math.pow(10, 3);

		double mResultado = mSuperior / mInferior;

		/*
		 * 
		 * Resolu��o do curso
		 * 
		 */
		// Variaveis
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;

		double numB = (1 - 5) * (2 - 7);
		double denB = 2;

		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);

		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);

		double resultado = superior / inferior;

		System.out.println("Meu Resultado = " + mResultado);
		System.out.println("Resultado = " + resultado);
	}
}
