package trimestre2.hashMap.ejemplos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Implementar el control de acceso el area restringida de un programa. se debe
 * pedir un nombre y una contraseña. Si el usuario introduce los datos correctamente,
 * "Ha accedido" y tendra un  maximo de tres oportunidades si no dira lo siento no tiene
 * acceso. Los nombres con las contraseñas deber estar almacenadas en hashmap*/
public class ejemplo06 {

    public static HashMap<String, String> tabla = new HashMap<String, String>();

    public static void poblarMap(){
        tabla.put("Laura","cruzzi");
        tabla.put("Alejandro", "nano33");
        tabla.put("Gaalpos", "ceciliog");
        tabla.put("Maria", "onepiece");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        poblarMap();
        for(Map.Entry pos : tabla.entrySet()){
            System.out.print("usuario: "+pos.getKey()+" ");
            System.out.println("contraseña: "+pos.getValue());
        }

        String user="";
        String pass="";
        int intentos=0;
        boolean quedo=true;

        do{
            System.out.println("Dame el nombre de usuario: ");
            user=sc.nextLine();
            System.out.println("Dame la contraseña: ");
            pass=sc.nextLine();
            intentos++;
            if(tabla.containsKey(user)){
                String us=tabla.get(user);
                    if(pass.equals(us)){
                        System.out.println("Buenas "+user);
                        quedo=false;
                    } else {
                        System.out.println("Contraseña incorrecta");
                    }
            } else {
                System.out.println("Usuario no existente");
                System.out.println("Numero de intentos: "+(3-intentos));
            }
        } while (quedo&&intentos<3);
         
        if(intentos==3)
            System.out.println("se te han acabado los intentos");
        else
            System.out.println("Buena visita.");
            
        sc.close();
    }
}
