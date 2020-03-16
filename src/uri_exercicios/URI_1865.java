package uri_exercicios;

public class URI_1865 {

	public static void main(String[] args) {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int C = scan.nextInt();
		
		int contador = 0;
		while(contador < C) {
			String pessoa = scan.next();
			//int força = scan.nextInt();
			if(pessoa.equalsIgnoreCase("Thor")) {
				System.out.println("Y");
			}else {
				System.out.println("N");
			}
			contador++;
		}
		scan.close();
	}
}
