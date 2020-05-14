package iniciante;

public class URI_2863 {

	public static void main(String[] args) {
	
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		while(scan.hasNext()) {
			int T = scan.nextInt();
			double aux = 100.0;
			for (int i = 0; i < T; i++) {
				double tempo = scan.nextDouble();
				if(tempo < aux) {
					aux = tempo;
				}
			}
			System.out.println(aux);
		}
		scan.close();
	}
}
