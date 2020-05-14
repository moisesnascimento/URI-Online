package string;

public class URI_2694 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		int N = scan.nextInt();
		while (N > 0) {
			String codigo = scan.next();

			int num = Integer.parseInt(codigo.substring(2, 4));
			int num2 = Integer.parseInt(codigo.substring(5, 8));
			int num3 = Integer.parseInt(codigo.substring(11));

			System.out.println(num + num2 + num3);
			N--;
		}
		scan.close();
	}
}
