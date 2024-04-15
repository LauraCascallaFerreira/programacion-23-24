package trimestre3.herencia.TiendaAnimales;

public class Perro_Grande extends Perro{

    enum tipos {PASTOR_ALEMAN, DOBERMAN, ROTWEILLER};
    protected tipos tipo;

    public Perro_Grande(String nombre, int edad, colores color, double peso, boolean morder, tipos tipo) {
        super(nombre, edad, color, peso, morder);
        this.tipo = tipo;
    }
    public tipos getTipo() {
        return tipo;
    }

    public void setTipo(tipos tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+"Perro_Grande [tipo=" + tipo + "]";
    }

    @Override
	public int pagarImpuestosMunicipales() {
		return super.pagarImpuestosMunicipales()+150;
	}
}