package trimestre3.herencia.Vehiculos;

public class Acuatico extends Vehiculo implements Motor, Vela{
    
    public Acuatico(int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
    }

    @Override
    public int calculaRevolucionesMotor(int fuerza, int radio) {
        return fuerza*radio;
    }

    @Override
    public int recomendarVelocidad(int velocidadViento) {
        return this.velocidadMaxima=velocidadViento/2;    
    }

    
    
}
