package iniciante;

public class URI_1072 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();

		int contadorValoresIn = 0;
		int contadorValoresOut = 0;
		for (int i = 0; i < N; i++) {

			int valores = scan.nextInt();
			if (valores >= 10 && valores <= 20) {
				contadorValoresIn++;
			} else {
				contadorValoresOut++;
			}
		}
		System.out.println(contadorValoresIn + " in");
		System.out.println(contadorValoresOut + " out");
		scan.close();
	}

}
