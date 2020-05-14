package iniciante;

public class URI_2165 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		String texto = scan.nextLine();
		char[] arrayChar = texto.toCharArray();

		if (arrayChar.length > 140) {
			System.out.println("MUTE");
		} else {
			System.out.println("TWEET");
		}
		scan.close();
	}
}
