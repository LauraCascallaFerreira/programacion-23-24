package trimestre1.tres.propuestos;

public class propuesto11 {

    /*11. Realiza un programa que muestre por pantalla los 50 primeros números pares.*/

    public static void main(String[] args) {

        System.out.println("Los cincuenta primeros números pares son: ");

        System.out.println("Usando el contador.");
        for(int i=0; i<=100; i=i+2){
            System.out.println(i);
        }

        System.out.println("Usando una sucesion aritmetica.");
        for(int i=1; i<=50; i++){
            System.out.println(2*i);
        }

        System.out.println("Usando modulo 2.");
        for(int i=1; i<=100; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }


    }
    
}
