package iniciante;

public class URI_1176 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int T = scan.nextInt();

		int contador = 0;
		int[] fibonacci = new int[60];
		while (contador < T) {
			int numeroAnterior = 0, numeroAtual = 1, somaTermos = 1;
			int N = scan.nextInt();

			for (int i = 1; i < N; i++) {
				fibonacci[i] = somaTermos;
				somaTermos = numeroAnterior + numeroAtual;
				numeroAnterior = numeroAtual;
				numeroAtual = somaTermos;
			}
			if (N == 0) {
				System.out.printf("Fib(%d) = %d%n", N, 0);
			} else {
				System.out.printf("Fib(%d) = %d%n", N, somaTermos);
			}
			contador++;

		}
		scan.close();
	}
}
