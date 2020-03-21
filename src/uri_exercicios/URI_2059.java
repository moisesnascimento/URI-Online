package uri_exercicios;

public class URI_2059 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int p = scan.nextInt(), j1 = scan.nextInt(), j2 = scan.nextInt();
		int r = scan.nextInt(), a = scan.nextInt();

		String ganhador;
		if ((j1 + j2) % 2 == 0) {
			if (p == 1) {
				ganhador = "Jogador 1 ganha!";
			} else {
				ganhador = "Jogador 2 ganha!";
			}
		} else {
			if (p == 0) {
				ganhador = "Jogador 1 ganha!";
			} else {
				ganhador = "Jogador 2 ganha!";
			}
		}
		if (r == 0 && a == 0) {
			System.out.println(ganhador);
		} else {
			if (r == 1 && a == 1) {
				ganhador = "Jogador 2 ganha!";
			} else {
				ganhador = "Jogador 1 ganha!";
			}
			if (a == 1 && r == 0) {
				ganhador = "Jogador 1 ganha!";
			}
			System.out.println(ganhador);
		}

		scan.close();
	}
}
