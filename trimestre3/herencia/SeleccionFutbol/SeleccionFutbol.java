package trimestre3.herencia.SeleccionFutbol;

public class SeleccionFutbol {

    //Atributos
    protected int id;
    protected String Nombre;
    protected String Apellido;
    protected int Edad;

    //Constructor por defecto
    public SeleccionFutbol() {
    }

    //Constructor completo
    public SeleccionFutbol(int id, String nombre, String apellido, int edad) {
        this.id = id;
        Nombre = nombre;
        Apellido = apellido;
        Edad = edad;
    }

    //Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    //Metodos propios
    public void Concentrarse(){
        System.out.println("Concentrarse");
    }

    public void Viajar(){
        System.out.println("Viaja ");
    }

    //ToString
    @Override
    public String toString() {
        return "SeleccionFutbol [id=" + id + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Edad=" + Edad + "]";
    }

    
}
