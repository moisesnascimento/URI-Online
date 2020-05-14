package iniciante;

import java.util.Scanner;

public class URI_1015 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double X1 = scan.nextDouble();
		double Y1 = scan.nextDouble();
		double X2 = scan.nextDouble();
		double Y2 = scan.nextDouble();
		
		
		double expressao1 = Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2);; 
		System.out.printf(".4f%s", Math.sqrt(expressao1), "\n");
		
		scan.close(); 
	}
}
