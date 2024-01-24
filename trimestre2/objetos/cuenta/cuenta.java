package trimestre2.objetos.cuenta;

public class cuenta {

    String nombre;
	String apellidos;
	int numero;
	enum tipo {AHORROS, CORRIENTE}
	tipo tipoCuenta;
	float saldo = 0;

	cuenta(String nombresTitular, String apellidosTitular, int numeroCuenta, tipo tipoCuenta) {
		/*Tener en cuenta que no se pasa como parámetro el saldo ya que inicialmente es
		 *cero.*/
		this.nombre = nombresTitular;
		this.apellidos = apellidosTitular;
		this.numero = numeroCuenta;
		this.tipoCuenta = tipoCuenta;
	}

	@Override
	public String toString() {
		return "Cuenta [nombre=" + nombre + ", apellidos=" + apellidos + ", numero=" + numero + ", tipoCuenta="
				+ tipoCuenta + ", saldo=" + saldo + "]";
	}

	void consultarSaldo() {
		System.out.println("El saldo actual es = " + saldo);
	}

	boolean ingresar(int valor) {
		// El valor a ingresar debe ser mayor que cero
		if (valor > 0) {
			saldo = saldo + valor;
			System.out.println("Se ha ingresado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
			return true;
		} else {
			System.out.println("El valor a ingresar debe ser mayor que cero.");
			return false;
		}
	}

	boolean retirar(int valor) {
		/*El valor debe ser mayor que cero y no debe superar el saldo actual*/
		if ((valor > 0) && (valor <= saldo)) {
			saldo = saldo - valor;
			System.out.println("Se ha retirado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
			return true;
		} else {
			System.out.println("El valor a retirar debe ser menor que el saldo actual.");
			return false;
		}
	}

	/*Comparar saldos entre cuentas bancarias*/
	public boolean compararSaldos(cuenta cuenta){ //le pasamos una cuenta que se ha creado
		//si el saldo de una cuenta es mayor o igual al saldo de la otra
		if(this.saldo>=cuenta.saldo)
			return true;
		else return false;
	}

	/*Transferir dinero a otra cuenta.*/
	public void transferirACuenta(cuenta cuenta, float saldo){//le pasamos una cuenta y un saldo que será el de la cuenta
		if(this.retirar((int)saldo)){//pasamos el metodo retirar para ver si hay dinero suficiente en la cuenta 
			cuenta.ingresar((int)saldo);
			System.out.println("Operación realizada con éxito.");
			System.out.println();
			System.out.println(this.toString());
			System.out.println(cuenta.toString());
		} else System.out.println("La operación no ha sido realizada con éxito.");
	}
}
