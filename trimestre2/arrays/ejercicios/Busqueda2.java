package trimestre2.arrays.ejercicios;

import java.util.Scanner;

public class Busqueda2 {
    
    //Buscar elementos similares en los dos arrays
	
	public static void mostrarArray(int[] array) {
		System.out.println("ELEMENTOS DEL ARRAY");

		int n = array.length;

		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("]");
	}

	public static boolean isInArray(int[] array, int num) {
		boolean esta = false;
		int n = array.length;

		for (int i = 0; i < n; i++) {
			if (array[i] == num) {
				esta = true;
				break;
			}
		}
		return esta;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array1 = { 1, 2, 3, 3, 4, 4, 5, 2 };
		int[] array2 = { 7, 7, 5, 9, 1, 4, 3, 6 };

		int n = array1.length;
		int m = array2.length;
		
		mostrarArray(array1);
		mostrarArray(array2);
		
		for (int i = 0; i<n; i++) {
			
			for (int j = 0; j<m; j++) {
				
				if(array1[i] == array2[j]) {
					System.out.println("El valor: "+array1[i]+" esta repetido en la posicion "+i+
							" del primer Array y en la posicion "+j+" del segundo Array");
					
				}
				
			}// recorro B para cada elemento de A
			
		}// recorro A


	}
}
