package iniciante;

public class URI_1115 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		int contador = 0;

		while (contador > -1) {

			int X = scan.nextInt();
			int Y = scan.nextInt();

			if (X > 0 && Y > 0) {
				System.out.println("primeiro");

			} else if (X <= -1 && Y > 0) {
				System.out.println("segundo");

			} else if (X <= -1 && Y <= -1) {
				System.out.println("terceiro");

			} else if (X > 0 && Y <= -1) {
				System.out.println("quarto");

			} else if (X == 0 || Y == 0) {
               break;
			}
		}
		scan.close();
	}

}
