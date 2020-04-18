package uri_exercicios;

import java.util.ArrayList;

public class URI_2812 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();
		while (N > 0) {
			ArrayList<Integer> listaNumeros = new ArrayList<>();
			ArrayList<Integer> numeros = new ArrayList<>();
			int M = scan.nextInt();
			for (int i = 0; i < M; i++) {
				int numero = scan.nextInt();
				if (numero % 2 == 1) {
					listaNumeros.add(numero);
				}
			}
			if (listaNumeros.isEmpty()) {
				System.out.println();
			}
			while (!listaNumeros.isEmpty()) {
				int maiorValor = 0, menorValor = 0;
				for (int i = 0; i < listaNumeros.size(); i++) {
					if (listaNumeros.get(i) > maiorValor) {
						maiorValor = listaNumeros.get(i);
						menorValor = maiorValor;
					}
				}
				for (int j = 0; j < listaNumeros.size(); j++) {
					if (listaNumeros.get(j) < menorValor) {
						menorValor = listaNumeros.get(j);
					}
				}
				if (listaNumeros.size() == 1) {
					numeros.add(listaNumeros.get(0));
					break;
				}
				numeros.add(maiorValor);
				numeros.add(menorValor);
				listaNumeros.remove(listaNumeros.indexOf(maiorValor));
				listaNumeros.remove(listaNumeros.indexOf(menorValor));
			}
			int cont = 1;
			for (Integer listaOrdenada : numeros) {
				if (cont == numeros.size()) {
					System.out.println(listaOrdenada);
				}else {
					System.out.print(listaOrdenada + " ");
					cont++;					
				}
			}
			N--;
		}
		scan.close();
	}
}
