package iniciante;

public class URI_2172 {

	public static void main(String[] args) {
	
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		while(scan.hasNext()) {
			int exp = scan.nextInt(), expMonstro = scan.nextInt();
			if(exp == 0 && expMonstro == 0) {
				break;
			}
			System.out.println(exp * expMonstro);
			
		}
		scan.close();
	}
}
