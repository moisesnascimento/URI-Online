package uri_exercicios;

public class URI_2176 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		String S = scan.next();

		int cont = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '1') {
				cont++;
			}
		}
		if (cont % 2 == 0) {
			System.out.println(S + 0);
		} else {
			System.out.println(S + 1);
		}
		scan.close();
	}
}
