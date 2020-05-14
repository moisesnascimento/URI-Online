package iniciante;

public class URI_1789 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		while (scan.hasNext()) {
			int qtdLesmas = scan.nextInt();
			int[] velocidadeLemas = new int[qtdLesmas];
			for (int i = 0; i < qtdLesmas; i++) {
				velocidadeLemas[i] = scan.nextInt();
			}
			int maisRapida = 0;
			for (int i = 0; i < velocidadeLemas.length; i++) {
				if (velocidadeLemas[i] > maisRapida) {
					maisRapida = velocidadeLemas[i];
				}
			}
			if (maisRapida < 10) {
				System.out.println("1");
			} else if (maisRapida >= 10 && maisRapida < 20) {
				System.out.println("2");
			} else {
				System.out.println("3");
			}
		}

		scan.close();
	}
}
