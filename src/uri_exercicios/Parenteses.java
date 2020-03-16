package uri_exercicios;

import java.util.Stack;

public class Parenteses {

	public static void main(String[] args) {
        
		java.util.Scanner scan = new java.util.Scanner(System.in);
		Stack<Character> pilha = new Stack<>();
		int N = scan.nextInt();
		
		for (int i = 0; i < N; i++) {
		char character = scan.next().charAt(0);
			if(character == '(') {
			pilha.push('(');
			}else if(character == ')') {
				if(pilha.isEmpty()) {
					//System.out.println("Vazio");
				}else {
					pilha.pop();
				}
			}
		}
		if(pilha.empty()) {
			System.out.println("Bem formada");
		}else {
			System.out.println("Mal formada");
		}
		scan.close();
	}
}
