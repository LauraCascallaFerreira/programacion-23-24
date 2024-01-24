package trimestre1.dos;
/*Crea una clase con un método millasAMetros() que toma como parámetro de entrada 
 * un valor en millas marinas y las convierte a metros.
 * Una vez tengas este método escribe otro millasAKilometros() que realice la 
 * misma conversión, pero esta vez exprese el resultado en kilómetros.
 * Nota: 1 milla marina equivale a 1852 metros.*/

import java.util.Scanner;

public class millas {

    public static void main(String[] args) {
		
		double millas;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame unas millas:");
		millas=sc.nextDouble();
		System.out.println(millasAMetros(millas));
		System.out.println(millasAKm(millas));
	}
	
	public static double millasAMetros(double millas) {
		double metros;
		metros=millas*1852;
		return metros;
	}
	
	public static double millasAKm(double millas) {
		double metros;
		double km;
		metros=millas*1852;
		km=metros*1000;
		return km;
	}
	
	public static double kmAMillas(double km) {
		return 1000*km/1852;
	}
    
}
