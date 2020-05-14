package iniciante;

public class URI_2581 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		while (scan.hasNext()) {
           int N = scan.nextInt();
           for (int i = 0; i <= N; i++) {
        	   String pergunta = scan.nextLine();
        	   if(pergunta.endsWith("?")) {
        		   System.out.println("I am Toorg!");
        	   }
           }
		}
		scan.close();
	}
}
