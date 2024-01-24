package trimestre1.tres.ejemplos;

public class ejemplo06 {
    
    public static void main(String[] args) {
        
        int numero = 1;
        do{ //bucle que cuenta hasta 10
        System.out.println(numero);
        numero++;
        try{
            Thread.sleep(500);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        } while(numero<=10);
        System.out.println("Fin del primer código.");

        for(int i=1; i<=10; i++){
            System.out.println(i);
            try{
                Thread.sleep(500);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Fin del segundo código");
    }
}


