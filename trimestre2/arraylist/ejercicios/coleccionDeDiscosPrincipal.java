package trimestre2.arraylist.ejercicios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class coleccionDeDiscosPrincipal {

    static ArrayList<disco> discos = new ArrayList<disco>();
	public static int scanyint(String texto) {
		boolean error;
		int res = 0;
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print(texto);
				res = sc.nextInt();
				error = false;

			} catch (Exception e) {
				System.out.println("Error, dame un entero.");
				error = true;
			}

		} while (error);

		return res;

	}

	public static String scanystring(String texto) {
		Scanner sc = new Scanner(System.in);
		System.out.print(texto);
		return sc.nextLine();
        
	}

	public static int buscardisc(ArrayList<disco> d, String cod) {
		// devuelve la posicion del disco pasandole el codigo
		int pos = -1;
		for (int i = 0; i < d.size(); i++) {
			if (d.get(i).getCodigo().equals(cod)) {
				pos = i;
			}
		}
		return pos;
	}

	public static final String NOMBRE_FICHERO = "MisDiscos.obj";
	

	public static void guardarDiscos() {
		try {
			// abrimos la tuberia
			FileOutputStream fileOut = new FileOutputStream(NOMBRE_FICHERO);
			// le indicamos a los objetos que tienen que pasar por esa tuberia "fileOUT"
			ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
			// escribimos objetos en el flujo de salida
			objOut.writeObject(discos);
			objOut.close();
			fileOut.close();
			System.out.println("ArrayList guardado en Disco.ser");
		} catch (IOException e) {
			System.out.println("error al guardar en archivo" + e.getMessage());
		}
	}

	public static void cargarDiscos() {
		try {
			// Cargar el ArrayList desde el archivo
			FileInputStream fileIn = new FileInputStream(NOMBRE_FICHERO);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			
			discos= (ArrayList<disco>) in.readObject();
			in.close();
			fileIn.close();
			// Mostrar el ArrayList cargado
			System.out.println("ArrayList cargado desde"+NOMBRE_FICHERO);
			} catch (IOException  | ClassNotFoundException e) {
			System.out.println("error al guardar en archivo" + e.getMessage());
		}
	}

	public static void main(String[] args) {

		// Carga varios discos
		discos.add(new disco("GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50));
		discos.add(new disco("FGHQ64", "Metallica", "Black album", "hard rock", 46));
		discos.add(new disco("TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42));

		int opcion;

		String codigoInt;
		String autorInt;
		String tituloInt;
		String generoInt;
		String duracionIntStr;
		int duracionInt;
		int posdisco;

		boolean encontrado = false;

		do {
			System.out.println("\nCOLECCIÓN DE DISCOS");
			System.out.println("===================");
			System.out.println("1. Listado");
			System.out.println("2. Nuevo disco");
			System.out.println("3. Modificar");
			System.out.println("4. Borrar");
			System.out.println("5. Salir");
			System.out.println("6. Editar codigo");
			System.out.println("7. Guardar a FICHERO");
			System.out.println("8. Cargar desde FICHERO");
			opcion = scanyint("Introduzca una opción: ");

			switch (opcion) {
			case 1:
				System.out.println("\nLISTADO");
				System.out.println("=======");
				Collections.sort(discos);
				for (disco d : discos) {
					System.out.println(d);
				}

				break;

			case 2:
				System.out.println("\nNUEVO DISCO");
				System.out.println("===========");

				System.out.println("Por favor, introduzca los datos del disco.");
				codigoInt = scanystring("Código: ");
				encontrado = buscardisc(discos, codigoInt) >= 0;

				if (encontrado) {
					System.out.println("Ya existe un disco con ese ");
				} else {
					discos.add(new disco(codigoInt, scanystring("Autor: "), scanystring("Título: "),
							scanystring("Género: "), scanyint("Dame la duracion: ")));
				}

				break;

			case 3:
				System.out.println("\nMODIFICAR");
				System.out.println("===========");

				codigoInt = scanystring("Por favor dime el codigo del disco cuyos datos deseas modificar de :");

				posdisco = buscardisc(discos, codigoInt);
				encontrado = buscardisc(discos, codigoInt) >= 0;

				if (encontrado) {

					System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
					System.out.println("Código: " + discos.get(posdisco).getCodigo());
					codigoInt = scanystring("Dame el nuevo codigo");

					// Elimino del array
					disco ndisc = discos.get(posdisco);

					if (!codigoInt.equals("")) {
						ndisc.setCodigo(codigoInt);
					}
					System.out.println("Autor: " + ndisc.getAutor());
					autorInt = scanystring("Dame el nuevo autor: ");
					if (!autorInt.equals("")) {
						ndisc.setAutor(autorInt);
					}
					System.out.println("Titulo: " + ndisc.getTitulo());
					tituloInt = scanystring("Dame el nuevo titulo: ");
					if (!tituloInt.equals("")) {
						ndisc.setTitulo(tituloInt);
					}
					System.out.println("Genero: " + ndisc.getGenero());
					generoInt = scanystring("Dame el nuevo genero: ");
					if (!generoInt.equals("")) {
						ndisc.setGenero(generoInt);
					}
					System.out.println("Genero: " + ndisc.getDuracion());
					duracionIntStr = scanystring("Dame la nueva duracion: ");
					if (!duracionIntStr.equals("")) {
						ndisc.setDuracion(Integer.parseInt(duracionIntStr));
					}

					discos.set(posdisco, ndisc);

				} else {
					System.out.println("No se ha encontrado el disco desdeado.");
				}

				break;

			case 4:
				System.out.println("\nBORRAR");
				System.out.println("======");

				codigoInt = scanystring("Por favor dime el codigo del disco que deseas borrar :");

				posdisco = buscardisc(discos, codigoInt);
				encontrado = buscardisc(discos, codigoInt) >= 0;

				if (encontrado) {
					discos.remove(posdisco);
					System.out.println("Album borrado");
				} else {
					System.out.println("Disco no encontrado");
				}

				break;
			case 6:
				System.out.println("\nEditar codigo");
				System.out.println("===========");

				codigoInt = scanystring("Por favor dime el codigo del disco cuyo codigo deseas modificar de :");
				posdisco = buscardisc(discos, codigoInt);

				if (posdisco >= 0) {
					System.out.println("\nEl codigo del disco modificado es: " + discos.get(posdisco));
					codigoInt = scanystring("Dame el nuevo código: ");
					disco comodin = discos.get(posdisco);
					comodin.setCodigo(codigoInt);
					discos.set(posdisco, comodin);
				} else
					System.out.println("Código no encontrado");

				break;
			case 7:
				System.out.println("\nGUARDADO en FICHERO externo");
				System.out.println("===========");
				guardarDiscos();
				break;
			case 8:
				System.out.println("\nCARGADO desde FICHERO externo");
				System.out.println("===========");
				cargarDiscos();
				break;
			default:
				System.out.println("Opcion no valida");
			
				
				
			}
		} while (opcion != 5);
        
	}
}