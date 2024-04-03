package trimestre3.herencia.cuenta;

public class CuentaAhorro extends Cuenta{

    public CuentaAhorro(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		this.activa= this.isActiva();
	}

/*	posee un atributo para determinar si la cuenta de ahorros está activa
 *  (tipo boolean). Si el saldo es menor a $10000, la cuenta está inactiva, 
 *  en caso contrario se considera activa. 
*/
	boolean activa;
	
	//método similar a un método set
	public boolean isActiva() {
		if(this.getSaldo()>10000)
			return true;
		else 
			return false;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}
	
	//metodos de ejercicio
	@Override
	public void consignar(float cantidad){
		if(activa)
			super.consignar(cantidad);
		else	
			System.out.println("Cuenta NO activa.");
	}

	@Override
	public void retirar(float cantidad){
		if(activa)
			super.retirar(cantidad);
		else
			System.out.println("Cuenta NO activa.");
	}
    
	@Override
	public void extractoMensual(){
		if(this.getNumeroRetiros()>4){
			this.comisionMensual=(this.getNumeroRetiros()-4)*1000;
			//revisar
			super.extractoMensual();
			//debemos comprobar si todavía el saldo es mayor o no que 10.000
			activa=isActiva();
		}
	}

	@Override
	public String toString() {
		return super.toString()+"CuentaAhorro [activa=" + activa + "]";
	}
	
}
