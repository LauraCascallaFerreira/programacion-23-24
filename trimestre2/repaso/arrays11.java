package trimestre2.repaso;

import java.util.Scanner;

/*Leer 5 elementos numéricos que se introducirán
ordenados de forma creciente. Éstos los guardaremos en una
tabla de tamaño 10. Leer un número N, e insertarlo en el
lugar adecuado para que la tabla continúe ordenada*/

public class arrays11 {
    public static void main(String[] args) {

        int arr[] = new int[10];

        Scanner sc = new Scanner(System.in);
        //recogemos los cinco nº
        System.out.println("Dame 5 nº: ");
        for (int i=0; i<5; i++){
            arr[i]=sc.nextInt();
        }

        //pedimos el nº que queremos introducir
        System.out.println("Introduce un nº: ");
        int num=sc.nextInt();

        //variable para recoger la posición donde estará dicho nº
        int posicionNumero=0;

        //bucle para decidir cuál será la posición del nº
        for(int i=0; i<5; i++){
            //si el nº es menor al de i, entonces se quedará en esa posición
            if(num<arr[i]){
                posicionNumero=i;
                break;
            //si no pasará a la siguiente
            } else {
                posicionNumero=i+1;
            }
        }

        //bucle para mover el resto de nº una vez tenemos asignada la posición del nº
        for(int i=4; i>=posicionNumero; i--){
            arr[i+1]=arr[i];
        }
        //metemos en la posicion sobrante el numero introducido
        arr[posicionNumero]=num;

        //mostramos los nº del array
        for(int i=0; i<6; i++){
            System.out.print(arr[i]+" ");
        }
        
        sc.close();
    }
}
