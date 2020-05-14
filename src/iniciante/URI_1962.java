package iniciante;

public class URI_1962 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int anos = scan.nextInt();

			if (anos >= 2015) {
				anos = anos - 2015 + 1;
				System.out.println(Math.abs(anos) + " A.C.");
			} else {
				anos = anos - 2015;
				System.out.println(Math.abs(anos) + " D.C.");
			}
		}
		scan.close();
	}
}
