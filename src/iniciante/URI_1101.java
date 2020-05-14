package iniciante;

public class URI_1101 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		int M, N;
		int controle = -1;
		do {
			M = scan.nextInt();
			N = scan.nextInt();
			int soma = 0;
			if (M == 0 || M < 0 || N == 0 || N < 0) {
				break;
			} else if (M > N) {
				for (int i = N; i <= M; i++) {
					System.out.print(i + " ");
					soma += i;
				}
			} else {
				for (int i = M; i <= N; i++) {
					System.out.print(i + " ");
					soma += i;
				}
			}
			System.out.println("Sum=" + soma);
		} while (controle < 0);
		scan.close();
	}
}