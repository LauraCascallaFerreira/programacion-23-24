package trimestre2.objetos.pelicula;

import trimestre2.objetos.pelicula.pelicula.tipo;

public class testPelicula {
    public static void main(String[] args) {
        pelicula uno = new pelicula("Desayuno con diamantes", "Blake Edwards", tipo.DRAMA , 115, 1961, 10);
        pelicula dos = new pelicula("Charada", "Stanley Donen", tipo.DRAMA , 115, 1963, 8);

        System.out.println(uno.toString());
        System.out.println(uno.esPeliculaEpica());
        System.out.println(uno.calcularValoracion());

        System.out.println(dos.toString());
        System.out.println(dos.esPeliculaEpica());
        System.out.println(dos.calcularValoracion());
        System.out.println();
        System.out.println(uno.esSimilar(dos));
    }
}
