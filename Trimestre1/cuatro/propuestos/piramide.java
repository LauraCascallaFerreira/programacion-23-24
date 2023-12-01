package propuestos;

public class piramide {

    //Mostrar esta piramide por recursividad
    /*   1
        1 1
       1 2 1
      1 3 3 1
     1 4 6 4 1 */
    
    //RECURSIVO suma(fila 5)------> algo+suma(fila 4)
    //caso límite suma(fila 1)-----> 1

    public static int elemento(int fila, int columna){
        if(columna==1)
            return 1;
        if(columna<1 || columna>fila)
            return 0;
        return elemento(fila-1, columna) + elemento (fila-1, columna-1);
}

    public static void main(String[] args) {

        int numFilas=5;
        for(int i=1; i<(numFilas+1); i++){
            for(int e=0; e<(numFilas-1); e++) 
                System.out.print(" ");
            for(int j=1; j<(numFilas+1); j++){
                int dato=elemento(i, j);
                if(dato>0)
                    System.out.print(dato+" ");
            }
            System.out.println();
        } //FIN EXTERIOR FILAS
    }
}
