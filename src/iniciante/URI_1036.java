package iniciante;

import java.util.Scanner;

public class URI_1036 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double C = scan.nextDouble();

		double delta = Math.pow(B, 2) - 4 * A * C;

		if (delta < -1) {

			System.out.println("Impossivel calcular");

		} else {

			double R1 = (-B + Math.sqrt(delta)) / (2 * A);
			double R2 = (-B - Math.sqrt(delta)) / (2 * A);

			if (2 * A == 0) {

				System.out.println("Impossivel calcular");

			} else {

				System.out.printf("R1 = %.5f%s", R1, "\n");
				System.out.printf("R2 = %.5f%s", R2, "\n");
			}

			scan.close();
		}
	}
}
