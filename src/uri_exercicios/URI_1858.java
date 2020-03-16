package uri_exercicios;

public class URI_1858 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();

		int numMinimo = 0, aux = 20;
		for (int i = 1; i <= N; i++) {
			int T = scan.nextInt();
			if (T < aux) {
				aux = T;
				numMinimo = i;
			}
		}
		System.out.println(numMinimo);
		scan.close();
	}
}
