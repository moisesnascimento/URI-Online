package string;

import java.util.ArrayList;
import java.util.Collections;

public class URI_2137 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		while (scan.hasNext()) {
			ArrayList<String> codigos = new ArrayList<>();
			int N = scan.nextInt();
			for (int i = 0; i < N; i++) {
				String codigoLivro = scan.next();
				codigos.add(codigoLivro);
			}
			Collections.sort(codigos);
			for (int i = 0; i < codigos.size(); i++) {
				System.out.printf("%s%n", codigos.get(i));
			}
		}
		scan.close();
	}
}
