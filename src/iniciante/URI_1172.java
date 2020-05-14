package iniciante;

public class URI_1172 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		int[] vetor = new int[10];
		int teste = 1;
		for (int i = 0; i < vetor.length; i++) {

			vetor[i] = scan.nextInt();

			if (vetor[i] <= 0) {
				vetor[i] = teste;
			}
			System.out.println("X[" + i + "]" + " = " + vetor[i]);
		}
		scan.close();
	}
}
