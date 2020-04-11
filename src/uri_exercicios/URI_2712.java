package uri_exercicios;

public class URI_2712 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();

		while (N > 0) {
			String placaAnalisada = scan.next();
			if (placaAnalisada.matches("[A-Z]{3}-[0-9]{4}")) {
				if (placaAnalisada.endsWith("1") || placaAnalisada.endsWith("2")) {
					System.out.println("MONDAY");
				} else if (placaAnalisada.endsWith("3") || placaAnalisada.endsWith("4")) {
					System.out.println("TUESDAY");
				} else if (placaAnalisada.endsWith("5") || placaAnalisada.endsWith("6")) {
					System.out.println("WEDNESDAY");
				} else if (placaAnalisada.endsWith("7") || placaAnalisada.endsWith("8")) {
					System.out.println("THURSDAY");
				} else if (placaAnalisada.endsWith("9") || placaAnalisada.endsWith("0")) {
					System.out.println("FRIDAY");
				}
			} else {
				System.out.println("FAILURE");
			}
			N--;
		}
		scan.close();
	}
}
