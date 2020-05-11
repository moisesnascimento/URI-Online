package uri_exercicios;

public class URI_2702 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int cA = scan.nextInt(), bA = scan.nextInt(), pA = scan.nextInt();
		int cR = scan.nextInt(), bR = scan.nextInt(), pR = scan.nextInt();

		int A = 0, B = 0, C = 0;
		if (cR > cA) {
			A = cR - cA;
		}
		if (bR > bA) {
			B = bR - bA;
		}
		if (pR > pA) {
			C = pR - pA;
		}
		System.out.println(A + B + C);
		scan.close();
	}
}
