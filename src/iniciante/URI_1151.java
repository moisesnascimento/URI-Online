package iniciante;

public class URI_1151 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();

		int numeroAnterior = 0;
		int numeroAtual = 1;
		int somaNumeros;
		System.out.print(numeroAnterior + " " + numeroAtual);
		for (int i = 0; i < N - 2; i++) {
			somaNumeros = numeroAnterior + numeroAtual;
			System.out.print(" " + somaNumeros);
			numeroAnterior = numeroAtual;
			numeroAtual = somaNumeros;

		}
		System.out.println();
		scan.close();
	}
}
