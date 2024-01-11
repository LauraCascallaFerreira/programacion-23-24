package trimestre2.repaso;

import java.util.Scanner;

public class busquedaEnDos {

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
	
	public static void presenciaNumero(int[] array1, int[] array2, int num1, int num2) {
		
		if (isInArray(array1, num1) && isInArray(array2, num2))
			System.out.println("El numero "+num1+" y "+num2+" están en el array");
		else if (isInArray(array1, num1))
			System.out.println("El numero "+num1+" está en el array y el "+num2+" no está.");
		else if (isInArray(array2, num2))
			System.out.println("El numero "+num2+" está en el array y el "+num1+" no está.");
		else 
			System.out.println("El numero "+num1+" y "+num2+" no están en el array");
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array1 = { 1, 2, 3, 3, 4, 4, 5, 2 };
        int[] array2 = { 7, 7, 5, 9, 1, 4, 3, 6 };

		mostrarArray(array1);
        mostrarArray(array2);
        
		System.out.println("Dame un entero: ");
		int num1 = sc.nextInt();

        boolean uno=false;
        boolean dos=false;

        uno=isInArray(array1, num1);
		dos=isInArray(array2, num1);

		if(uno&&dos)
            System.out.println("num "+num1+" está en ambos arrays.");
        else 
            System.out.println("num "+num1+" no está en ambos arrays.");

	}
    
}
