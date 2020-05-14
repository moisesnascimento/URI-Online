package iniciante;

public class URI_1074 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();

		for (int i = 0; i < N; i++) {
			int valores = scan.nextInt();

			if (valores % 2 == 0 && valores != 0) {
				if (valores > 0) {
					System.out.println("EVEN POSITIVE");
				} else {
					System.out.println("EVEN NEGATIVE");
				}
			} else if (valores % 1 == 0 && valores != 0) {
				if (valores > 0) {
					System.out.println("ODD POSITIVE");
				} else {
					System.out.println("ODD NEGATIVE");
				}
			} else if (valores == 0) {
				System.out.println("NULL");
			}

		}
		scan.close();
	}
}
