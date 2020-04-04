package uri_exercicios;

public class URI_1332 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();
		while (N > 0) {
			String palavrasEscritas = scan.next();
			char[] charArray = palavrasEscritas.toCharArray();

			if (charArray[0] == 'o' && charArray[2] == 'e' || 
					charArray[1] == 'n' && charArray[2] == 'e' ||
					charArray[0] == 'o' && charArray[1] == 'n') {
				System.out.println("1");
			} else if(charArray[0] == 't' && charArray[1] == 'w' ||
					charArray[1] == 'w' && charArray[2] == 'o'||
					charArray[0] == 't' && charArray[2] == 'o'){
				System.out.println("2");
			}else if(charArray[0] == 't' && charArray[1] == 'h' && charArray[2] == 'r' && charArray[3] == 'e' ||
					charArray[0] == 't' && charArray[1] == 'h' && charArray[2] == 'r' && charArray[4] == 'e' ||
					charArray[0] == 't' && charArray[1] == 'h' && charArray[3] == 'e' && charArray[4] == 'e' ||
					charArray[0] == 't' && charArray[2] == 'r' && charArray[3] == 'e' && charArray[4] == 'e' ||
					charArray[1] == 'h' && charArray[2] == 'r' && charArray[3] == 'e' && charArray[4] == 'e') {
				System.out.println("3");
			}else {
				System.out.println();
			}

			N--;
		}
		scan.close();
	}
}
