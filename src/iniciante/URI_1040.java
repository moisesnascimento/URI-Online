package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1040 {

	public static void main(String[] args) {
        
		DecimalFormat df = new DecimalFormat("00.0");
		Scanner scan = new Scanner(System.in);
		double N1 = scan.nextDouble();
		double N2 = scan.nextDouble();
		double N3 = scan.nextDouble();
		double N4 = scan.nextDouble();

		double media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / (2 + 3 + 4 + 1);

		System.out.println("Media: " + df.format(media));

		if (media >= 7) {
			System.out.println("Aluno aprovado.");

		} else if (media < 5) {
			System.out.println("Aluno reprovado.");

		} else if (media >= 5.0 && media <= 6.9) {
			System.out.println("Aluno em exame.");
			
			double nota = scan.nextDouble();

			System.out.println("Nota do exame: " + df.format(nota));

			double novaMedia = (nota + media) / 2;

			if (novaMedia >= 5.0) {
				System.out.println("Aluno aprovado.");

			} else if (novaMedia <= 4.9) {
				System.out.println("Aluno reprovado.");

			}
			System.out.println("Media final: " + df.format(novaMedia));
			scan.close();
		}
	}
}