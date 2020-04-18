package uri_exercicios;

public class URI_2766 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		String[] nomes = new String[11];
		while (scan.hasNext()) {
			for (int i = 1; i <= nomes.length - 1; i++) {
				nomes[i] = scan.next();
			}
			System.out.println(nomes[3]);
			System.out.println(nomes[7]);
			System.out.println(nomes[9]);
		}
		scan.close();
	}
}
