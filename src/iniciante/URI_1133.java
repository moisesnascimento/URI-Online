package iniciante;

public class URI_1133 {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int X = scan.nextInt();
		int Y = scan.nextInt();

		if (X > Y) {
			for (int i = Y + 1; i < X; i++) {
				if (i % 5 == 2 || i % 5 == 3) {
					System.out.println(i);
				}
			}
		} else if (Y > X) {
			for (int i = X + 1; i < Y; i++) {
				if (i % 5 == 2 || i % 5 == 3) {
					System.out.println(i);
				}
			}
		}
		scan.close();
	}
}
