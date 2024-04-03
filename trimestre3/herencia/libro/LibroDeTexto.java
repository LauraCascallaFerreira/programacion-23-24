package trimestre3.herencia.libro;

public class LibroDeTexto extends Libro{

    protected String curso;

    public LibroDeTexto(String titulo, String autor, double precio, String curso) {
        super(titulo, autor, precio);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString()+"LibroDeTexto [curso=" + curso + "]";
    }
    
}
