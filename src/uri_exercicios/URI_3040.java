package uri_exercicios;

public class URI_3040 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();

		while (N > 0) {
			int altura = scan.nextInt(), diametro = scan.nextInt(), qtdGalhos = scan.nextInt();
			if (!(altura >= 200 && altura <= 300)) {
				System.out.println("Nao");
			} else if (!(diametro >= 50)) {
				System.out.println("Nao");
			} else if (!(qtdGalhos >= 150)) {
				System.out.println("Nao");
			} else {
				System.out.println("Sim");
			}
			N--;
		}
		scan.close();
	}
}
