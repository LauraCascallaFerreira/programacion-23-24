package Recursividad;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Un numero y te calculo el factorial");
		int num = scanner.nextInt();
		
		System.out.println("Factorial de: " + factorialRecursivo(num));
		
		
	}
	
	public static int factorialRecursivo(int numero) {
		if(numero == 1) {
			return 1;
		}
		return numero * factorialRecursivo(numero-1);
		
	}

}
