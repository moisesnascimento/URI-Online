package iniciante;

public class URI_1116 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();

		for (int i = 0; i < N; i++) {

			double X = scan.nextDouble();
			double Y = scan.nextDouble();
			
			if (Y == 0) {
				System.out.println("divisao impossivel");
				
			}else {		
				double resultado = X / Y;			
				System.out.printf("%.1f%n",resultado);
			}
		}
		scan.close();
	}
}
