package iniciante;


public class URI_2167 {

	public static void main(String[] args) {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();
		
		int [] rpm = new int [N + 1];
		for (int i = 1; i <= rpm.length - 1; i++) {
			rpm[i] = scan.nextInt();
		}
		int menorMedida = 0;
		for (int i = 1; i <= rpm.length - 1; i++) {
			if(rpm[i - 1] > rpm[i]) {
				menorMedida = i;
				break;
			}
		}
		System.out.println(menorMedida);
		scan.close();
	}
}
