package iniciante;

public class URI_1159 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int X = scan.nextInt();

		int contador = -1;
		while (contador != 0) {
			if (X == 0) {
				break;
			}
			int soma = X, total = 0;
			for (int i = X; i < (X + 5); i++) {
				if (X % 2 == 0) {
					total += soma;
					soma += 2;
				} else {
					int teste = 1;
					X = soma + teste;
					soma = X;
				}
				if (i == (X + 5) - 1) {
					System.out.println(total);
				}
			}
			X = scan.nextInt();
		}
		scan.close();
	}
}
