package trimestre3.herencia.fockingCiclistas;

import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {

	//ATRIBUTO PARA LA POSICION
	private int Posicion;

	//GETTERS Y SETTERS
	public int getPosicion(){
		return Posicion;
	}

	public void setPosicion(int posicion){
		Posicion=posicion;
	}
    
	//ATRIBUTOS
    private String nombre; /* Atributo que define el nombre del equipo de ciclismo */

	private static double totalTiempo; /* Atributo que define el tiempo total obtenido por el equipo */

	private String pais; /* Atributo que define el país al que pertenece el equipo */

	ArrayList<Ciclista> listaCiclistas; // Atributo que define un vector de objetos ciclista

	//CONSTRUCTOR
	public Equipo(String nombre, String pais) {
		this.nombre = nombre;
		this.pais = pais;
		totalTiempo = 0; // Se inicializa el tiempo del equipo en cero
		listaCiclistas = new ArrayList<>(); /* Se crea el vector de ciclistas que conforma el equipo */
	}

	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * Método que añade un ciclista al vector de ciclistas de un equipo
	 */
	void añadirCiclista(Ciclista ciclista) {
		listaCiclistas.add(ciclista); // Se agrega el ciclista al vector de ciclistas
	}

	/**
	 * Método que muestra en pantalla los nombres de los ciclistas que conforman un
	 * equipo
	 */
	void listarEquipo() {
		/*
		 * Se recorre el array de ciclistas y para cada elemento se imprime el nombre
		 * del ciclista
		 */
		for (int i = 0; i < listaCiclistas.size(); i++) {
			Ciclista c = (Ciclista) listaCiclistas.get(i); /* Se aplica casting para extraer el elemento */
			System.out.println(c.getNombre());
		}
	}

	/**
	 * Método que busca un ciclista ingresado por teclado
	 */
	void buscarCiclista() {
		System.out.println("Introduce nombre:");
		Scanner sc = new Scanner(System.in); /* Se solicita texto ingresado por teclado */
		String nombreCiclista = sc.nextLine();
		boolean esta = false;
		for (int i = 0; i < listaCiclistas.size(); i++) { /* Se recorre el vector de ciclistas */
			Ciclista c = (Ciclista) listaCiclistas.get(i); /* Se obtiene un elemento del array */
			if (c.getNombre().equals(nombreCiclista)) { /* Si el nombre ingresado se encuentra */
				System.out.println(c.getNombre());
			}
		}
		if(!esta){
			System.out.println("Ciclista no encontrado");
		}
	}

	/**
	 * Método que calcula el tiempo total de un equipo acumulando el tiempo obtenido
	 * por cada uno de sus ciclistas
	 */
	void calcularTotalTiempo() {
		for (int i = 0; i < listaCiclistas.size(); i++) { // Se recorre el vector
			Ciclista c = (Ciclista) listaCiclistas.get(i); /* Se obtiene un elemento del vector */
			// Se acumula el tiempo del ciclista en el tiempo del equipo
			totalTiempo += c.getTiempoAcumulado();
		}
	}

	/**
	 * Método que muestra en pantalla los datos de un equipo
	 */
	void imprimir() {
		System.out.println("Nombre del equipo = " + nombre);
		System.out.println("Pais = " + pais);
		System.out.println("Total tiempo del equipo = " + totalTiempo);
	}
}
