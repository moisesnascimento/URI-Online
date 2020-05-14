package iniciante;

public class URI_1134 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		int alcool = 0, gasolina = 0, diesel = 0, valores;
		do {
			valores = scan.nextInt();
			if (valores == 1) {
				alcool++;
			} else if (valores == 2) {
				gasolina++;
			} else if (valores == 3) {
				diesel++;
			}
		} while (valores != 4);
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		scan.close();
	}
}
