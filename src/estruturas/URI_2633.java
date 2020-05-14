package estruturas;

import java.util.Map;
import java.util.TreeMap;

public class URI_2633 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		while (scan.hasNext()) {
			Map<Integer, String> map = new TreeMap<>();
			int N = scan.nextInt();
			for (int i = 0; i < N; i++) {
				String carne = scan.next();
				int validade = scan.nextInt();
				if (carne.matches("[a-z]*")) {
					map.put(validade, carne);
				}
			}
			int i = 1;
			for (String carnes : map.values()) {
				if (i == map.size()) {
					System.out.println(carnes);
				} else {
					System.out.print(carnes + " ");
				}
				i++;
			}
			N--;
		}
		scan.close();
	}
}
