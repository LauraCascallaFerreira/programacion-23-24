package trimestre1.tres.ejemplos;

public class ejemplo08 {
    
    public static void main(String[] args) {
        
        int i=0;
        bucleext: while(i<100){
            i++;
            for(int j=0; j<i; j++){
                System.out.println("*");
                if(i==5){
                    break bucleext;
                }
            }
            System.out.println("");
        }
        System.out.println("Fin de código.");
    }
}
