package uri_exercicios;

import java.util.Arrays;

public class URI_2311 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int qtdCompetidores = scan.nextInt();

		while (qtdCompetidores > 0) {
			String nome = scan.next();
			double dificuldade = scan.nextDouble();
			double[] notas = new double[7];
			for (int i = 0; i < notas.length; i++) {
				notas[i] = scan.nextDouble();
			}
			Arrays.sort(notas);
			double notaTotal = 0;
			for (int i = 1; i < notas.length - 1; i++) {
				notaTotal += notas[i];
			}
			System.out.printf("%s %.2f%n", nome, notaTotal * dificuldade);
			qtdCompetidores--;
		}
		scan.close();
	}
}
