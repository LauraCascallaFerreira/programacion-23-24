package trimestre1.correccion_examen;

import java.util.Scanner;

public class ejercicio4A {
    public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num;
		// Solicitud de datos al usuario
		System.out.println("Este programa calcula el precio a pagar por alumno en "
				+ "el viaje fin de curso, según la cantidad que se apunte.:");
		System.out.print("Número de alumnos: ");
		num = scanner.nextInt();
		// Realizamos Cálculos y mostramos en pantalla
		if (num >= 100) {
			System.out.println("El pago a la agencia es de " + num * 65 + " "
					+ "euros y cada alumno debe pagar 65 euros");
		} else if (num < 100 && num >= 50) {
			System.out.println("El pago a la agencia es de " + num * 70 + " "
					+ "euros y cada alumno debe pagar 70 euros");
		} else if (num < 50 && num >= 30) {
			System.out.println("El pago a la agencia es de " + num * 95 + " "
					+ "euros y cada alumno debe pagar 95 euros");
		} else {
			System.out.println("El coste del autobús es de 4000 euros y cada alumno " + "debe pagar "
					+ (4000 / num) + " euros.");
		}
	}
    
}
