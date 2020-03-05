package uri_exercicios;

public class URI_1930 {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int T1 = scan.nextInt();
		int T2 = scan.nextInt();
		int T3 = scan.nextInt();
		int T4 = scan.nextInt();

		int totalTomadas = T1 + T2 + T3 + T4;
		System.out.println(totalTomadas - 3);
	
		scan.close();
	}
}
