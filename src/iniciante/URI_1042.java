package iniciante;

public class URI_1042 {

	public static void main(String[] args) {

		try (java.util.Scanner scan = new java.util.Scanner(System.in)) {

			int A = scan.nextInt();
			int B = scan.nextInt();
			int C = scan.nextInt();

			int maior = 0;
			int menor = 0;
			int meio = 0;

			if (A > B) {
				maior = A;
			} else {
				maior = B;
			}
			if (C > maior) {
				maior = C;
			}
			
			if (A < B) {
				menor = A;
			} else {
				menor = B;
			}

			if (C < menor) {
				menor = C;
			}
			
			if(A > menor && A < maior) {
				
				meio = A;
			}
            if(B > menor && B < maior) {
				
				meio = B;
			}
            if(C > menor && C < maior) {
				
				meio = C;
			}
            
            System.out.println(menor);
            System.out.println(meio);
            System.out.println(maior);
            
		}
	}
}
