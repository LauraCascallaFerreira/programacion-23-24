package trimestre2.objetos.cadena;

import java.util.Scanner;

public class reto3 {
    /*Haz un programa que, en una serie de cadenas de texto pasadas como argumentos
     * al método principal, cuente cuántas contienen el carácter 'a' */

    public static int contar(char letra, String nombreDia){
        int count=0;
        for(int i=0; i<nombreDia.length(); i++){
            if(nombreDia.charAt(i)==letra)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String[] nombreDia = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes",
                              "Sábado", "Domingo"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce caracter a buscar: ");
        char letra=sc.nextLine().charAt(0);

        for(int i=0; i<nombreDia.length; i++){
            System.err.println(nombreDia[i]);
            System.out.println("Número de letras: "+nombreDia[i].length());
            System.out.println("Número de veces que aparece la letras "+letra+": "+
            contar(letra, nombreDia[i]));
        }
    }
}
