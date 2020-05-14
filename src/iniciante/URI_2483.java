package iniciante;

public class URI_2483 {

	public static void main(String[] args) {
	
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int I = scan.nextInt();
		String str = "Feliz Natal";
		if(str.charAt(9) == 'a') {
			System.out.print("Feliz nat");
			for (int j = 0; j < I; j++) {
				System.out.print("a");
			}
			System.out.println("l!");
		}
		scan.close();
	}
}
