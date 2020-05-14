package iniciante;

public class URI_1557 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		while (scan.hasNext()) {
			int N = scan.nextInt();
			int[][] matriz = new int[N][N];
			int multi = 1, T = 1;
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					System.out.print(T + " ");
					T *= 2;
				}
				multi *= 2;
				T = multi;
				System.out.println();
			}
			System.out.println();
			if (N == 0) {
				break;
			}
		}
		scan.close();
	}
}
