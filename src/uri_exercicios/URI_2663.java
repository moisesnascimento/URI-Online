package uri_exercicios;

public class URI_2663 {

	public static void bubbleSort(int[] array) {
		int aux;
		for (int i = 1; i <= array.length - 1; i++) {
			for (int j = 1; j <= array.length - 1; j++) {
				if (array[i] > array[j]) {
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
	}

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();
		int numMinino = scan.nextInt();

		int[] pontuacoes = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			pontuacoes[i] = scan.nextInt();
		}
		bubbleSort(pontuacoes);
		int contador = 0;
		for (int i = numMinino + 1; i < pontuacoes.length; i++) {
			if (pontuacoes[numMinino] == pontuacoes[i]) {
				contador++;
			}
		}
		System.out.println(numMinino + contador);
		scan.close();
	}
}
