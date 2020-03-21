package uri_exercicios;

import java.util.HashMap;
import java.util.Map;

public class URI_1281 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		int N = scan.nextInt();
		while (N > 0) {
			HashMap<String, Double> listaCompras = new HashMap<>();
			int M = scan.nextInt();
			for (int i = 1; i <= M; i++) {
				String produto = scan.next();
				double preco = scan.nextDouble();
				listaCompras.put(produto, preco);
			}
			int P = scan.nextInt();
			double valorTotalCompra = 0, valorCompra;
			for (int i = 1; i <= P; i++) {
				String nomeProduto = scan.next();
				double qtdProduto = scan.nextDouble();
				for (Map.Entry<String, Double> listaProdutos : listaCompras.entrySet()) {
					if (nomeProduto.equals(listaProdutos.getKey())) {
						valorCompra = qtdProduto * listaProdutos.getValue();
						valorTotalCompra += valorCompra;
					}
				}
			}
			System.out.printf("R$ %.2f%n", valorTotalCompra);
			N--;
		}
		scan.close();
	}
}
