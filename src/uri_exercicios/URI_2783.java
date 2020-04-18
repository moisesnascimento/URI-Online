package uri_exercicios;

import java.util.ArrayList;

public class URI_2783 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		ArrayList<Integer> figurinhasCarimbadas = new ArrayList<>();
		ArrayList<Integer> figurinhasCompradas = new ArrayList<>();
		//int espacoAlbum = scan.nextInt();
		int totalFigurinhasCarimbadas = scan.nextInt();
		int totalFigurinhasCompradas = scan.nextInt();

		for (int i = 0; i < totalFigurinhasCarimbadas; i++) {
			figurinhasCarimbadas.add(scan.nextInt());
		}
		for (int i = 0; i < totalFigurinhasCompradas; i++) {
			figurinhasCompradas.add(scan.nextInt());
		}
		int figurinhasQueFaltam = 0;
		for (int i = 0; i < figurinhasCarimbadas.size(); i++) {
			if(!figurinhasCompradas.contains(figurinhasCarimbadas.get(i))) {
				figurinhasQueFaltam++;
			}
		}
		System.out.println(figurinhasQueFaltam);

		scan.close();
	}
}
