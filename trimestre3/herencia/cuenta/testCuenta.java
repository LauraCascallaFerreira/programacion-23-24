package trimestre3.herencia.cuenta;

public class testCuenta {
    public static void main(String[] args) {
        //primero creamos una de ahorr
        CuentaAhorro cuentaAhorro = new CuentaAhorro(700000, 250000);
        CuentaCorriente cuentaCorriente = new CuentaCorriente(100400, 300000);
        System.out.println(cuentaAhorro);
        System.out.println(cuentaCorriente);
        cuentaCorriente.consignar(10100);
        System.out.println("Consignar");
        System.out.println(cuentaCorriente);
        cuentaCorriente.retirar(100);
        System.out.println("Retirar");
        System.out.println(cuentaCorriente);
        cuentaCorriente.calcularInteres();
        System.out.println("Interes");
        System.out.println(cuentaCorriente);
        cuentaCorriente.extractoMensual();
        System.out.println("extracto");
        System.out.println(cuentaCorriente);
    }
}
