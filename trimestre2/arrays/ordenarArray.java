package trimestre2.arrays;

import java.util.Arrays;

public class ordenarArray {
    /*Crear un array de caracteres y luego ordenarlo alfabeticamente */
    public static void main(String[] args) {

        char[] caracteres = ("hola me llamo maria victoria ojala les interese mi historia").toCharArray();

        //Antes de ordenar
        System.out.println(Arrays.toString(caracteres));
        //sort es un metodo para ordenar
        Arrays.sort(caracteres);
        //Despues de ordenar
        System.out.println(Arrays.toString(caracteres));

        //imprimir valores minimos y maximos de un entero
        
    }
}
