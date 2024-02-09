package trimestre2.arrays.ejemplos;

import java.util.Arrays;

public class ejemplo01 {  
    public static void main(String[] args) {
        int n[] = new int[4];
        n[0]=26;
        n[1]=-30;
        n[2]=0;
        n[3]=100;

        System.out.println("Los valores del array son:");
        System.out.println(Arrays.toString(n));

        int suma = n[0] + n[3];
        System.out.println("El primer elemento y el último suman: "+suma);
    }
}
