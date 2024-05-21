package trimestre3.herencia.LineaPedido;

import java.util.ArrayList;

public class TestLineaPedido {
    public static void main(String[] args) {

        ArrayList<LineaPedido> compra = new ArrayList<>();

        Producto producto1 = new Producto(1, "Carpeta", "Carpeta anillada metálica", 1000);
        Producto producto2 = new Producto(2, "Tinta", "Tinta china de color negro", 3000);
        Producto producto3 = new Producto(3, "Cinta pegante", "Cinta adhesiva de color transparente", 800);
        Producto producto4 = new Producto(4, "Cartulina", "Pliego de cartulina 60 x 40 cm", 600);
        
        LineaPedido linea1 = new LineaPedido(1, 5, producto1);
        LineaPedido linea2 = new LineaPedido(2, 3, producto2);
        LineaPedido linea3 = new LineaPedido(3, 2, producto3);
        LineaPedido linea4 = new LineaPedido(4, 4, producto4);

        Orden orden = new Orden(1, compra);

        orden.añadirLineaPedido(linea1);
        orden.añadirLineaPedido(linea2);
        orden.añadirLineaPedido(linea3);
        orden.añadirLineaPedido(linea4);

        System.out.println("COMPRA");
        System.out.println(orden);

        System.out.println("CALCULO DEL SUBTOTAL");
        for(LineaPedido linea : compra){
            System.out.println(linea.identificador+" "+linea.calculoSubtotal());
        }

        System.out.println("CALCULO TOTAL");
        System.out.println(orden.calculoTotal());
    }
}
