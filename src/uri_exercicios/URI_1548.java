package uri_exercicios;

public class URI_1548 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();

		while (N > 0) {

			int numAlunos = scan.nextInt();
			int[] notas = new int[numAlunos];
			int[] salvarNotas = new int[numAlunos];
			for (int i = 1; i <= numAlunos - 1; i++) {
				int notaAluno = scan.nextInt();
                notas[i] = notaAluno;
				salvarNotas[i] = notaAluno;
			}
			int aux;
			for (int i = 1; i <= notas.length - 1; i++) {
				for (int j = 1; j <= notas.length - 1; j++) {
					if (notas[i] > notas[j]) {
						aux = notas[i];
						notas[i] = notas[j];
						notas[j] = aux;
					}
				}
			}
			int naoTrocar = 0;
			for (int i = 1; i <= notas.length - 1; i++) {
				if (notas[i] == salvarNotas[i]) {
					naoTrocar++;
				}
				System.out.println(notas[i]);
			}
			System.out.println(naoTrocar);
		}
		scan.close();
	}
}
