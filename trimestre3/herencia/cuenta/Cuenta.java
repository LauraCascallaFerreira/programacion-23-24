package trimestre3.herencia.cuenta;
/*Desarrollar programa que modele una cuenta bancaria que tiene estos atributos:
 * Saldo float
 * Nº consignaciones=0 int
 * Nª retiros=0 int
 * Tasa anual en porcentajes float
 * Comisión mensual=0 float
 * 
 * Constructor que inicializa saldo y tasa anual pasados por parametro
 * METODOS:
 * Consignar una cantidad de dinero en la cuenta actualizando su saldo
 * Retirar una cantidad de dinero en la cuenta actualizando saldo
 * El valor a retirar no puede superar el saldo
 * 
 * Calcular el interes mensual de la cuenta y actualiza el saldo
 * Extracto mensual: actualiza el saldo restandole la comision mentual y calculando el
 * interes mensual correspondiente invocando al metodo anterior
 * 
 * toString
 */
public class Cuenta {
    
    private float saldo;
    private int numeroConsignaciones=0;
    private int numeroRetiros=0;
    private float tasaAnual; //En porcentajes

	/*Atributo que define la comisión mensual que se cobra a una cuenta bancaria*/
    protected float comisionMensual=0;

    public Cuenta(float saldo, float tasaAnual) {
		this.saldo = saldo;
		this.tasaAnual = tasaAnual;
	}

	public void consignar(float cantidad) {
		saldo += cantidad;
		numeroConsignaciones++;
	}

	public void retirar(float cantidad) {
		float nuevoSaldo = saldo - cantidad;

		if (nuevoSaldo >= 0) {
			saldo -= cantidad;
			numeroRetiros++;
		} else {
			System.out.println("La cantidad a retirar excede el saldo actual.");
			System.out.println("Saldo: "+saldo);
		}
	}

	public void calcularInteres() {
		float tasaMensual = tasaAnual / 12;
		float interesMensual = saldo * tasaMensual;
		saldo += interesMensual; // Actualiza el saldo aplicando el interés mensual
	}

	public void extractoMensual() {
		saldo -= comisionMensual;
		calcularInteres();
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNumeroConsignaciones() {
		return numeroConsignaciones;
	}

	public void setNumeroConsignaciones(int numeroConsignaciones) {
		this.numeroConsignaciones = numeroConsignaciones;
	}

	public int getNumeroRetiros() {
		return numeroRetiros;
	}

	public void setNumeroRetiros(int numeroRetiros) {
		this.numeroRetiros = numeroRetiros;
	}

	public float getTasaAnual() {
		return tasaAnual;
	}

	public void setTasaAnual(float tasaAnual) {
		this.tasaAnual = tasaAnual;
	}

	public float getComisionMensual() {
		return comisionMensual;
	}

	public void setComisionMensual(float comisionMensual) {
		this.comisionMensual = comisionMensual;
	}

	@Override
    public String toString() {
        return "Cuenta [saldo=" + saldo + ", numeroConsignaciones=" + numeroConsignaciones + ", numeroRetiros="
                + numeroRetiros + ", tasaAnual=" + tasaAnual + ", comisionMensual=" + comisionMensual + "]";
    }
}
