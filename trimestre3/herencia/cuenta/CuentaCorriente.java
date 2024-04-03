package trimestre3.herencia.cuenta;

public class CuentaCorriente extends Cuenta{

    public CuentaCorriente(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
	}

	private float sobregiro=0;

	//metodos propios
	@Override
	public void retirar(float cantidad){
		if(cantidad>this.getSaldo()){
			//queda en descubierto llamado aqui sobregiro
			sobregiro+=cantidad-this.getSaldo();
			//usa el metodo de Cuenta para la consignación
			super.retirar(getSaldo());
		} else {
			super.retirar(cantidad);
		}
	}

	public void consignar(float cantidad){
		if(sobregiro>0){
			if(cantidad<sobregiro){
				//hago un ingreso restando lo que debo
				super.consignar(cantidad-sobregiro);
				//y ya no debo
				sobregiro=0;
			} else {
				sobregiro-=cantidad;
				//this.setNumeroConsignaciones(getNumeroConsignaciones()+1);
				//debo contar un ingreso o consignación más
				super.consignar(0);
			}
		} else {
			//no debo nada, ingreso y punto
			super.consignar(cantidad);
		}
	}

	/*@Override
	public void extractoMensual(){
	}*/
	//como no modifico el extracto no se va a sobreescribir el metodo, uso el que heredo

	@Override
	public String toString() {
		return super.toString()+"CuentaCorriente [sobregiro=" + sobregiro + "]";
	}
	
}
