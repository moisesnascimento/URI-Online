package uri_exercicios;

public class URI_1984 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		String numero = scan.nextLine();

		char[] c = new char[numero.length()];
		for (int i = 0; i < c.length; i++) {
			c[i] = numero.charAt(i);
		}
		for (int i = c.length - 1; i >= 0; i--) {
			System.out.print(c[i]);
		}
		System.out.println();
		scan.close();
	}
}
