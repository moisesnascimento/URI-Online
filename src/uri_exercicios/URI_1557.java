package uri_exercicios;

public class URI_1557 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();

		int[][] matriz = new int[N][N];
		int contador = 1, teste = 0;
		for (int i = 1; i <= matriz.length; i++) {
			for (int j = 1; j <= matriz.length; j++) {
				System.out.print(contador  + " ");
				contador *= 2;
			}
			teste +=2;
			contador = teste;
			System.out.println();
		}
		scan.close();
	}
}
