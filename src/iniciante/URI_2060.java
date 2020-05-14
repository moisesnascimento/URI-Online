package iniciante;

public class URI_2060 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();

		int[] lista = new int[N];
		for (int i = 0; i < N; i++) {
			lista[i] = scan.nextInt();
		}

		int multiplos2 = 0, multiplos3 = 0, multiplos4 = 0, multiplos5 = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] % 2 == 0) {
				multiplos2++;
			}
			if (lista[i] % 3 == 0) {
				multiplos3++;
			}
			if (lista[i] % 4 == 0) {
				multiplos4++;
			}
			if (lista[i] % 5 == 0) {
				multiplos5++;
			}
		}
		System.out.println(multiplos2 + " Multiplo(s) de 2");
		System.out.println(multiplos3 + " Multiplo(s) de 3");
		System.out.println(multiplos4 + " Multiplo(s) de 4");
		System.out.println(multiplos5 + " Multiplo(s) de 5");

		scan.close();
	}

}
