package trimestre2.repaso;

import java.util.Arrays;
import java.util.Scanner;

public class busqueda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int arr[]={1,2,3,3,4,4,5,2};
        System.out.println("Elementos del array:");
        System.out.println(Arrays.toString(arr));

        System.out.println("Dame un número entero: ");
        int num=sc.nextInt();
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(num==arr[i])
                count++;
        }

        if(count==0)
            System.out.println("El número no aparece ninguna vez.");
        else 
            System.out.println("Aparece "+count+" veces. nbnb  ");
    }
}
