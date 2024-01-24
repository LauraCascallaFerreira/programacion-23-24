package trimestre2.objetos.cuenta;

import trimestre2.objetos.cuenta.cuenta.tipo;

public class testCuenta {
    public static void main(String[] args) {
        cuenta cuenta = new cuenta("Laura", "Cascallana", 15789356, tipo.AHORROS);
        System.out.println(cuenta.toString());
        cuenta.ingresar(100);
        cuenta.retirar(34);
        System.out.println(cuenta.toString());
    }
}
