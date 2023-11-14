package repaso.arrays;

import java.util.Scanner;

/*3. Leer 5 números por teclado y a continuación realizar la
media de los números positivos, la media de los negativos y
contar el número de ceros.*/
public class ejercicio03 {
    public static void main(String[] args) {
        
        int num;
        int arr[] = new int[5];
        int sumap=0;
        int suman=0; 
        int mediap=0; 
        int median=0; 
        int ceros=0;
        int count=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame cinco números:");

        for(int i=0; i<arr.length; i++){
            num=sc.nextInt();
            arr[i]=num;
        }

        for(int i=0; i<arr.length; i++){

            if(arr[i]>0){
                count++;
                sumap+=arr[i];
                mediap=sumap/count;
            } else if(arr[i]<0){
                count++;
                suman+=arr[i];
                median=suman/count;
            } else if(arr[i]==0) ceros++;
        }

        System.out.println("La media de los positivos es: "+mediap);
        System.out.println("La media de los negativos: "+median);
        System.out.println("El número de ceros es: "+ceros);
    }
}
