package iniciante;

public class URI_2987 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		char[] alfabeto = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		Character letra = scan.next().charAt(0);
		for (int i = 0; i < alfabeto.length; i++) {
			if (letra.equals(alfabeto[i])) {
				System.out.println(i + 1);
			}
		}
		scan.close();
	}
}
