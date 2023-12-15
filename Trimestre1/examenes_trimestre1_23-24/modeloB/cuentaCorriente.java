public class cuentaCorriente {

    //FALTA UN CONTADOR DE CUENTAS BANCARIAS!!!!!

    //atributos de la clase
    private String nombre;
    private double saldo;
    
    //constructor vacío
    public cuentaCorriente() {
    }

    //constructor
    public cuentaCorriente(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    //getters y setters de los atributos
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

    //metodo que devuelve el saldo
    public void saldo(double saldo){
        System.out.println(saldo);
    }
    
    //metodo para depositar dinero
    public void deposito(double deposito){
        saldo+=deposito;
    }

    //metodo para retirar dinero
    public void retiro(double retiro){
        saldo-=retiro;
    }

    //toString
    @Override
    public String toString() {
        return "cuentaCorriente [nombre=" + nombre + ", saldo=" + saldo + "]";
    }
}
