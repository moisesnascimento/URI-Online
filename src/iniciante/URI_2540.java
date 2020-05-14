package iniciante;

public class URI_2540 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		while (scan.hasNext()) {
			int N = scan.nextInt();

			double totalVotos = 0;
			for (int i = 0; i < N; i++) {
				int votos = scan.nextInt();
				if (votos == 1) {
					totalVotos++;
				}
			}
			if (totalVotos >= ((2.0 * N) / 3.0)) {
				System.out.println("impeachment");
			} else {
				System.out.println("acusacao arquivada");
			}
		}
		scan.close();
	}
}
