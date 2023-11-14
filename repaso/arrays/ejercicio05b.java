package repaso.arrays;

public class ejercicio05b {

    public static int potencia(int base, int exponente){
        int res=base;
        for (int i=0;i<exponente-1;i++){
            res = res * base;
        }
        return res;
    }
    
        public static boolean armstrong (int numero){
            int cifra1 = numero/1000;
            int cifra2 = (numero - 1000*cifra1)/100;
            int cifra3 = (numero - 1000*cifra1 - 100*cifra2)/10;
            int cifra4 = (numero - 1000*cifra1 - 100*cifra2  - 10*cifra3)/1;

            int dato = potencia (cifra1, 4) +potencia (cifra2,4) +potencia(cifra3,4) +potencia(cifra4, 4);

            if (dato == numero) 
                return true;
            return false;
        }
        public static void main(String [] args) {
            if (armstrong(1634)) {
                System.out.println("El número 1634 es un número Armstrong") ;
            } else {
                System.out .println ("El número 1634 No es un número Armstrong");
            }
            if (armstrong(4230)) {
                System.out.println("El número 4230 es un número Armstrong");
            } else {
                System.out .println ("El número 4230 No es un número Armstrong");
            }
        }
    
}
