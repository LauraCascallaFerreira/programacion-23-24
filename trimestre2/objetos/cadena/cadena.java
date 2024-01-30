package trimestre2.objetos.cadena;

import java.util.Arrays;

public class cadena {
    public static void main(String[] args) {
        String cadena = new String("Programación orientada a objetos");
        //mostrar la longitud de la cadena
        System.out.println("La longitud de la cadena es: "+cadena.length());

        //mostrar los valores de cada posición en la cadena
        for (int j=0; j<cadena.length(); j++){
            //System.out.println(cadena.charAt(j));
            System.out.print("->"+cadena.charAt(j)+"<-");
        }

        System.out.println();

        char frase[] = cadena.toCharArray();
        System.out.println(Arrays.toString(frase));

        String nombre="";

        for(int i=0; i<frase.length; i++){
            if(frase[i]!=' ')
                nombre+=frase[i];
        }

        System.out.println(nombre);

        //metodo replace
        String metodo = "";
        metodo=cadena.replace(" ", "");
        System.out.println(metodo);
        //poner las letras en mayusculas
        String mayusculas=metodo.toUpperCase();
        System.out.println(mayusculas);

        //concatenar string con algo
        String numeros=mayusculas.concat("12345");
        System.out.println(numeros);

        String recorte=numeros.substring(10,16);
        System.out.println(recorte);

        String reemplazo = recorte.replace("Ó", "h");
        System.out.println(reemplazo);

        System.out.println(reemplazo.compareTo("Programación"));

        String uno="uno";
        String dos="dos";
        System.out.println(uno.compareTo(dos));
        System.out.println(uno.equals(dos));

        //trim, indexof, valueof
    }
}
