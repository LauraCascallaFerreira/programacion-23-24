package repaso.examen1A;

public class cuentaAhorro {

    private String nombre;
    private double saldo;
    
    public cuentaAhorro() {
    }

    public cuentaAhorro(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saldo(double saldo){
        System.out.println(saldo);
    }
    
    public void deposito(double deposito){
        saldo+=deposito;
    }

    public void retiro(double retiro){
        saldo-=retiro;
    }

    public void interes(double interes){
        interes*=saldo;
        saldo-=interes;
    }

    @Override
    public String toString() {
        return "cuentaAhorro [nombre=" + nombre + ", numeroCuenta="  + ", saldo=" + saldo + "]";
    }
}
