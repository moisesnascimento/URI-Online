package iniciante;

public class URI_1143 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.print(i + " ");
			System.out.print((int) Math.pow(i, 2) + " ");
			System.out.print((int) Math.pow(i, 3));
			System.out.println();
		}
		scan.close();
	}
}