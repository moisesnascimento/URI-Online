package iniciante;

public class URI_1914 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int qtdCasos = scan.nextInt(), i = 0;

		while (i < qtdCasos) {
			String jogador1 = scan.next(), esc1 = scan.next();
			String jogador2 = scan.nextLine();
			int num1 = scan.nextInt(), num2 = scan.nextInt();

			if ((num1 + num2) % 2 == 0) {
				if (esc1.equalsIgnoreCase("PAR")) {
					System.out.println(jogador1);
				} else {
					System.out.println(jogador2);
				}
			} else {
				if (esc1.equalsIgnoreCase("IMPAR")) {
					System.out.println(jogador1);
				} else {
					System.out.println(jogador2);
				}
			}
			i++;
		}
		scan.close();
	}
}
