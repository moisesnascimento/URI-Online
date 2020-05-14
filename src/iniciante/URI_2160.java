package iniciante;

public class URI_2160 {

	final static int MAX = 80;

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		String L = scan.nextLine();
		char[] arrayChar = new char[L.length()];
		for (int i = 1; i <= arrayChar.length - 1; i++) {
			arrayChar[i] = L.charAt(i);
		}

		if (arrayChar.length <= MAX) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		scan.close();
	}
}
