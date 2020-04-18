package uri_exercicios;

public class URI_2523 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		while (scan.hasNext()) {
			String letrasAlfabeto = scan.next();
			int numLampadasPiscadas = scan.nextInt();
			char[] mensagem = new char[numLampadasPiscadas];
			for (int i = 0; i < mensagem.length; i++) {
				int L = scan.nextInt();
				mensagem[i] = letrasAlfabeto.charAt(L - 1);
			}
			for (int i = 0; i < mensagem.length; i++) {
				System.out.print(mensagem[i]);
			}
			System.out.println();
		}
		scan.close();
	}
}
