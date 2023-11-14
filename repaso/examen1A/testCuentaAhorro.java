package repaso.examen1A;

public class testCuentaAhorro {

    public static void main(String[] args) {
        
        cuentaAhorro uno = new cuentaAhorro("Laura", 36221, 3000);
        System.out.println(uno);
        uno.deposito(100);
        System.out.println(uno);
        uno.retiro(100);
        System.out.println(uno);
        uno.interes(0.20);
        System.out.println(uno);
    }
    
}
