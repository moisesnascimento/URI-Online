package iniciante;

public class URI_1154 {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);

		int idades;
		double somaIdades = 0, qtdIdadesDigitadas = 0;
		do {
			idades = 0;
			idades = scan.nextInt();
			if (idades >= 0) {
				somaIdades += idades;
				qtdIdadesDigitadas++;
			}

		} while (idades > 0);
		System.out.printf("%.2f\n", somaIdades / qtdIdadesDigitadas);
		scan.close();
	}
}
