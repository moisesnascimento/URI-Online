package iniciante;

import java.util.Scanner;

public class URI_1021 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int valor = (int) (scan.nextDouble() * 100);

		int notasDeCem = (int) valor / 10000;
		valor = valor % 10000;
		int notasDeCinquenta = valor / 5000;
		valor = valor % 5000;
		int notasDeVinte = valor / 2000;
		valor = valor % 2000;
		int notasDeDez = valor / 1000;
		valor = valor % 1000;
		int notasDeCinco = valor / 500;
		valor = valor % 500;
		int notasDeDois = valor / 200;
		valor = valor % 200;
		int moedasDeUmReal = valor / 100;
		valor = valor % 100;
		int moedasDeCinquenta = valor / 50;
		valor = valor % 50;
		int moedasVinteCinco = valor / 25;
		valor = valor % 25;
		int moedasDeDez = valor / 10;
		valor = valor % 10;
		int moedasDeCinco = valor / 5;
		valor = valor % 5;
		int moedasDeUmCentavo = valor;

		System.out.println("NOTAS:");
		System.out.printf("%d nota(s) de R$ 100.00%n", notasDeCem);
		System.out.printf("%d nota(s) de R$ 50.00%n", notasDeCinquenta);
		System.out.printf("%d nota(s) de R$ 20.00%n", notasDeVinte);
		System.out.printf("%d nota(s) de R$ 10.00%n", notasDeDez);
		System.out.printf("%d nota(s) de R$ 5.00%n", notasDeCinco);
		System.out.printf("%d nota(s) de R$ 2.00%n", notasDeDois);
		System.out.println("MOEDAS:");
		System.out.printf("%d moeda(s) de R$ 1.00%n", moedasDeUmReal);
		System.out.printf("%d moeda(s) de R$ 0.50%n", moedasDeCinquenta);
		System.out.printf("%d moeda(s) de R$ 0.25%n", moedasVinteCinco);
		System.out.printf("%d moeda(s) de R$ 0.10%n", moedasDeDez);
		System.out.printf("%d moeda(s) de R$ 0.05%n", moedasDeCinco);
		System.out.printf("%d moeda(s) de R$ 0.01%n", moedasDeUmCentavo);
		scan.close();
	}
}
