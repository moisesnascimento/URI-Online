package iniciante;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class URI_1094 {
	
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			Map<Character, Integer> map = new HashMap<>();
			int totalExperimentos = s.nextInt();
			int totalGeral = 0;
			for (int i = 0; i < totalExperimentos; i++) {
				int totalCobaia = s.nextInt();
				char tipoCobaia = s.next().charAt(0);
				
				totalGeral += totalCobaia;
				
				int totalSomado = map.getOrDefault(tipoCobaia, 0) + totalCobaia;
				map.put(tipoCobaia, totalSomado);
			}
			double totalCoelhos = map.getOrDefault('C', 0);
			double totalRatos = map.getOrDefault('R', 0);
			double totalSapos = map.getOrDefault('S', 0);
			System.out.printf("Total: %d cobaias%n", totalGeral);
			System.out.printf("Total de coelhos: %.0f%n", totalCoelhos);
			System.out.printf("Total de ratos: %.0f%n", totalRatos);
			System.out.printf("Total de sapos: %.0f%n", totalSapos);
			System.out.printf("Percentual de coelhos: %.2f %%%n", totalCoelhos / totalGeral * 100);
			System.out.printf("Percentual de ratos: %.2f %%%n", totalRatos / totalGeral * 100);
			System.out.printf("Percentual de sapos: %.2f %%%n", totalSapos / totalGeral * 100);
		}
	}
}
