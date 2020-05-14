package iniciante;

import java.util.HashMap;
import java.util.Map;

public class URI_1983 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		Map<Integer, Double> map = new HashMap<>();
		int qtdAlunos = scan.nextInt();
		for (int i = 0; i < qtdAlunos; i++) {
			int numMatricula = scan.nextInt();
			double notaAlunos = scan.nextDouble();
			map.put(numMatricula, notaAlunos);
		}
		double maiorNota = 0;
		int matricula = 0;
		for (Map.Entry<Integer, Double> alunos : map.entrySet()) {
			if (alunos.getValue() > maiorNota) {
				maiorNota = alunos.getValue();
				matricula = alunos.getKey();
			}
		}
		if (maiorNota >= 8) {
			System.out.println(matricula);
		} else {
			System.out.println("Minimum note not reached");
		}
		scan.close();
	}
}
