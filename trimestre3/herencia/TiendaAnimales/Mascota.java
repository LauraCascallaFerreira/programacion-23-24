package trimestre3.herencia.TiendaAnimales;

public class Mascota {

    public enum colores {BLANCO,GRIS,NEGRO,MARRON,NARANJA};
    
    protected String nombre;
    protected int edad;
    protected colores color;
    
    public Mascota(String nombre, int edad, colores color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public colores getColor() {
        return color;
    }

    public void setColor(colores color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mascota [nombre=" + nombre + ", edad=" + edad + ", color=" + color + "]";
    }

    public int pagarImpuestosMunicipales() {
		return 50;
	}
}
