package uri_exercicios;

public class URI_2582 {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int C = scan.nextInt();

		String[] musicas = { "PROXYCITY", "P.Y.N.G.", "DNSUEY!", "SERVERS", "HOST!", "CRIPTONIZE", "OFFLINE DAY",
				"SALT", "ANSWER!", "RAR?", "WIFI ANTENNAS", };
		while (C > 0) {
            int X = scan.nextInt(), Y = scan.nextInt();
            System.out.println(musicas[X + Y]);
			C--;
		}
		scan.close();
	}
}
