package iniciante;

public class URI_1118 {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);

		int X;
		double media = 0;

		do {
			double valor1 = scan.nextDouble();
			for (int i = 0; i < 5; i++) {
				if (valor1 >= 0 && valor1 <= 10) {
					break;
				} else {
					System.out.println("nota invalida");
					valor1 = scan.nextDouble();
				}
			}
			double valor2 = scan.nextDouble();
			for (int i = 0; i < 5; i++) {
				if (valor2 >= 0 && valor2 <= 10) {
					break;
				} else {
					System.out.println("nota invalida");
					valor2 = scan.nextDouble();
				}
			}
			media = (valor1 + valor2) / 2;
			System.out.printf("media = %.2f%n", media);
			System.out.println("novo calculo (1-sim 2-nao)");
			X = scan.nextInt();
			for (int i = 0; i < 10; i++) {
				if (X < 1 || X > 2) {
					System.out.println("novo calculo (1-sim 2-nao)");
					X = scan.nextInt();
				}
			}
		} while (X != 2);
		scan.close();
	}
}
