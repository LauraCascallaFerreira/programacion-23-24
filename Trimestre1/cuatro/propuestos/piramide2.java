package propuestos;

public class propuesto04 {

    /*   1
       1 1 1
     1 2 3 2 1
   1 3 6 7 6 3 1 */

   //Muestra esta pirámide usando recursividad

    public static int elemento(int fila, int columna){
        if(fila<1 || columna<1) return 0;
        if(columna==1) return 1;
        return elemento(fila-1, columna)+elemento(fila-1, columna-1)+elemento(fila-1, columna-2);
    }

    public static void main(String[] args) {
        int numFilas=4;
    
        for(int i=1; i<(numFilas+1); i++){
            for(int e=0; e<(numFilas-i); e++) System.out.print("  ");
            for(int j=0; j<(2*numFilas+1); j++){
                int dato=elemento(i, j);
                if(dato>0) System.out.print(dato+" ");
            }
        System.out.println(" ");
        }
    }
}
