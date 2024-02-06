package trimestre2.arrays.coleccion;

import java.util.Scanner;

public class coleccionDeDiscosPrincipal {
	public static void main(String[] args) {

	    final int N=10;

	    disco[] discos= new disco[N];

	    for(int i=0; i<N; i++) {
		    discos[i]= new disco();
	    }

	    discos[0] = new disco("GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
	    discos[1] = new disco("FGHQ64", "Metallica", "Black album", "hard rock", 46);
	    discos[2] = new disco("TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);
		
        Scanner s= new Scanner (System.in);

        int opcion;
		String codigoIn;
		String autorIn;
		String tituloIn;
		String generoIn;
		int duracionIn;

        do {
			System.out.println("\nCOLECCIÓN DE DISCOS");
			System.out.println("===================");
			System.out.println("1. Listado");
			System.out.println("2. Nuevo disco");
			System.out.println("3. Modificar");
			System.out.println("4. Borrar");
			System.out.println("5. Salir");
			System.out.print("Introduzca una opción: ");
			opcion = Integer.parseInt(s.nextLine());

			switch (opcion) {
			case 1:
				System.out.println("\nLISTADO");
				System.out.println("=======");

				for (disco d : discos) {
					if (!d.getCodigo().equals("LIBRE")) {
						System.out.println(d);
					}
				}
			break;

			case 2:
				System.out.println("\nNUEVO DISCO");
				System.out.println("===========");
			break;

			case 3:
				System.out.println("\nMODIFICAR");
				System.out.println("===========");
			break;

			case 4:
				System.out.println("\nBORRAR");
				System.out.println("======");
			break;

			default:
			} // switch
		} while (opcion != 5);
	}
}