package fundamentos;

public class ConversaoTiposPrimitivosNumerico {
	public static void main(String[] args) {

		double a = 1; // conver��o implicita
		System.out.println(a);

		float b = (float) 1.123456788888; // conver��o explicita (CAST)
		System.out.println(b);

		int c = 340;
		byte d = (byte) c; // conver��o explicita (CAST)
		System.out.println(d);

		double e = 1.999999;
		int f = (int) e; // conver��o explicita (CAST)
		System.out.println(f);

	}
}
