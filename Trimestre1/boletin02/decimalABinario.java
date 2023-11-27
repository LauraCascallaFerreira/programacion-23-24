package Trimestre1.boletin02;

public class decimalABinario {
        
        public static int decabinario(int n){
            if(n<=2){
                return (n%2)+(n/2)*10;
            } else {
                return ((n%2)+decabinario(n/2)*10);
            }
        }

        
    
    
}
