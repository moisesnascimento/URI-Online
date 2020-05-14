package iniciante;

public class URI_1045 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double C = scan.nextDouble();
		
		double ladoA = 0;
		double ladoB = 0;
		double ladoC = 0;

		if (A > B) {
			ladoA = A;
		} else {
			ladoA = B;
			B = A;
			A = ladoA;
		}
		if (C > ladoA) {
			ladoA = C;
			C = A;
			A = ladoA;
		}
		if (B > C) {
			ladoB = B;
			ladoC = C;
		} else {
			ladoB = C;
			ladoC = B;
		}

		for (int i = 0; i < 1; i++) {

			if (ladoA >= ladoB + ladoC) {
				System.out.println("NAO FORMA TRIANGULO");
				break;
			}
			if (Math.pow(ladoA, 2) == Math.pow(ladoB, 2) + Math.pow(ladoC, 2)) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if (Math.pow(ladoA, 2) > Math.pow(ladoB, 2) + Math.pow(ladoC, 2)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if (Math.pow(ladoA, 2) < Math.pow(ladoB, 2) + Math.pow(ladoC, 2)) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if (ladoA == ladoC && ladoA == ladoB && ladoC == ladoB) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			if (ladoA == ladoB && ladoA != ladoC || ladoA == ladoC && ladoA != ladoB
					|| ladoB == ladoC && ladoB != ladoA) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
		scan.close();
	}
}
