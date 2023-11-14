package Trimestre1.tres.propuestos;

public class propuesto02 {

    /*^ 2. Realiza un programa utilizando bucles que muestre la siguiente figura 
    por pantalla: 
    *
    **
    ***
    ****
    ***** */

    public static void main(String[] args) {
        for (int i=0; i<=5; i++){
            for(int j=0; j<i; j++){
            System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
