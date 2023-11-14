package repaso.examen1B;

public class libro {

    private static String title;
    private String author;
    private static String ejemplares;
    private static String prestados;
    
    public libro() {
    }

    public libro(String title, String author, String ejemplares, String prestados) {
        this.title = title;
        this.author = author;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(String ejemplares) {
        this.ejemplares = ejemplares;
    }

    public String getPrestados() {
        return prestados;
    }

    public void setPrestados(String prestados) {
        this.prestados = prestados;
    }

    public void prestamo(int ejemplares, int prestados){
        if (ejemplares!=0){
            ejemplares-=prestados;
            System.out.println(ejemplares);
        } else {
            System.out.println("No hay libros para prestarte.");
        }
    }

    @Override
    public String toString() {
        return "libro [title=" + title + ", author=" + author + ", ejemplares=" + ejemplares + ", prestados="
                + prestados + "]";
    }

    
    
    
}
