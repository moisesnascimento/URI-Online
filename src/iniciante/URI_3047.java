package iniciante;

public class URI_3047 {

	public static int ordenarIdades(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		}
		if (b > a && b > c) {
			return b;
		}
		return c;
	}

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int M = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();

		int C = Math.abs(M - (A + B));
		System.out.println(ordenarIdades(A, B, C));
		scan.close();
	}
}
