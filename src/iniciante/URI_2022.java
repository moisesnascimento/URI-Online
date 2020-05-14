package iniciante;

import java.util.TreeMap;

public class URI_2022 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		while (scan.hasNext()) {
			TreeMap<Integer, String> presentesListados = new TreeMap<>();
			String nome = scan.next();
			int qtdPresentes = scan.nextInt();
			for (int i = 0; i < qtdPresentes; i++) {
				String objetoDesejado = scan.nextLine();
				int preferencia = scan.nextInt();
				presentesListados.put(preferencia, objetoDesejado);
			}
			System.out.printf("Lista de %s%n", nome);
			System.out.println(presentesListados);
		}
		scan.close();
	}
}
