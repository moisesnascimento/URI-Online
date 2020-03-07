package uri_exercicios;

public class URI_1973 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int qtdEstrelas = scan.nextInt();

		int[] carneiros = new int[qtdEstrelas];
		for (int i = 0; i < qtdEstrelas; i++) {
			carneiros[i] = scan.nextInt();
		}
		int estrelasAtacadas = 0;
		for (int i = 0; i < carneiros.length; i++) {
			if (carneiros[i] % 2 != 0) {
				carneiros[i] -= 1;
				estrelasAtacadas++;
			} else {
				for (int j = carneiros.length - 1; j >= 1; j--) {
					if (carneiros[j] % 2 == 0) {
						carneiros[j] -= 1;
					}
				}
				estrelasAtacadas++;
				i++;
			}
		}
		int carneirosNaoRoubados = 0;
		for (int i = 0; i < carneiros.length; i++) {
			carneirosNaoRoubados += carneiros[i];
		}
		System.out.printf("%d %d%n", estrelasAtacadas, carneirosNaoRoubados);
		scan.close();
	}
}
