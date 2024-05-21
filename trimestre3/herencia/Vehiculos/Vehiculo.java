package trimestre3.herencia.Vehiculos;

public class Vehiculo {

    protected int velocidadActual;
    protected int velocidadMaxima;

    public Vehiculo(int velocidadActual, int velocidadMaxima) {
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String toString() {
        return "Vehiculo [velocidadActual=" + velocidadActual + ", velocidadMaxima=" + velocidadMaxima + "]";
    }

    public void acelerar(int velocidad){
        int top= this.velocidadActual+velocidad;
        if(top<=velocidadMaxima){
            System.out.println("Tu nueva velocidad es: "+top);
        } else {
            System.out.println("Donde vas biterkas");
        }
    }

    public void frenar(int velocidad){
        int top=this.velocidadActual-velocidad;
        if(top<0){
            System.out.println("No puedes andar a velocidad negativa, socabon");
        } else {
            System.out.println("Tu velocidad es: "+top);
        }
    }
}
