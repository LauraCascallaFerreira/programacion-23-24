package trimestre3.herencia.Humano;

public class testCuerpo {
    public static void main(String[] args) {
        
        Cuerpo cuerpo = new Cuerpo();
    
        cuerpo.cabeza.setNombre("Cabeza");
        cuerpo.cabeza.setNum_ojos(2);
        cuerpo.cabeza.setPeludo(true);
        cuerpo.cabeza.setLongitudSombrero(15);
    
        cuerpo.tronco.setNombre("Tronco");
        cuerpo.tronco.setAncho(30);
        cuerpo.tronco.setLargo(70);
        cuerpo.tronco.setOmbigo(true);
    
        cuerpo.brazoIzquierdo.setNombre("Brazo izquierdo");
        cuerpo.brazoIzquierdo.setLongitud(40);
        cuerpo.brazoIzquierdo.setNumero_dedos(5);
    
        cuerpo.brazoDerecho.setNombre("Brazo derecho");
        cuerpo.brazoDerecho.setLongitud(38);
        cuerpo.brazoDerecho.setNumero_dedos(4);
    
        cuerpo.piernaIzquierda.setNombre("Pierna izquierda");
        cuerpo.piernaIzquierda.setLongitud(60);
        cuerpo.piernaIzquierda.setNumero_dedos(5);
            
        cuerpo.piernaDerecha.setNombre("Pierna derecha");
        cuerpo.piernaDerecha.setLongitud(63);
        cuerpo.piernaDerecha.setNumero_dedos(5);

        System.out.println(cuerpo);
    }
}
