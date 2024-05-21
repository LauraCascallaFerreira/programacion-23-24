package trimestre3.herencia.Biblioteca;

import java.io.Serializable;

public class Libro implements Serializable{
    
    String titulo;
    String autor;
    int añoPublicacion;
    String editorial;
    String isbn="LIBRE";

    public Libro() {
        this.isbn="LIBRE";
    }

    public Libro(String titulo, String autor, int añoPublicacion, String editorial, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.editorial = editorial;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", añoPublicacion=" + añoPublicacion + ", editorial="
                + editorial + ", referenciaBibliografica=" + isbn + "]";
    }
}
