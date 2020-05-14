package iniciante;

import java.util.Scanner;

public class URI_1048 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double salario = scan.nextDouble();

		if (salario >= 0 && salario <= 400) {
			double reajusteGanho = salario * 0.15;
			double novoSalario = salario + reajusteGanho;
			System.out.printf("Novo salario: %.2f%n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
			System.out.println("Em percentual: 15 %");

		} else if (salario > 400 && salario <= 800) {

			double reajusteGanho = salario * 0.12;
			double novoSalario = salario + reajusteGanho;
			System.out.printf("Novo salario: %.2f%n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
			System.out.println("Em percentual: 12 %");

		} else if (salario > 800 && salario <= 1200) {
			double reajusteGanho = salario * 0.10;
			double novoSalario = salario + reajusteGanho;
			System.out.printf("Novo salario: %.2f%n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
			System.out.println("Em percentual: 10 %");

		} else if (salario > 1200 && salario <= 2000) {
			double reajusteGanho = salario * 0.07;
			double novoSalario = salario + reajusteGanho;
			System.out.printf("Novo salario: %.2f%n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
			System.out.println("Em percentual: 7 %");

		} else if (salario > 2000) {
			double reajusteGanho = salario * 0.04;
			double novoSalario = salario + reajusteGanho;
			System.out.printf("Novo salario: %.2f%n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
			System.out.println("Em percentual: 4 %");
		}
		scan.close();
	}
}