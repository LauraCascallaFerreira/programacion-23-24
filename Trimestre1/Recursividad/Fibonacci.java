package trimestre1.recursividad;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		for(int i = 0;i<20;i++) {
			System.out.println(fibonacci(i));
			
			
		}
		
		
	}
	
	public static int fibonacci(int numero) {
		if(numero<=1) {
			return numero;
		}
		
		return fibonacci(numero-1) + fibonacci(numero-2);
		
	}

}
