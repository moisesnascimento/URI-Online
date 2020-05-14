package iniciante;

public class URI_1178 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		double X = scan.nextDouble();

		double[] vetor = new double[100];
		vetor[0] = X;
		
		System.out.printf("N[0] = %.4f%n" , vetor[0]);
		for (int i = 1; i <= vetor.length - 1; i++) {
			vetor[i] = X /= 2;
			System.out.printf("N[" + i + "] = %.4f%n", vetor[i]);
		}
		scan.close();
	}
}
