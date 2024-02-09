package trimestre2.arrays.coleccion;

import java.util.Scanner;

public class coleccionDeDiscosPrincipal {
	public static void main(String[] args) {

		//Determina el tamaño del array
	    final int N=10;

		//Crea el array de discos
	    disco[] discos= new disco[N];

		//Determina los discos que van en cada posicion
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
				
				//Busca la primera posicion libre del array
				int primeraLibre=-1;
				do{
					primeraLibre++;
					System.out.println(primeraLibre);
				} while(!((discos[primeraLibre].getCodigo()).equals("LIBRE")));
				
				System.out.println("Por favor, introduzca los datos del disco.");
				System.out.print("Código: ");
				codigoIn = s.nextLine();
				System.out.print("Autor: ");
				autorIn = s.nextLine();
				System.out.print("Título: ");
				tituloIn = s.nextLine();
				System.out.print("Género: ");
				generoIn = s.nextLine();
				System.out.print("Duración: ");
				duracionIn = Integer.parseInt(s.nextLine());

				discos[primeraLibre] = new disco(codigoIn, autorIn, tituloIn,
				generoIn, duracionIn);
			break;

			case 3:
				System.out.println("\nMODIFICAR");
				System.out.println("===========");

				System.out.println("Introduzca el código del disco cuyos datos deseas cambiar:");
				codigoIn=s.nextLine();

				int i=-1;
				do{
					i++;
				} while(!((discos[i].getCodigo()).equals(codigoIn)));

				System.out.println("Introduzca los nuevos datos del disco o "+
				"INTRO para dejarlos igual.");

				System.out.println("Código: " + discos[i].getCodigo());
				System.out.print("Nuevo código: ");
				codigoIn = s.nextLine();
				if (!codigoIn.equals("")) {
					discos[i].setCodigo(codigoIn);
				}

				System.out.println("Autor: " + discos[i].getAutor());
				System.out.print("Nuevo autor: ");
				autorIn = s.nextLine();
				if (!autorIn.equals("")) {
					discos[i].setAutor(autorIn);
				}

				System.out.println("Título: " + discos[i].getTitulo());
				System.out.print("Nuevo título: ");
				tituloIn = s.nextLine();
				if (!tituloIn.equals("")) {
					discos[i].setTitulo(tituloIn);
				}

				System.out.println("Género: " + discos[i].getGenero());
				System.out.print("Nuevo género: ");
				generoIn = s.nextLine();
				if (!generoIn.equals("")) {
					discos[i].setGenero(generoIn);
				}

				System.out.println("Duración: " + discos[i].getDuracion());
				System.out.print("Duración: ");
				final String duracionIntroducidaString = s.nextLine();
				if (!duracionIntroducidaString.equals("")) {
					discos[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
				}
			break;

			case 4:
				System.out.println("\nBORRAR");
				System.out.println("======");
				System.out.println("Introduce el codigo del disco que deseas borrar:");
				codigoIn=s.nextLine();

				for(int j=0; j<N ;j++){
					//si coincide hago
					if(discos[j].getCodigo().equals(codigoIn)){
						discos[j] = new disco();
						System.out.println("Disco borrado.");
					}
				}

				/*i=-1;
				do{
					i++;
				}while(!((discos[i].getCodigo()).equals(codigoIn)));
				discos[i].setCodigo("LIBRE");
				System.out.println("Disco borrado.");*/
			break;

			default:
			} // switch
		} while (opcion != 5);
	}
}