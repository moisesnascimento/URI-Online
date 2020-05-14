package iniciante;

public class URI_1046 {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);

		int horaInicial = scan.nextInt();
		int horaFinal = scan.nextInt();

		int duracaoJogo = 0;
		if (horaInicial >= horaFinal) {
			duracaoJogo = (24 - horaInicial) + horaFinal;
			System.out.println("O JOGO DUROU " + duracaoJogo + " HORA(S)");
		} else {
			duracaoJogo = horaFinal - horaInicial;
			System.out.println("O JOGO DUROU " + duracaoJogo + " HORA(S)");
		}
		scan.close();
	}
}
