package Trimestre1.boletin02;

import java.util.Scanner;

public class ejercicio06 {

    /*13. Pedir 10 números. Mostrar la media de los números positivos, la media de los 
    números negativos y la cantidad de ceros. */
    public static void main(String[] args) {
        int num;
        int mediap=0;
        int median=0;
        int sumap=0;
        int suman=0;
        int countp=0;
        int countn=0;
        int ceros=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame 10 números:");
        for(int i=0; i<10; i++){
            num=sc.nextInt();
            if(num>0){
                sumap+=num;
                countp++;
            } else if(num<0){
                suman+=num;
                countn++;
            } else ceros++;
        }

        mediap=sumap/countp;
        median=suman/countn;

        System.out.println("La media de los negativos es: "+median);
        System.out.println("La media de los positivos es: "+mediap);
        System.out.println("El número de ceros es: "+ceros);
        
    }
    
}
