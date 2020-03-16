package uri_exercicios;

public class URI_2031 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		while (scan.hasNext()) {
			int N = scan.nextInt();
			for (int i = 0; i < N; i++) {
				String jogador1 = scan.next();
				String jogador2 = scan.next();

				if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("pedra")) {
					System.out.println("Jogador 1 venceu");
				} else if (jogador2.equalsIgnoreCase("ataque") && jogador1.equalsIgnoreCase("pedra")) {
					System.out.println("Jogador 2 venceu");
				}
				if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("papel")) {
					System.out.println("Jogador 1 venceu");
				} else if (jogador2.equalsIgnoreCase("pedra") && jogador1.equalsIgnoreCase("papel")) {
					System.out.println("Jogador 2 venceu");
				}
				if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("papel")) {
					System.out.println("Jogador 1 venceu");
				} else if (jogador2.equalsIgnoreCase("ataque") && jogador1.equalsIgnoreCase("papel")) {
					System.out.println("Jogador 2 venceu");
				}
				if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel")) {
					System.out.println("Ambos venceram");
				}
				if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("pedra")) {
					System.out.println("Sem ganhador");
				}
				if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque")) {
					System.out.println("Aniquilacao mutua");
				}
			}
		}
		scan.close();
	}
}