package trimestre3.herencia.Humano;

public class Brazo {

    String nombre;
    double longitud;
    int numero_dedos;
    
    Brazo(){}

    public Brazo(String nombre, double longitud, int numero_dedos) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.numero_dedos = numero_dedos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int getNumero_dedos() {
        return numero_dedos;
    }

    public void setNumero_dedos(int numero_dedos) {
        this.numero_dedos = numero_dedos;
    }

    @Override
    public String toString() {
        return "Brazo [nombre=" + nombre + ", longitud=" + longitud + ", numero_dedos=" + numero_dedos + "]";
    }
}
