package trimestre3.repaso;

import java.util.ArrayList;

import java.util.Iterator;

public class iterador {

    public static void main(String[] args) {
        ArrayList<String>array=pueblaLista();
        for(int i=0; i<array.size(); i++){
            System.out.println(array.get(i));
        }

        //Empleando un elemento iterator para recorrer la coleccion
        //Va recorriendo el array y mostrando cada uno de los elementos hasta que ya no
        //haya una siguiente
        System.out.println("Elementos del array recorridos por iterator.");
        Iterator<String>iterator=array.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        //Quita el último elemento
        iterator.remove();

        System.out.println("Elementos después de remover el iterator.");
        //Reasignamos de nuevo un iterador a la referencia que tenemos
        iterator=array.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        
        //Reasignamos por segunda vez el iterador a la colección
        System.out.println("Quitar todos los elementos del array.");
        iterator=array.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println("Mostramos otra vez el array");
        System.out.println(array);
    }

    public static ArrayList<String> pueblaLista(){
        ArrayList<String> numeros = new ArrayList<String>();
        numeros.add("uno");
        numeros.add("dos");
        numeros.add("tres");
        numeros.add("cuatro");
        numeros.add("cinco");
        numeros.add("seis");
        numeros.add("siete");
        numeros.add("ocho");
        numeros.add("nueve");
        numeros.add("diez");
                
        return numeros;
    }
}