package trimestre1.boletin02;

public class ejercicio04 {

    /*11. Diseñar un programa que muestre el producto de los 10 primeros números impares. */
    
    public static void main(String[] args) {

        int impar=0;
        int producto=1;
        
        for(int i=1; i<=10; i++){
            impar=(2*i-1);
            System.out.println("impar: "+impar);
            producto*=impar;
        }

        System.out.println("El producto de los 10 primeros números impares es: "+producto);

    }
}
