package uri_exercicios;

public class VaiTerCopa {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		while (scan.hasNext()) {
			int N = scan.nextInt();
			if (N == 0) {
				System.out.println("vai ter copa!");
			} else {
				System.out.println("vai ter duas!");
			}
		}
		scan.close();
	}
}
