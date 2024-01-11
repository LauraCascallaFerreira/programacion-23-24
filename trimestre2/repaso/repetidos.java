package trimestre2.repaso;

import java.util.Scanner;

public class repetidos {

    public static void mostrarArray(int[] array) {
		System.out.println("ELEMENTOS DEL ARRAY");

		int n = array.length;

		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("]");
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		int[] array1 = { 1, 2, 3, 3, 4, 4, 5, 2 };
        int[] array2 = { 7, 7, 5, 9, 1, 4, 3, 6 };

        int n=array1.length;
        int m=array2.length;

		mostrarArray(array1);
        mostrarArray(array2);

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(array1[i]==array2[j]){
                    System.out.println("El valor: "+array1[i]+" está repetido en la posición "+
                    i+" de A y posición "+j+" de B");
                }
            }//recorro b para cada elemento de a
        }//recorro a
    }
}
