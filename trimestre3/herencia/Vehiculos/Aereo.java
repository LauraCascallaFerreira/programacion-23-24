package trimestre3.herencia.Vehiculos;

public class Aereo extends Vehiculo implements Alas, Reactor{

    public Aereo(int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
    }
    
    public void despegar(){
        System.out.println("El avión ha despegado");
    }

    public void volar(){
        System.out.println("El avion esta volando");
    }

    public void aterrizar(){
        System.out.println("El avion va a aterrizar");
    }

    @Override
    public void encender() {
        System.out.println("El avion va a proceder a encender el motor de reaccion");
    }

    @Override
    public void apagar() {
        System.out.println("El avion va a proceder a apagar el motor de reaccion");
    }

    @Override
    public void soltar() {
        System.out.println("El avion va a proceder a soltar el tren de aterrizaje");
    }

    @Override
    public void subir() {
        System.out.println("El avion va a proceder a subir el tren de aterrizaje");
    }
}
