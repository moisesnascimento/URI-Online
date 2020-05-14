package iniciante;

public class URI_2765 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		while (scan.hasNext()) {
			String frase = scan.nextLine();
			String[] token = frase.split(",");
			for (int i = 0; i < token.length; i++) {
				System.out.println(token[i]);
			}
		}
		scan.close();
	}
}
