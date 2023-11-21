package ejemplos;

public class rectangulo {

    private int ancho=0;
    private int alto=0;

    //Constructor de copia
    rectangulo(rectangulo r){
        this.ancho=r.ancho;
        this.alto=r.alto;
    }

    rectangulo(int ancho, int alto){
        this.ancho=ancho;
        this.alto=alto;
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
        rectangulo fake = new rectangulo(4, 5);
        return fake;
    }

    @Override
    public String toString() {
        return "rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
    }    
    
}
