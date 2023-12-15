public class testCuentaCorriente {
    
    public static void main(String[] args) {
        
        cuentaCorriente uno = new cuentaCorriente("Laura", 0);
        System.out.println(uno.toString());
        uno.saldo(0);
        System.out.println("Saldo actual de la cuenta:");
        System.out.println(uno.toString());
        uno.deposito(900);
        System.out.println("Se ha hecho un deposito.");
        System.out.println(uno.toString());
        uno.retiro(150);
        System.out.println("Se ha retirado dinero.");
        System.out.println(uno.toString());
    }
}
