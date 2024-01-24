package trimestre1.dos;
import java.util.Scanner;

public class rebajas {
    
    public static double descubreOriginal(double actual, double porcentaje) {
		return actual/(1-(porcentaje/100));
	}
	
	public static double descubreActual(double original, double porcentaje) {
		double descuento;
		descuento = (original*porcentaje)/100;
		return original-descuento;
	}
	
	public static double descubrePorcentaje(double original, double actual) {
		return ((original-actual)/original)*100;
	}

	public static void main(String[] args) {
		
		double original, actual, porcentaje;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Precio original:");
		original=sc.nextDouble();
		System.out.println("Descuento:");
		porcentaje=sc.nextDouble();
		
		System.out.println("Precio actual: "+descubreActual(original, porcentaje));
	}
}
