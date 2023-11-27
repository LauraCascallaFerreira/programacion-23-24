package Trimestre1.pruebas;

import java.util.Scanner;

public class LauraCascallanaFerreira_ejercicio4B {

    //Pasar un número de sistema decimal a binario mediante el siguiente método: 
    //dividiendo sucesivamente entre dos y quedándose con el cociente, hasta la última
    //división donde el resto ya solo será cero o uno. El número convertido se construye
    //desde el último resto añadiendo después los cocientes que hemos ido obteniendo

    public static void transformaBinario(int dato) {
		if (dato<2)
			System.out.print(dato);
		else {
			transformaBinario(dato/2);
			System.out.print(dato%2);
		}
	}
	
	//la base sera octal
	
	public static void transformaOctal(int dato) {
		if (dato<8)
			System.out.print(dato);
		else {
			transformaOctal(dato/8);
			System.out.print(dato%8);
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Dame un dato: ");
		int dato=sc.nextInt();
		System.out.print("Pasado a binario es: ");
		transformaBinario(dato);
		System.out.println();
		System.out.print("Pasado a octal es: ");
		transformaOctal(dato);

		}
    
}
