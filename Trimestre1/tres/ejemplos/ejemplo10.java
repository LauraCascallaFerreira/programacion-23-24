package Trimestre1.tres.ejemplos;

public class ejemplo10 {
    /*Mostrar todas las tablas desde el uno hasta el 10 en un maximo de 5 lineas */
    public static void main(String[] args) {
        for(int i=0; i<=10; i++){
            for(int j=0; j<=10; j++){
                System.out.println(i+"x"+j+"="+(i*j));
            }
        }
    }
}
