package uri_exercicios;

public class URI_1933 {

	public static void main(String[] args) {
	
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int A = scan.nextInt(), B = scan.nextInt();
		
		if(A == B) {
			System.out.println(A);
		}else if(A > B) {
			System.out.println(A);
		}else {
			System.out.println(B);
		}
		scan.close();
	}
}
