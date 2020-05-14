package iniciante;

public class URI_1145 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int X = scan.nextInt();
		int Y = scan.nextInt();

		for (int i = 1; i <= Y; i++) {
			System.out.print(i);
			if (i % X == 0)
				System.out.println("");
			else
				System.out.print(" ");
		}
		scan.close();
	}
}
