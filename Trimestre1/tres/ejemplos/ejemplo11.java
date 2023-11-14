package Trimestre1.tres.ejemplos;

public class ejemplo11 {
    public static void main(String[] args) {
        
        int i=0;

        while(i<10){
            System.out.println("La tabla del "+i);
            i++;
            int j=0;
            while(j<10){
                j++;
                System.out.println(i+"x"+j+"="+(i*j));
            }
            System.out.println();
        }
    }
}
