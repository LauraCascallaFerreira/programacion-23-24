package trimestre3.herencia.libro;
import java.util.ArrayList;
import java.util.Scanner;
import trimestre3.herencia.libro.Novela.generoNovela;

//crear una coleccion de libros consistente en libro normal, dos libros de texto, dos
//colombia y tres novelas
//todos los libros tendran precio entre 0 y 10 euros, calcular precio total venta
//incluyendo un descuento pedido al usuario

public class TestLibro {


    public static float generaPrecio(){
        
        return (float)(1+Math.random()*10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Creo una lista que me sirva para todos los objetos
        ArrayList<Libro> compra = new ArrayList<>();

        //Libros normales
        Libro libro = new Libro("La verdad sobre el caso Harry Quebert", "Joel Dicker", generaPrecio());
        compra.add(libro);

        //Libros de texto
        LibroDeTexto libroDeTexto1 = new LibroDeTexto("Programación I", "El grandioso Pepe", generaPrecio(), "1ºDAM");
        compra.add(libroDeTexto1);
        LibroDeTexto libroDeTexto2 = new LibroDeTexto("Programación II", "El grandioso Pepe", generaPrecio(), "2ºDAM");
        compra.add(libroDeTexto2);

        //Libros de la universidad de Colombia
        UniversidadColombia universidadColombia1 = new UniversidadColombia("Historia del arte", "Hola", generaPrecio(), "primero", "UNC");
        compra.add(universidadColombia1);
        UniversidadColombia universidadColombia2 = new UniversidadColombia("Historia contemporánea", "Adiós", generaPrecio(), "primero", "UNC");
        compra.add(universidadColombia2);

        //Novelas
        Novela novela1 = new Novela("Orgullo y prejuicio", "Jane Austen", generaPrecio(), generoNovela.romantica);
        compra.add(novela1);
        Novela novela2 = new Novela("El resplandor", "Stephen King", generaPrecio(), generoNovela.cienciaFiccion);
        compra.add(novela2);
        Novela novela3 = new Novela("1984", "George Orwell", generaPrecio(), generoNovela.cienciaFiccion);
        compra.add(novela3);

        float precioLibros=0f;

        System.out.println("Introduce el descuento del libro (en %)");
        float descuento=sc.nextFloat();

        for(Libro l : compra){
            precioLibros+=l.getPrecio();
            System.out.println(l.toString());
        }

        //mostramos los resultados
        System.out.println("Total compra ="+precioLibros);
        System.out.println("Descuento del "+descuento+"% = "+(descuento/100)*precioLibros);
        System.out.println("Pago final "+(1-(descuento/100))*precioLibros);
        sc.close();
    } //cierre main
} //cierre clase
