package uri_exercicios;

public class URI_2534 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		while (scan.hasNext()) {
			int numHabitantes = scan.nextInt(), numConsultas = scan.nextInt();
			int[] notas = new int[numHabitantes + 1];
			for (int i = 1; i <= notas.length - 1; i++) {
				notas[i] = scan.nextInt();
			}
			int aux;
			for (int i = 1; i <= notas.length - 1; i++) {
				for (int j = 1; j <= notas.length - 1; j++) {
					if(notas[i] > notas[j]) {
						aux = notas[i];
						notas[i] = notas[j];
						notas[j] = aux;
					}
				}
			}
			for (int i = 1; i <= numConsultas; i++) {
				System.out.println(notas[scan.nextInt()]);
			}
		}
		scan.close();
	}
}
