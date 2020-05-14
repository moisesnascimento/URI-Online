package iniciante;

public class URI_1174 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		double[] vetor = new double[100];
		for (int i = 0; i < vetor.length; i++) {

			vetor[i] = scan.nextDouble();
			if (vetor[i] <= 10) {
				System.out.println("A[" + i + "] = " + vetor[i]);
			}
		}
		scan.close();
	}
}
