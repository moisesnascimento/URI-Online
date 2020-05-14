package string;

public class URI_1241 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();

		while (N > 0) {
			String A = scan.next();
			String B = scan.next();

			if (A.length() < B.length()) {
				System.out.println("nao encaixa");
			} else {
				String lastDigit = A.substring(A.length() - B.length(), A.length());
				if (lastDigit.equals(B)) {
					System.out.println("encaixa");
				} else {
					System.out.println("nao encaixa");
				}
			}
			N--;
		}
		scan.close();
	}
}
