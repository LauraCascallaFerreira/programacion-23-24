package trimestre1.cosasExamen;
import java.util.Objects;

public class rectangulo implements Cloneable {

    private int ancho = 0;
	private int alto = 0;
	private String nombre;
	
	//constructor de copia
	rectangulo(rectangulo r){
		this.alto=r.alto;
		this.ancho=r.ancho;
		this.nombre=r.nombre;
	}
	
	public rectangulo clone() {
	    Object objeto=null;
	    try {
	        objeto =super.clone();
	    }catch (CloneNotSupportedException ex) {
	        System.out.println(" Error al duplicar");
		}
	    return (rectangulo) objeto;
	}
		
	rectangulo(int an, int al, String nombre) {
		ancho = an; // se puede omitir el this
		this.alto = al;
		this.nombre=nombre;
	}

	public int getAncho() {
		return this.ancho;
	}

	public int getAlto() {
		return alto;
	} // se puede omitir el this

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public rectangulo incrementarAncho() {
		ancho++; // se puede omitir el this
		return this;
	}

	public rectangulo incrementarAlto() {
		this.alto++;
		return this;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(alto, ancho, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		rectangulo other = (rectangulo) obj;
		return alto == other.alto && ancho == other.ancho && Objects.equals(nombre, other.nombre);
	}
    
}
