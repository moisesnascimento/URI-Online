package iniciante;

public class URI_1153 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();

		int fatorial = 1;
		for (int i = N; i > 1; i--) {
			fatorial *= i;
		}
		System.out.println(fatorial);
		scan.close();
	}
}
