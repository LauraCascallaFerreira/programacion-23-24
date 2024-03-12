package trimestre2.repaso;

import java.util.Scanner;

/*Leer los datos correspondientes a dos tablas de 12
elementos numéricos, y mezclarlos en una tercera de la
forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de
la B, etc*/
public class arrays06 {
    public static void main(String[] args) {
        int arr[] = new int[12];
        int arr2[] = new int[12];

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime números para el array:");
        for (int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
        System.out.println("Dime otros números para el array:");
        for (int i=0; i<arr2.length; i++){
            int num=sc.nextInt();
            arr2[i]=num;
        }
        sc.close();  
        //NO LO ENTIENDO DEBERIA REVISARLO MEJOR
    }
}
