package string;

public class URI_2866 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int C = scan.nextInt();
		while (C > 0) {
			String mensagem = scan.next();
			char[] charArray = mensagem.toCharArray();

			for (int i = charArray.length - 1; i >= 0; i--) {
				if (Character.isLowerCase(charArray[i])) {
					System.out.print(charArray[i]);
				}
			}
			System.out.println();
			C--;
		}
		scan.close();
	}
}
