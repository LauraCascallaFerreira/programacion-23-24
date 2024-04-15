package trimestre3.herencia.SeleccionFutbol;

public class Futbolista extends SeleccionFutbol{
    
    //Atributos
    private int dorsal;
    private String demarcacion;

    //Constructor herencia
    public Futbolista(){
        super();
    }

    //Contructor completo
    public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    //Getters y setters
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    //Metodos propios
    public void jugarPartido(){
        System.out.println("Juega un partido");
    }

    public void entrenar(){
        System.out.println("Entrena");
    }

    //ToString
    @Override
    public String toString() {
        return super.toString()+"Futbolista [dorsal=" + dorsal + ", demarcacion=" + demarcacion + "]";
    }

    public void Viajar(){
        super.Viajar();
        System.out.println("con los cascos puestos.");
    }
}
