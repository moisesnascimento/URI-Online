package iniciante;

public class URI_1182 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int colunaMatriz = scan.nextInt();
		char tipoOperacao = scan.next().charAt(0);

		double[][] matriz = new double[12][12];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = scan.nextDouble();
			}
		}
		double soma = 0;
		for (int i = 0; i < matriz.length; i++) {
			soma += matriz[i][colunaMatriz];
		}
		if (tipoOperacao == 'S') {
			System.out.printf("%.1f%n", soma);
		} else {
			System.out.printf("%.1f%n", soma / 12);
		}
		scan.close();
	}
}
