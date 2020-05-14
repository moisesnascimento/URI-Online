package iniciante;

public class URI_1828 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int T = scan.nextInt(), i = 1;

		while (T > 0) {
			String esc1 = scan.next(), esc2 = scan.next();

			System.out.print("Caso #" + i + ": ");
			if (esc1.equals(esc2)) {
				System.out.println("De novo!");
			} else if (esc1.equals("tesoura") && (esc2.equals("papel") || esc2.equals("lagarto"))) {
				System.out.println("Bazinga!");
			} else if (esc1.equals("papel") && (esc2.equals("pedra") || esc2.equals("Spock"))) {
				System.out.println("Bazinga!");
			} else if (esc1.equals("pedra") && (esc2.equals("lagarto") || esc2.equals("tesoura"))) {
				System.out.println("Bazinga!");
			} else if (esc1.equals("lagarto") && (esc2.equals("Spock") || esc2.equals("papel"))) {
				System.out.println("Bazinga!");
			} else if (esc1.equals("Spock") && (esc2.equals("tesoura") || esc2.equals("pedra"))) {
				System.out.println("Bazinga!");
			} else {
				System.out.println("Raj trapaceou!");
			}
			i++;
			T--;
		}
		scan.close();
	}
}
