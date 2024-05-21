package trimestre3.herencia.Humano;

public class Cuerpo {
    
    Cabeza cabeza;
    Tronco tronco;
    Brazo brazoIzquierdo;
    Brazo brazoDerecho;
    Pierna piernaIzquierda;
    Pierna piernaDerecha;

    public Cuerpo(){
        System.out.println("Creando un cuerpo...");
        this.cabeza=new Cabeza();
        this.tronco=new Tronco();
        this.brazoDerecho=new Brazo();
        this.brazoIzquierdo=new Brazo();
        this.piernaDerecha=new Pierna();
        this.piernaIzquierda=new Pierna();
    }

    @Override
    public String toString() {
        return "Cuerpo [cabeza=" + cabeza + ", tronco=" + tronco + ", brazoIzquierdo=" + brazoIzquierdo
                + ", brazoDerecho=" + brazoDerecho + ", piernaIzquierda=" + piernaIzquierda + ", piernaDerecha="
                + piernaDerecha + "]";
    }
}
