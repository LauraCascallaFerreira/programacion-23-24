package ejemplos;

public class testRectangulo {

    public static void main(String[] args) {
        
        rectangulo uno =  new rectangulo(12, 20);
        System.out.println("Ancho: "+uno.getAncho());
        System.out.println("Alto: "+uno.getAlto());
        rectangulo otro = uno.incrementarAncho();
        uno.incrementarAlto();
        uno.incrementarAlto();
        uno.incrementarAlto();
        uno.incrementarAlto();
    }
    
}
