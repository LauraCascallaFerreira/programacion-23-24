/*Realiza una clase Temperatura, la cual convierta grados Celsius a Farenheit y 
	 * viceversa. Para ello crea dos métodos double celsiusToFarenheit(double) y 
	 * double farenheitToCelsius(double). 
	 * En la construcción ten en cuenta las siguientes fórmulas:
	 * Fahrenheit a Celsius C = (F - 32)/l,8
	 * Celsius a Fahrenheit F = (1,8)C + 32*/

import java.util.Scanner;

public class resuelto01 {
    
    public static double celsiusToFarenheit(double celsius) {
		double farenheit;
		farenheit = (1.8)*celsius+32;
		return farenheit;
		
	}
	
	public static double farenheitToCelsius(double farenheit) {
		double celsius;
		celsius=(farenheit-32)/1.8;
		return celsius;
	}
	
	public static void main(String[] args) {
		
		double variable;
		char eleccion;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un valor.");
		variable=sc.nextDouble();
		
		System.out.println("Pasar de celsius a farenheit (a)");
		System.out.println("Pasar de farenheit a celsius (b)");
		System.out.println("Salir (c)");
		
		eleccion=sc.next().charAt(0);
		
		System.out.println();
		
		switch(eleccion) {
		
		case 'a':
			System.out.println(celsiusToFarenheit(variable));
		break;
		
		case 'b':
			System.out.println(farenheitToCelsius(variable));
		break;
		
		case 'c':
			System.out.println("Has salido.");
		break;
		
		default:
			System.out.println("Elección errónea.");
		}
	}
}
