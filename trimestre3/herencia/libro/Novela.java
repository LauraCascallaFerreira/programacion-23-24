package trimestre3.herencia.libro;

public class Novela extends Libro{
    
    enum generoNovela{historica, romantica, policiaca, realista, cienciaFiccion, aventuras};

    protected generoNovela genero;

    public Novela(String titulo, String autor, double precio, generoNovela genero) {
        super(titulo, autor, precio);
        this.genero = genero;
    }

    public generoNovela getGenero() {
        return genero;
    }

    public void setGenero(generoNovela genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString()+"Novela [genero=" + genero + "]";
    }
}
