package estruturas;

import java.util.ArrayList;
import java.util.Collections;

public class URI_2729 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();
		scan.nextLine();
		while (N > 0) {
			ArrayList<String> listaCompra = new ArrayList<>();
			String compra = scan.nextLine();
			String[] itens = compra.split(" ");

			for (int i = 0; i < itens.length; i++) {
				if (!listaCompra.contains(itens[i])) {
					listaCompra.add(itens[i]);
				}
			}
			Collections.sort(listaCompra);
			int i = 1;
			for (String lista : listaCompra) {
				if (i == listaCompra.size()) {
					System.out.println(lista);
				} else {
					System.out.print(lista + " ");
				}
				i++;
			}
			N--;
		}
		scan.close();
	}
}
