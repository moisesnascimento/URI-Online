package iniciante;

public class URI_1052 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		String[] meses = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		
		int mes = scan.nextInt();

		System.out.println(meses[mes - 1]);

		scan.close();
	}

}
