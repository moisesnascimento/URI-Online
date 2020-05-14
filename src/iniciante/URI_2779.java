package iniciante;

import java.util.HashSet;

public class URI_2779 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		HashSet<Integer> figurinhasCompradas = new HashSet<>();
		int totalFigurinhas = scan.nextInt();
		int qtdComprada = scan.nextInt();

		while(qtdComprada > 0) {
			int figurinha = scan.nextInt();
			figurinhasCompradas.add(figurinha);
			qtdComprada--;
		}
		System.out.println(totalFigurinhas - figurinhasCompradas.size());
		scan.close();
	}
}
