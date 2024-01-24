package trimestre2.objetos.cuenta;

import trimestre2.objetos.cuenta.cuenta.tipo;

public class test2Cuenta {
    public static void main(String[] args) {
        cuenta cuenta = new cuenta("Hola", "hola", 17829384, tipo.AHORROS);
        System.out.println(cuenta.toString());
        cuenta.ingresar(10000);
        cuenta.retirar(100);
        System.out.println(cuenta.toString());
        cuenta cuenta2 = new cuenta("Laura", "Cascallana", 15789356, tipo.AHORROS);
        System.out.println(cuenta2.toString());
        cuenta2.ingresar(1000);
        cuenta2.retirar(34);
        System.out.println(cuenta2.toString());
        System.out.println(cuenta.compararSaldos(cuenta2));
        cuenta.transferirACuenta(cuenta2, 50);
        System.out.println(cuenta.toString());
        System.out.println(cuenta2.toString());
    }
}
