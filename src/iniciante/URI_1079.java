package iniciante;

public class URI_1079 {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();

		int contador = 1;
		double media = 0;
		while (contador <= N) {

			double valor1 = scan.nextDouble();
			double valor2 = scan.nextDouble();
			double valor3 = scan.nextDouble();

			media = ((valor1 * 2) + (valor2 * 3) + (valor3 * 5)) / (2 + 3 + 5);
			System.out.printf("%.1f%n", media);
			contador++;
		}
		scan.close();
	}
}
