package trimestre2.repaso.POO;

public class testCuenta {
    public static void main(String[] args) {
        cuenta cuenta = new cuenta("Laura", 1000);
        System.out.println(cuenta);
        cuenta.ingresar(100);
        cuenta.retirar(200);
    }
}
