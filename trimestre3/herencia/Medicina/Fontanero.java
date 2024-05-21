package trimestre3.herencia.Medicina;

public class Fontanero implements Entretenerse{
    
    private String nombre;
    private int licencia;

    public Fontanero(String nombre, int licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    @Override
    public String toString() {
        return "Fontanero [nombre=" + nombre + ", licencia=" + licencia + "]";
    }

    @Override
    public void verVideos() {
        System.out.println("El fontanero ve videos de ñapas.");
    }

    @Override
    public void escucharPodcast() {
        System.out.println("El fontanero oye podcast de goteras.");
    }
}
