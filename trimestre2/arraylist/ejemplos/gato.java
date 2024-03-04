package trimestre2.arraylist.ejemplos;

public class gato implements Comparable <gato>{
    private String nombre;
	private String color;
	private String raza;

	public gato(String nombre, String color, String raza) {
		this.nombre = nombre;
		this.color = color;
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public String getRaza() {
		return raza;
		}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", color=" + color + ", raza=" + raza + "]";
	}
	
	public int compareTo(gato g) {
		return (this.nombre).compareTo(g.getNombre());
	}

	public boolean equals(gato g) {
		return (this.nombre).equals(g.getNombre());
	}
}
