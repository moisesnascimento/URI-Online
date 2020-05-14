package iniciante;

public class URI_1144 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();

		int contador = 1, multi;
		for (int i = 1; i <= N; i++) {
			multi = contador * i;
			for (int j = 0; j <= 1; j++) {
				System.out.print(i + " ");
				System.out.print(multi + j + " ");
				System.out.print(multi * contador + j);
				System.out.println();

			}
			contador++;
		}
		scan.close();
	}
}
