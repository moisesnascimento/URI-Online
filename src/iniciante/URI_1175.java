package iniciante;

public class URI_1175 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		int[] vetor = new int[5];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = scan.nextInt();
		}
		int salvarVet;
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if (i < j) {
					salvarVet = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = salvarVet;
				}
			}
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("N[" + i + "] = " + vetor[i]);
		}
		scan.close();
	}
}
