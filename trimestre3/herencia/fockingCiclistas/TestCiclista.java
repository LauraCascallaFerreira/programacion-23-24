package trimestre3.herencia.fockingCiclistas;

//CLASIFICACION POR EQUIPOS

public class TestCiclista {
    public static void main(String[] args) {
        
        Ciclista uno = new Escalador(1, "alex aramburu", 1, 0.5);
        Ciclista dos = new Velocista(4, "jorge arcas", 12, 1.2);
        Ciclista tres = new Contrarrelojista(7, "pepe dominguez", 14);

        uno.imprimir();
        System.out.println(uno.imprimirTipo());
        dos.imprimir();
        System.out.println(dos.imprimirTipo());
        tres.imprimir();
        System.out.println(tres.imprimirTipo());

        Equipo alfa = new Equipo("Movistar", "SPA");
        alfa.añadirCiclista(uno);
        alfa.añadirCiclista(dos);
        alfa.añadirCiclista(tres);

        alfa.listarEquipo();
    }
}
