package trimestre3.herencia.TiendaAnimales;

public class Perro extends Mascota{
    
    protected double peso;
    protected boolean morder;

    public Perro(String nombre, int edad, colores color, double peso, boolean morder) {
        super(nombre, edad, color);
        this.peso = peso;
        this.morder = morder;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isMorder() {
        return morder;
    }

    public void setMorder(boolean morder) {
        this.morder = morder;
    }
    
    @Override
    public String toString() {
        return super.toString()+"Perro [peso=" + peso + ", morder=" + morder + "]";
    }

    public String ladrar(){
        return "guau mira como ladro";
    }

    @Override
	public int pagarImpuestosMunicipales() {
		return super.pagarImpuestosMunicipales()+100;
	}
}
