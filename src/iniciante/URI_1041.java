package iniciante;

public class URI_1041 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		double x = scan.nextDouble();
		double y = scan.nextDouble();

		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		} else if (y == 0.0 && x != 0.0) {
			System.out.println("Eixo Y");

		} else if (x == 0.0 && y != 0.0) {
			System.out.println("Eixo X");

		} else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");

		} else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");

		} else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");

		} else {
			System.out.println("Q4");
		}
		scan.close();
	}
}