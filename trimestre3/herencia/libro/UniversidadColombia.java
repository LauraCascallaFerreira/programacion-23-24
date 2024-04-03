package trimestre3.herencia.libro;

public class UniversidadColombia extends LibroDeTexto{
    
    protected String facultad;

    public UniversidadColombia(String titulo, String autor, double precio, String curso, String facultad) {
        super(titulo, autor, precio, curso);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return super.toString()+"UniversidadColombia [facultad=" + facultad + "]";
    }
}
