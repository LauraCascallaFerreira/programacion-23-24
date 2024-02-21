package trimestre2.arrays.ejercicios;
import java.util.Arrays;
/*Escribe un programa que pida 8 palabaras y las almacene en un array. A continuación
 * las palabras correspondientes a colores se deben almacenar al comienzo y las que no son
 * colores a continuacion. Puedes utilizar tantos arrays aux como quieras. Los colores que 
 * conoce el programa deben estar en otro array y son los siguientes: 
 * verde, rojo, azul, amarillo, rosa, naranja, negro, blanco, morado.*/
import java.util.Scanner;

public class ejercicio14 {
    public static boolean esColor(String palabra){
        boolean es=false;
        String colores[] = {"verde", "rojo", "azul", "amarilo", "rosa", "naranja",
                            "negro", "blanco", "morado"};
        for(int j=0; j<colores.length; j++){
            if(palabra.equals(colores[j]))
                es=true;
            
        }
        return es;
    }
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        String pal[] = new String[8];

        for (int i=0; i<pal.length; i++){
            System.out.println("Introduce una palabra "+(i+1)+" : ");
            pal[i]=sc.next();
        }

        System.out.println(Arrays.toString(pal));

        int numCol=0;
        for(int i=0; i<pal.length; i++){
            if(esColor(pal[i]))
                    numCol++;
        }//bucle externo que recorre el array de palabras introducidas

        System.out.println("número de colores "+numCol);

        String[] co = new String[numCol];
        String[] nc = new String[8-numCol];

        int indC=0; int indN=0;

        for(int j=0; j<pal.length; j++){
            if(esColor(pal[j])){
                co[indC]=pal[j];
                indC++;
            }else {
                nc[indN]=pal[j];
                indN++;
            }
        }
        
        System.out.println(Arrays.toString(co));
        System.out.println(Arrays.toString(nc));

        sc.close();
    }
    
}
