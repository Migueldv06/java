import java.util.Scanner;
import java.lang.Math;
public class Calc{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe qual tipo de operação deseja(+ - * /):");
		char op = scanner.next().charAt(0);
		System.out.println("Informe o X da Conta X " + op + " Y");
		int x = scanner.nextInt();
		System.out.println("Informe o Y da Conta: " + x + " " + op + " Y");
		int y = scanner.nextInt();
		
		int r;
		switch (op) {
			case '+':
				r = x + y;
				break;
				
			case '-':
				r = x - y;
				break;
			case '*':
				r = x * y;
				break;
				
			case '/':
				r = x / y;
				break;
			default:
				r = 0;
		}
		
		System.out.println("Resposta de: " + x + " " + op + " " + y + " = " + r);
		
		scanner.close();
	}
}
