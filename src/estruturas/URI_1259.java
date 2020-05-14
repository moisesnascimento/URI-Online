package estruturas;

import java.util.ArrayList;
import java.util.Collections;

public class URI_1259 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		ArrayList<Integer> par = new ArrayList<Integer>();
		ArrayList<Integer> impar = new ArrayList<Integer>();
		int N = scan.nextInt();
		while (N > 0) {
			int numero = scan.nextInt();
			if (numero % 2 == 0) {
				par.add(numero);
			} else {
				impar.add(numero);
			}
			N--;
		}
		Collections.sort(par);
		Collections.sort(impar, Collections.reverseOrder());
		for (int i = 0; i < par.size(); i++) {
			System.out.println(par.get(i));
		}
		for (int i = 0; i < impar.size(); i++) {
			System.out.println(impar.get(i));
		}
		scan.close();
	}
}
