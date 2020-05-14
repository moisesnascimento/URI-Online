package estruturas;

import java.util.HashMap;

public class URI_2482 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		HashMap<String, String> traducoes = new HashMap<>();
		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
		 String lingua = scan.next();
			scan.nextLine();
			String traducao = scan.nextLine();
			traducoes.put(lingua, traducao);
		}
		int M = scan.nextInt();
		scan.nextLine();
		while (M > 0) {
			String nome = scan.nextLine();
			String lingua = scan.next();
			System.out.println(nome);
			System.out.println(traducoes.get(lingua));
			scan.nextLine();
			M--;
		}
		scan.close();
	}
}
