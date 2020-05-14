package iniciante;

public class URI_1589 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int T = scan.nextInt();

		while (T > 0) {
			int R1 = scan.nextInt();
			int R2 = scan.nextInt();

			System.out.println(Math.abs(R1 + R2));
			T--;
		}
		scan.close();
	}
}
