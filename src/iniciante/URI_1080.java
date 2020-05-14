package iniciante;

public class URI_1080 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		int[] tamanho = new int[101];
		int maiorValor = 0;
		int posicao = 0;
		for (int i = 1; i <= tamanho.length - 1; i++) {
			tamanho[i] = scan.nextInt();

			if (tamanho[i] > maiorValor) {
				maiorValor = tamanho[i];
				posicao = i;

			}
		}
		System.out.println(maiorValor);
		System.out.println(posicao);
		scan.close();
	}
}
