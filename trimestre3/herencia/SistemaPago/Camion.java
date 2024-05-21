package trimestre3.herencia.SistemaPago;

public class Camion extends Vehiculo{
    
    //Atributo
    private static int valorPeajeEje=5000;
    private int numeroEjes;

    //Constructor completo
    public Camion(String matricula, int valorPeajeEje) {
        super(matricula);
        Camion.valorPeajeEje = valorPeajeEje;
    }

    //Get y set
    public static int getValorPeajeEje() {
        return valorPeajeEje;
    }

    public static void setValorPeajeEje(int valorPeajeEje) {
        Camion.valorPeajeEje = valorPeajeEje;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    //@toString
    @Override
    public String toString() {
        return super.toString()+"Camion [valorPeaje=" + valorPeajeEje + " numeroEjes="+numeroEjes+"]";
    }


    

    
}
