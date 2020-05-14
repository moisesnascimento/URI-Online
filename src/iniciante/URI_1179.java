package iniciante;

public class URI_1179 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		int[] pares = new int[5];
		int[] impar = new int[5];


		int contadorPar = 0;
		for (int i = 0; i < 5; i++) {
			int valores = scan.nextInt();
				if (valores % 2 == 0) {
					contadorPar = 0;
					pares[i] = valores;
					contadorPar++;
					
				} else {
					impar[i] = valores;
				
				}
			System.out.println("par["+ contadorPar + "]" + pares[i]);
		}
		System.out.println(pares.length);
		//System.out.println("PARES: " + pares[i]);
		scan.close();
	}
}
