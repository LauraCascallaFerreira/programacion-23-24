package trimestre2.repaso.examenAñoPasado;

import java.util.ArrayList;
import java.util.Scanner;

/*
a/ poblar la lista con la información de varias personas (como
mínimo 5)
b/ añadir una persona
b/ Mostrar la información de todas las personas
c/ ordenar la lista por apellido en orden alfabético
d/ ordenar la lista por edad
e/ eliminar una persona (introduciendo el dni) */
public class ejercicio05B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Persona>persona=new ArrayList<Persona>();
        char menu = ' ';

        if(menu!='g'){
            System.out.println("Elige una opcion:");
            System.out.println("a. poblar lista");
            System.out.println("b. añadir persona");
            System.out.println("c. mostrar informacion de personas");
            System.out.println("d. ordenar lista por orden alfabetico");
            System.out.println("e. ordenar por edad");
            System.out.println("f. eliminar persona mediante dni");
            System.out.println("g. salir");
            menu=sc.next().charAt(0);

            switch (menu) {
                case'a':
                    
                break;
            
                default:
                    System.out.println("Opción incorrecta.");
            }

        }

    }

    public static void poblarLista(ArrayList<Persona>persona){
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas personas quieres añadir? (mínimo 5)");
        int num=sc.nextInt();

        for(int i=0; i<num; i++){
            //añadir con todos los atributos
        }

        System.out.println("Lista poblada correctamente.");
    }

    /*case 'd':
				Collections.sort(clase);
				break;
			case 'e':
				Alumno e;
				for (int i = 0; i < clase.size(); i++) {
					for (int j = 0; j < clase.size(); j++) {
						if ((clase.get(i).getNota()) > (clase.get(j).getNota())) {
							e = clase.get(j);
							clase.set(j, clase.get(i));
							clase.set(i, e);

						}
					}
				}
                break;

 */
}
