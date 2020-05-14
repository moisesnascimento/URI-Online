package string;

public class URI_1871 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		while (scan.hasNext()) {
			int N = scan.nextInt();
			int M = scan.nextInt();
			if (N == 0 && M == 0) {
				break;
			}
			String soma = String.valueOf(N + M);
			char[] arrayChar = soma.toCharArray();
			for (int i = 0; i < arrayChar.length; i++) {
				if (arrayChar[i] != '0') {
					System.out.print(arrayChar[i]);
				}
			}
			System.out.println();
		}
		scan.close();
	}
}
