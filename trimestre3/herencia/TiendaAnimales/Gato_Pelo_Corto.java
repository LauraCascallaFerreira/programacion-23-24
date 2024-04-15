package trimestre3.herencia.TiendaAnimales;

public class Gato_Pelo_Corto extends Gato{

    enum tiposCorto {AZUL_RUSO, BRITÁNICO, MANX, DEVON_REX}
    tiposCorto tipo;

    public Gato_Pelo_Corto(String nombre, int edad, colores color, double alturaSalto, double longitudSalto,
            tiposCorto tipo) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.tipo = tipo;
    }

    public tiposCorto getTipo() {
        return tipo;
    }

    public void setTipo(tiposCorto tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+"Gato_Pelo_Corto [tipo=" + tipo + "]";
    }

    @Override
	public int pagarImpuestosMunicipales() {
		return super.pagarImpuestosMunicipales()+100;
	}
}
