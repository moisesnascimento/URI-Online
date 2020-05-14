package string;

public class URI_2651 {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String str = scan.next();
		str = str.substring(0, str.length());
		System.out.println(str);
		if (str.length() < 5) {
			System.out.println("Link Tranquilo");
		} else {
			str = str.substring(0, 5);
			if (str.equalsIgnoreCase("zelda")) {
				System.out.println("Link Bolado");
			} else {
				System.out.println("Link Tranquilo");
			}
		}
		scan.close();
	}
}
