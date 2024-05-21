package trimestre3.herencia.Medicina;

public class Alumno implements Entretenerse{

    private String nombre;
    private String centro;

    public Alumno(String nombre, String centro) {
        this.nombre = nombre;
        this.centro = centro;
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", centro=" + centro + "]";
    }



    @Override
    public void verVideos() {
        System.out.println("El alumno no ve videos, solo atiende.");
    }

    @Override
    public void escucharPodcast() {
        System.out.println("El alumno no escucha podcast, se centra en su trabajo.");
    }
}
