package trimestre3.herencia.Vehiculos;

public class Terrestre extends Vehiculo implements Motor{

    public Terrestre(int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
    }

    @Override
    public void acelerar(int velocidad) {
        super.acelerar(velocidad);
    }

    @Override
    public void frenar(int velocidad) {
        super.frenar(velocidad);
    }

    @Override
    public int calculaRevolucionesMotor(int fuerza, int radio) {
        return fuerza*radio;
    }
}
