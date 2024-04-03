package trimestre2.repaso.cadenas;

public class a01 {

    public static void main(String[] args) {
        String cadena = new String("Programación orientada a objetos.");

        System.out.println("Tamaño de la cadena: "+cadena.length());
        System.out.println("Mostrar valores de la cadena:");
        for(int i=0; i<cadena.length(); i++){
            System.out.println(cadena.charAt(i));
        }

        char frase[] = cadena.toCharArray();
        System.out.println(frase);

        String nombre="";
        //mostrar la frase sin espacios
        for(int i=0; i<frase.length; i++){
            if(frase[i]!=' ')
                nombre+=frase[i];
        }
        System.out.println(nombre);

        //metodo replace para reemplazar los espacios por no espacios
        String metodo = "";
        metodo=cadena.replace(" ", "");
        System.out.println(metodo);

        //poner las letras en mayusculas
        String mayusculas=metodo.toUpperCase();
        System.out.println(mayusculas);

         //concatenar string con algo
         String numeros=mayusculas.concat("12345");
         System.out.println(numeros);

         //mostrar determinadas letras o posiciones
        String recorte=numeros.substring(10,16);
        System.out.println(recorte);

        //Para reemplazar una cosa por otra
        String reemplazo = recorte.replace("Ó", "h");
        System.out.println(reemplazo);

        System.out.println(reemplazo.compareTo("Programación"));

        String uno="uno";
        String dos="dos";

        //compara la diferencia entre las letras en ascii
        System.out.println(uno.compareTo(dos));

        //te dice si es verdadero o falso dependiendo de si son iguales o no
        System.out.println(uno.equals(dos));

        //indexOF donde estan los valores, la posicion
        //valueOf el valor
    }
    
}
