package trimestre3.herencia.TiendaAnimales;

public class Gato extends Mascota{
    
    protected double alturaSalto;
    protected double longitudSalto;

    public Gato(String nombre, int edad, colores color, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color);
        this.alturaSalto = alturaSalto;
        this.longitudSalto = longitudSalto;
    }

    public double getAlturaSalto() {
        return alturaSalto;
    }

    public void setAlturaSalto(double alturaSalto) {
        this.alturaSalto = alturaSalto;
    }

    public double getLongitudSalto() {
        return longitudSalto;
    }

    public void setLongitudSalto(double longitudSalto) {
        this.longitudSalto = longitudSalto;
    }

    @Override
    public String toString() {
        return super.toString()+"Gato [alturaSalto=" + alturaSalto + ", longitudSalto=" + longitudSalto + "]";
    }

    public String maullar(){
        return "miau mira como maúllo";
    }

    @Override
	public int pagarImpuestosMunicipales() {
		return super.pagarImpuestosMunicipales()+70;
	}
}
