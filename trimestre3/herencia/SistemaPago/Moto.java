package trimestre3.herencia.SistemaPago;

public class Moto extends Vehiculo{
    
    //Atributo estático
    private static int valorPeaje=5000;

    //Constructor completo
    public Moto(String matricula, int valorPeaje) {
        super(matricula);
        Moto.valorPeaje = valorPeaje;
    }

    //Get y set
    public static int getValorPeaje() {
        return valorPeaje;
    }

    public static void setValorPeaje(int valorPeaje) {
        Moto.valorPeaje = valorPeaje;
    }

    //@toString
    @Override
    public String toString() {
        return super.toString()+"Moto [valorPeaje=" + valorPeaje + "]";
    }

    
}
