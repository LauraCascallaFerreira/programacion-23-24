package trimestre3.herencia.Coche;

import java.util.Arrays;

public class Coche {

    protected Motor motor;
    protected Chasis chasis;
    protected Llanta[] llantas;
    protected Carroceria carroceria;

    public Coche(int volumen, tipoChasis claseChasis, String color, tipoCarroceria claseCarroceria,
    String marca, int diametroRin, int altura, int anchura){
        this.motor = new Motor(volumen);
        this.chasis = new Chasis(claseChasis);
        this.carroceria = new Carroceria(color, claseCarroceria);
        this.llantas=new Llanta[4];
        for(int i=0; i<4; i++){
            llantas[i]=new Llanta(marca, diametroRin, altura, anchura);
        }   
    }

    @Override
    public String toString() {
        return "Carro [motor=" + motor + ", chasis=" + chasis + ", llantas=" + Arrays.toString(llantas)
                + ", carroceria=" + carroceria + "]";
    }
}
