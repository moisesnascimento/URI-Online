package uri_exercicios;

public class URI_2006 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int tipoCha = scan.nextInt();

		int[] respostas = new int[5];
		int soma = 0;
		for (int i = 0; i < respostas.length; i++) {
			respostas[i] = scan.nextInt();
			if (respostas[i] == tipoCha) {
				soma++;
			}
		}
		System.out.println(soma);

		scan.close();
	}
}
