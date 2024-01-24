package trimestre1.cuatro.ejemplos;

public class rectangulo {

    private int ancho=0;
    private int alto=0;
    private String nombre="";

    rectangulo(int ancho, int alto, String nombre){
        this.ancho=ancho;
        this.alto=alto;
        this.nombre=nombre;
    }

    //Constructor de copia
    rectangulo(rectangulo r){
        this.ancho=r.ancho;
        this.alto=r.alto;
        this.nombre=r.nombre;
    }

    public rectangulo clone(){
        Object objeto = null;
        try{
            objeto=super.clone();

        } catch (CloneNotSupportedException ex){
            System.out.println("Erro al duplicar");
        }

        return (rectangulo) objeto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public rectangulo incrementarAncho(){
        ancho++;
        return this;
    }

    public rectangulo incrementarAlto(){
        alto++;
        rectangulo fake = new rectangulo(4, 5, "uno");
        return fake;
    }

    @Override
    public String toString() {
        return "rectangulo [ancho=" + ancho + ", alto=" + alto + ", nombre=" + nombre + "]";
    }  
    
}
