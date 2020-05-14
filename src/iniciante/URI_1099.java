package iniciante;

public class URI_1099 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();

		int contador = 0;
		while (contador < N) {
			int X = scan.nextInt();
			int Y = scan.nextInt();

			int soma = 0;
			if (X > Y) {
				for (int i = Y + 1; i < X; i++) {
					if (i % 2 == 1) {
						soma += i;
					}
				}
			} else {
				for (int i = X + 1; i < Y; i++) {
					if (i % 2 == 1) {
						soma += i;
					}
				}
			}
			System.out.println(soma);
			contador++;
		}
		scan.close();
	}
}
