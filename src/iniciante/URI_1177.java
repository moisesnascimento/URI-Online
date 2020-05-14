package iniciante;

public class URI_1177 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int T = scan.nextInt();

		int[] vetor = new int[9];

		int contador = 0;
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = contador;
			if (contador == T) {
				contador = 0;
			}
			System.out.println("N[" + i + "] = " + vetor[contador]);
			contador++;
		}
		scan.close();
	}
}
