package trimestre2.repaso;

public class duplicados {
    public static void main(String[] args) {
        //doble bucle
        //externo de 1 a n j
        //interno j>i

        int arr[]={1,2,3,3,4,4,5,2};
        System.out.println("Elementos del array:");
        for(int i=0; i<arr.length; i++){
            System.out.println("Elemento ["+i+"] = "+arr[i]);
        }

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++ ){
                if(arr[i]==arr[j]){
                    System.out.println("El elemento de valor "+arr[i]+" de la posición "+i+
                    " se repite en la posición "+j);
                }
            }
        }
    }
}
