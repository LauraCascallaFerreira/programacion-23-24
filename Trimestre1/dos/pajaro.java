package trimestre1.dos;
public class pajaro {

    // *** atributos o propiedades ****

		private char color; // propiedad o atributo color
		private int edad; // propiedad o atributo edad
		private String nombre;
		private static int numPajaros=0; //sirve como contador del numero de pajaros creados

		//constructor por defecto

		pajaro(){
		}

		//constructor con un parametro

		pajaro(String nome){
			this.nombre = nome;
		}

		//constructor con todos los parametros

		pajaro(char c, int e, String n){
			this.color= c;
			this.edad= e;
			this.nombre= n;
		}

		// *** métodos de la clase ****

		public void setNombre(String nb) {
			this.nombre=nb;
		}

		public String getNombre() {
			return this.nombre;
		}

		public void setedad(int e) {
			edad = e;
		}

		public int getEdad() {
			return this.edad;
		}

		public void imprimeedad() { //no da un entero
			System.out.println(edad);
		} 

		public void setcolor(char c) {
			color = c;
		}

		public char getColor() {
			return this.color;
		}

		public void imprimenombre() {
			System.out.println(nombre);
		}

		@Override

		public String toString() {
			return "pajaro [color=" + color + ", edad=" + edad + ", nombre=" + nombre + "]";
		}

		public void imprimecolor() {
			switch (color) {

			// Los pájaros son verdes, amarillos, grises, negros o blancos

			// No existen pájaros de otros colores

			case 'v':
				System.out.println("verde");
			break;
			
			case 'a':
				System.out.println("amarillo");
			break;

			case 'g':
				System.out.println("gris");
			break;

			case 'n':
				System.out.println("negro");
			break;

			case 'b':
				System.out.println("blanco");
			break;

			default:
				System.out.println("color no establecido");
			}

		}
    
}
