package Trimestre1.tres.ejemplos;

public class ejemplo07 {
    
    public static void main(String[] args) {
        int i=0;
        while(i<10){ //este programa muestra los números del 1 al 10
        i++; // sin mostrar el 5
        if (i==5){
            continue;
        }
        System.out.println(i);
        }
    }
}
