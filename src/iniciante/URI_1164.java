package iniciante;

public class URI_1164 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();

		int contador = 0;

		for (int i = 1; i <= N; i++) {
			int X = scan.nextInt();
			for (int j = 1; j < X; j++) {
				if (X % j == 0) {
					contador += j;
				}
			}
			if (contador == X) {
				System.out.println(X + " eh perfeito");
			} else {
				System.out.println(X + " nao eh perfeito");
			}
			contador = 0;
		}
		scan.close();
	}
}
