package trimestre2.repaso.POO;
/*Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).

El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.

Crea sus métodos get, set y toString.

Tendrá dos métodos especiales:

 */
public class cuenta {

    String titular;
    double cantidad;

    public cuenta() {
    }

    public cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    /*ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad 
    introducida es negativa, no se hará nada.*/

    public void ingresar(double ingreso){
        if(ingreso<0){
            System.out.println("No se puede ingresar dinero negativo.");
            System.out.println("Tu saldo es: "+cantidad);
        } else {
            cantidad=cantidad+ingreso;
            System.out.println("Tu nuevo saldo es: "+cantidad);
        }
    }

    /*retirar(double cantidad): se retira una cantidad a la cuenta, si restando la 
    cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.*/

    public void retirar(double retirar){
        double nuevoSaldo=cantidad-retirar;
        if(nuevoSaldo<0)
            System.out.println("No puedes retirar tanto dinero");
        else 
            System.out.println("Tu nuevo saldo es: "+nuevoSaldo);
        
    }

    @Override
    public String toString() {
        return "cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
    }
    
}
