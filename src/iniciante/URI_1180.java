package iniciante;

public class URI_1180 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();

		int[] vetor = new int[N];
		int menorValor = 0, posicao = 0;
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = scan.nextInt();

			if (vetor[i] < menorValor) {
				menorValor = vetor[i];
				posicao = i;
			}
		}
		System.out.println("Menor valor: " + menorValor);
		System.out.println("Posicao: " + posicao);
		scan.close();
	}
}
