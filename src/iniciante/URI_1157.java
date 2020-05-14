package iniciante;

public class URI_1157 {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();

		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				System.out.println(i);
			}
		}
		scan.close();
	}
}
