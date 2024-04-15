package trimestre3.herencia.TiendaAnimales;

public class Perro_Mediano  extends Perro{
    
    enum tiposMediano {COLLIE, DALMATA, BULLDOG, GALGO, SABUESO};
    tiposMediano tipo;

    
    public Perro_Mediano(String nombre, int edad, colores color, double peso, boolean morder, tiposMediano tipo) {
        super(nombre, edad, color, peso, morder);
        this.tipo = tipo;
    }

    public tiposMediano getTipo() {
        return tipo;
    }
    
    public void setTipo(tiposMediano tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+"Perro_Mediano [tipo=" + tipo + "]";
    }

    @Override
	public int pagarImpuestosMunicipales() {
		return super.pagarImpuestosMunicipales()+125;
	}
}
