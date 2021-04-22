package fundamentos;

public class ConversaoTiposPrimitivosNumerico {
	public static void main(String[] args) {

		double a = 1; // converção implicita
		System.out.println(a);

		float b = (float) 1.123456788888; // converção explicita (CAST)
		System.out.println(b);

		int c = 340;
		byte d = (byte) c; // converção explicita (CAST)
		System.out.println(d);

		double e = 1.999999;
		int f = (int) e; // converção explicita (CAST)
		System.out.println(f);

	}
}
