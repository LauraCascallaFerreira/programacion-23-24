package trimestre2.repaso;
//REVISAR PORQUE AHORA NO ME DA LA CABEZA
import java.util.Arrays;
import java.util.Scanner;

/*Ídem, desplazar N posiciones (N es introducido por el
usuario) */
public class arrays10 {

    public static void recogerArray(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime números para el array:");
        for (int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    public static void main(String[] args) {
        int arr[] = new int[10];
        int arr2[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas posiciones quieres desplazar el array?");
        int pos=sc.nextInt();
        recogerArray(arr);
        
        //Cambia los valores metiendolos en otra cadena
        for (int j=0; j<pos; j++){
            for(int i=0; i<arr.length; i++){
                //si i es igual a la ultima posicion entonces ese valor pasa a estar en la 0
                if(i==arr.length-1){
                    arr2[0]=arr[i];
                    arr2[1]=arr[i+1];
                //el resto de valores se mueven a la siguiente posicion
                }else{
                    arr2[i+2]=arr[i];
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
        sc.close();
    }
}
