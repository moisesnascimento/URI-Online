package iniciante;

public class URI_1146 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int X = scan.nextInt();

		while (X != 0) {
			System.out.print(1);
			for (int i = 2; i <= X; i++) {
				System.out.print(" " + i);
			}
			System.out.println();
			X = scan.nextInt();
		}
		scan.close();
	}
}
