package trimestre3.herencia.Medicina;

public class Medico {
    String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Medico(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Medico [nombre=" + nombre + "]";
    }

    public void soyMedico(){
        System.out.println("Aun ni termine el mir");
    }
}
