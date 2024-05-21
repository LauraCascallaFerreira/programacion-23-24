package trimestre3.herencia.Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class ColeccionLibros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int opcion;
		
		ArrayList<Libro> coleccionLibros = new ArrayList<>();
		Biblioteca biblioteca = new Biblioteca("Nacional",coleccionLibros);
		
		biblioteca.cargarLibros(biblioteca);


        
			System.out.println("\nBIBLIOTECA");
			System.out.println("===================");
			System.out.println("1. Listado");
			System.out.println("2. Buscar libro");
			System.out.println("3. Nuevo libro");
			System.out.println("4. Guardar libro");
			System.out.println("5. Cargar libro");
			System.out.println("6. Borrar libro");
			System.out.println("7. Salir");
			System.out.print("Introduzca una opción: ");
			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println("");

			switch(opcion) {
			case 1:
				biblioteca.listarLibros();
			break;
				
			case 2:
				System.out.println("Introduce el título: ");
				String titulo = sc.nextLine();
				
				System.out.println("Introduce el autor: ");
				String autor = sc.nextLine();
				
				System.out.println("Introduce el año de publicación: ");
				int añoPublicacion = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Introduce la editorial: ");
				String editorial = sc.nextLine();
				
				System.out.println("Introduce el isbn: ");
				String isbn = sc.nextLine();
				
				biblioteca.NuevoLibro(titulo, autor, añoPublicacion, editorial, isbn);
				break;
			
			case 3:
				biblioteca.borrarLibro(biblioteca.BuscarLibro());
				break;
			
			case 4:
				biblioteca.BuscarLibro();
				break;
			
			case 5:
				biblioteca.guardarLibros(biblioteca);				
				break;
			
			case 6:
				biblioteca.cargarLibros(biblioteca);
				break;
            
            case 7:
                System.out.println("Has salido correctamente.");
            break;

			default:
                System.out.println("Has introducido una opción que no existe.");
			}

		biblioteca.guardarLibros(biblioteca);
        sc.close();
	}
        
}
    

