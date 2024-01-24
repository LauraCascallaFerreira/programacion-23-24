package trimestre1.correccion_examen;

import java.util.Scanner;

public class ejercicio4B {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int duracion;
		String dia;
		String horario;
		double precio;
		double impuesto;
		// Solicitud de datos al usuario
		System.out.println("Calculamos el precio base de la llamada y el impuesto a pagar:");
		System.out.print("Duración de la llamada en minutos: ");
		duracion = scanner.nextInt();
		System.out.print("Día de la semana: ");
		dia = scanner.next();
		scanner.nextLine();

		
		//SUPONEMOS PRECIO TOTAL EN CADA FRANJA ACUMULATIVO
		// Calculamos el precio base a pagar:
		if (duracion > 10) {
			precio = 3;  //1+0.8+0.7+0.5
		} else if (duracion > 8) {
			precio = 2.5; //1+0.8+0.7
		} else if (duracion > 5) {
			precio = 1.80;//1+0.8
		} else {
			precio = 1; //1
		}

		// Preguntamos día y calculamos impuesto correspondiente.
		if (!dia.toUpperCase().equals("DOMINGO")) {
			System.out.print("¿La llamada se realizó en horario de mañana o tarde? ");
			horario = scanner.nextLine();
			if (horario.toUpperCase().equals("MAÑANA")) {
				impuesto = precio * 0.15; //solo el impuesto
			} else if (horario.toUpperCase().equals("TARDE")) {
				impuesto = precio * 0.10; //solo el impuesto
				// Si el horario es incorrecto se dará valor 0 al impuesto y el programa
				// presentará error.
			} else {
				impuesto = 0; //si no lo contemplas no pasa nada
			}
		} else {
			impuesto = precio * 0.03; //impuesto domingo
		}

		// Mostramos resultado en pantalla, si horario incorrecto, mostrará error.
		if (impuesto == 0) {
			System.out.println("El horario introducido es incorrecto, reinicia el programa "
					+ "e introduce los valores correctos.");
		} else {
			System.out.println("El precio total de la llamada es de " + (precio + impuesto)
					+ " siendo el precio base de " + precio + " y el impuesto a pagar " + impuesto);
		}
	}
}
