package trimestre3.herencia.Humano;

public class Tronco {
    
    String nombre;
    double ancho;
    double largo;
    boolean ombigo=true;

    Tronco(){}

    public Tronco(String nombre, double ancho, double largo, boolean ombigo) {
        this.nombre = nombre;
        this.ancho = ancho;
        this.largo = largo;
        this.ombigo = ombigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public boolean isOmbigo() {
        return ombigo;
    }

    public void setOmbigo(boolean ombigo) {
        this.ombigo = ombigo;
    }

    @Override
    public String toString() {
        return "Tronco [nombre=" + nombre + ", ancho=" + ancho + ", largo=" + largo + ", ombigo=" + ombigo + "]";
    }

    
}
