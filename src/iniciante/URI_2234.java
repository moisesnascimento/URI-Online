package iniciante;

public class URI_2234 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		double H = scan.nextDouble(), P = scan.nextDouble();
		System.out.printf("%.2f%n", H / P);
		scan.close();
	}
}
