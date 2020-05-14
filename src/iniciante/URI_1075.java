package iniciante;

public class URI_1075 {

	public static void divisao(int N) {

		for (int i = 1; i <= 10000; i++) {
           
			if(i % N == 2)
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		URI_1075.divisao(scan.nextInt());

		scan.close();
	}
}
