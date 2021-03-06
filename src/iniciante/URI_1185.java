package iniciante;

public class URI_1185 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		char O = scan.next().charAt(0);

		double[][] matriz = new double[12][12];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = scan.nextDouble();
			}
		}
		double soma = 0, tamanho = 11;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (j < tamanho) {
					soma += matriz[i][j];
				}
			}
			tamanho--;
		}
		if (O == 'S') {
			System.out.printf("%.1f%n", soma);
		} else if (O == 'M') {
			System.out.printf("%.1f%n", soma / 66);
		}
		scan.close();
	}
}
