package iniciante;

public class URI_1131 {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);

		int numeroVitoriasInter = 0, numeroVitoriasGremio = 0, empate = 0;
		int X;
		int numeroPartidas = 0;
		do {
			int numeroGolsInter = scan.nextInt();
			int numeroGolsGremio = scan.nextInt();
			System.out.println("Novo grenal (1-sim 2-nao)");
			X = scan.nextInt();
			numeroPartidas++;

			if (numeroGolsInter > numeroGolsGremio) {
				numeroVitoriasInter++;
			} else if (numeroGolsGremio > numeroGolsInter) {
				numeroVitoriasGremio++;
			} else if (numeroGolsInter == numeroGolsGremio) {
				empate++;
			}
		} while (X != 2);
		
		System.out.println(numeroPartidas + " grenais");
		System.out.println("Inter:" + numeroVitoriasInter);
		System.out.println("Gremio:" + numeroVitoriasGremio);
		System.out.println("Empates:" + empate);	
		if (numeroVitoriasInter > numeroVitoriasGremio) {
			System.out.println("Inter venceu mais");
		} else if (numeroVitoriasGremio > numeroVitoriasInter) {
			System.out.println("Gremio venceu mais");
		} else {

		}
		scan.close();
	}
}
