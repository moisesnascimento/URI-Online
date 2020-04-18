package uri_exercicios;

import java.util.HashMap;

public class URI_2486 {

	public static final int MAX_MG = 130;

	public static final int MIN_MG = 110;

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		HashMap<String, Integer> listaAlimentos = new HashMap<>();
		listaAlimentos.put("suco de laranja", 120);
		listaAlimentos.put("morango fresco", 85);
		listaAlimentos.put("mamao", 85);
		listaAlimentos.put("goiaba vermelha", 70);
		listaAlimentos.put("manga", 56);
		listaAlimentos.put("laranja", 50);
		listaAlimentos.put("brocolis", 34);

		int T = scan.nextInt();
		while (T != 0) {
			int qtdConsumida = 0;
			for (int i = 0; i < T; i++) {
				int quantidade = scan.nextInt();
				qtdConsumida += quantidade * listaAlimentos.get(scan.nextLine().trim());

			}
			if (qtdConsumida > MAX_MG) {
				System.out.printf("Menos %d mg%n", qtdConsumida - MAX_MG);
			} else if (qtdConsumida < MIN_MG) {
				System.out.printf("Mais %d mg%n", MIN_MG - qtdConsumida);
			} else {
				System.out.printf("%d mg%n", qtdConsumida);
			}
			T = scan.nextInt();
		}
		scan.close();
	}
}
