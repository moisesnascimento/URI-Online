package iniciante;

public class URI_1117 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		double valor1 = scan.nextDouble();

		double nota1 = 0;
		double nota2 = 0;
		double media;
		for (int i = 0; i < 10; i++) {
			if (valor1 >= 0 && valor1 <= 10) {
				nota1 = valor1;
				break;
			} else {
				System.out.println("nota invalida");
				valor1 = scan.nextDouble();
			}
		}
		double valor2 = scan.nextDouble();
		for (int i = 0; i < 10; i++) {
			if (valor2 >= 0 && valor2 <= 10) {
				nota2 = valor2;
				break;
			} else {
				System.out.println("nota invalida");
				valor2 = scan.nextDouble();
			}
		}
		media = (nota1 + nota2) / 2;
		System.out.println("media = " + media);
		scan.close();
	}
}
