package trimestre1.tres;

public class resuelto03 {
    /*3. Realiza un programa que muestre por pantalla los 5 primeros números pares. */
    public static void main(String[] args) {
        
        System.out.println("Los cinco primeros números pares: ");

        for(int i=0; i<5; i++){
            if(i%2==0){
                System.out.println(2*i);
            }
        }
    }
}
