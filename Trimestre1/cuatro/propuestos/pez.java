package propuestos;

public class pez {

    //miembro de tipo String que podra ser heredado por las subclases
    //getNombre y setNombre utilizando this
    //implementar la clase con el clone() asi como el equals() para hacer una comparacion
    //en profundidad
    //realizar un testeo con las características

    protected String nombre;
    protected int longitud;
    protected float peso;

    public pez() {

    }

    public pez(String nombre, int longitud, float peso) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void nada(){
        System.out.println("Soy "+this.nombre+" y estoy nadando gluglu.");
    }
    
    public boolean soyComestible(){
        if(this.longitud>150)
            return false;
        else 
            return true;
    }

    @Override
    public String toString() {
        return "pez [nombre=" + nombre + ", longitud=" + longitud + ", peso=" + peso + "]";
    }
}
