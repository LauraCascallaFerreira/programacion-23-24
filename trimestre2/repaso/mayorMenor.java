package trimestre2.repaso;

import java.util.Arrays;

public class mayorMenor {
    public static void main(String[] args) {

        int arr[]={1,2,3,3,4,4,5,2};
        System.out.println("Elementos del array:");
        System.out.println(Arrays.toString(arr));

        int max=arr[0];
        int min=arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]<min)
                min=arr[i];
            if(arr[i]>max)
                max=arr[i];
        }

        System.out.println("El máximo es: "+max);
        System.out.println("El mínimo es: "+min);
    }
}
