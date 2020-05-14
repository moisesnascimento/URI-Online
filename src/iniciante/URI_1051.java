package iniciante;

public class URI_1051 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		double valor = scan.nextDouble();

		if (valor >= 0 && valor <= 2000) {
			System.out.println("Isento");

		} else if (valor >= 2000.01 && valor <= 3000) {
			double imposto = (valor - 2000) * 0.08;
			System.out.printf("R$ %.2f%n", imposto);

		} else if (valor >= 3000.01 && valor <= 4500) {
			double imposto = (0.08 * 1000) + ((valor - 3000) * 0.18);
			System.out.printf("R$ %.2f%n", imposto);

		} else if (valor > 4500) {
			double imposto = (valor - 4500) * 0.28 + 350;
			System.out.printf("R$ %.2f%n", imposto);
		}
		scan.close();
	}
}
