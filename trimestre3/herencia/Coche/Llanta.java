package trimestre3.herencia.Coche;

public class Llanta {
    
    String marca;
    int diametroRin;
    int altura;
    int anchura;

    public Llanta(String marca, int diametroRin, int altura, int anchura) {
        this.marca = marca;
        this.diametroRin = diametroRin;
        this.altura = altura;
        this.anchura = anchura;
    }

    @Override
    public String toString() {
        return "Llanta [marca=" + marca + ", diametroRin=" + diametroRin + ", altura=" + altura + ", anchura=" + anchura
                + "]";
    }
}
