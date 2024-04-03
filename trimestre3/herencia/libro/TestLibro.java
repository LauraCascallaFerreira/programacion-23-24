package trimestre3.herencia.libro;
import trimestre3.herencia.libro.Novela.generoNovela;

public class TestLibro {

    Libro libro = new Libro("La verdad sobre el caso Harry Quebert", "Joël Dicker", 9.95);
    LibroDeTexto libroDeTexto = new LibroDeTexto("Programación II", "El gran pepe", 22.99, "2ºDAM");
    Novela novela = new Novela("Orgullo y prejuicio", "Jane Austen", 12.99, generoNovela.romantica);
    UniversidadColombia universidadColombia = new UniversidadColombia("Parce", "Wacho", 30, "Tercero", "UVigo");
}
