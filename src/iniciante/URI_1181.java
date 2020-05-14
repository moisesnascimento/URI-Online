package iniciante;

import java.util.HashMap;
import java.util.Map;

public class URI_1181 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		Map<Character, Integer> map = new HashMap<>();
		int linhaMatriz = scan.nextInt();
		char tipoOperacao = scan.next().charAt(0);
		
		int linhaAndTipo = map.getOrDefault(linhaMatriz, 0) + tipoOperacao;
		map.put(tipoOperacao, linhaAndTipo);
		
		int[][] matriz = new int[12][12];

		double somaLado = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(i == linhaMatriz) {
				somaLado += matriz[i][j];		
				}
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(somaLado);
		scan.close();
	}
}
