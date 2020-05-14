package iniciante;

public class URI_2950 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		double N = scan.nextDouble(), X = scan.nextDouble(), Y = scan.nextDouble();
		System.out.printf("%.2f%n", N / (X + Y));
		scan.close();
	}
}
