package uri_exercicios;

public class URI_1864 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();

		String[] frase = { "L", "I", "F", "E", " ", "I", "S", " ", "N", "O", "T", " ", "A", " ", "P", "R", "O", "B",
				"L", "E", "M", " ", "T", "O", " ", "B", "E", " ", "S", "O", "L", "V", "E", "D" };

		for (int i = 0; i < N; i++) {
			System.out.print(frase[i]);
		}
		System.out.println();
		scan.close();
	}
}
