package iniciante;

public class URI_1113 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		for (int i = 0; i < 100; i++) {

			int X = scan.nextInt();
			int Y = scan.nextInt();

			if (X > Y) {
				System.out.println("Decrescente");

			} else if (Y > X) {
				System.out.println("Crescente");

			} else if (X == Y) {
				break;
			}

		}
		scan.close();
	}
}
