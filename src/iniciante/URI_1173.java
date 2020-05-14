package iniciante;

public class URI_1173 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int valor = scan.nextInt();

		int[] vetor = new int[10];
		vetor[0] = valor;
		System.out.println("N[0] = " + vetor[0]);

		for (int i = 1; i <= vetor.length - 1; i++) {

			vetor[i] = valor *= 2;
			System.out.println("N[" + i + "]" + " = " + vetor[i]);
		}
		scan.close();
	}

}
