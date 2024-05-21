package trimestre3.herencia.Universidad;

public abstract class Persona {

    //Atributos
    public String nombre;
    public String direccion;

    //Constructor completo
    public Persona(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Métodos propios
    public void asistencia(){
        System.out.println("Voy a clase");
    }

    public void noAsistencia(){
        System.out.println("No voy a clase");
    }

    public void clasePorLaTarde(){
        System.out.println("Tengo clase de tarde");
    }

    public abstract void comer();


    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", direccion=" + direccion + "]";
    }

    

    
}
