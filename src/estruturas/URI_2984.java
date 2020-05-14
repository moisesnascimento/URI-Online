package estruturas;

import java.util.Stack;

public class URI_2984 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		Stack<Character> pilha = new Stack<>();
		String S = scan.next();

		char[] arrayChar = S.toCharArray();
		for (int i = 0; i < arrayChar.length; i++) {
			if (arrayChar[i] == '(') {
				pilha.push('(');
			} else if (arrayChar[i] == ')') {
				if (pilha.isEmpty()) {
					pilha.push(')');
				}
				pilha.pop();
			}
		}
		int X = 0;
		for (int i = 0; i < pilha.size(); i++) {
			if (pilha.get(i) == '(') {
				X++;
			}
		}
		if (X > 0) {
			System.out.printf("Ainda temos %d assunto(s) pendente(s)!%n", X);
		} else {
			System.out.println("Partiu RU!");
		}
		scan.close();
	}
}
