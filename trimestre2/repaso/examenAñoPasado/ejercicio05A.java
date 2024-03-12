package trimestre2.repaso.examenAñoPasado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*Programa que permita con un menú y usando una lista dinámica:
a/ poblar la lista con los nombres y las notas de varios alumnos
(como mínimo 5)
b/ añadir un alumno
c/ Mostrar los nombres y notas de todos
d/ ordenar la lista en orden alfabético
e/ ordenar la lista por notas
f/ eliminar un alumno (introduciendo el nombre) */
public class ejercicio05A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Alumno> alumno = new ArrayList<Alumno>();
        String menu="";
        System.out.println("Escoja una opción");
        System.out.println("a. Poblar lista  b.Añadir alumno  c.Mostrar nombres y notas  "+
        "d.Ordenar por orden alfabetico  e.Ordenar por notas  f.Eliminar alumno introduciendo nombre");
        menu=sc.nextLine();
        
        
        switch (menu) {
            case "a":
                poblarLista(alumno);
            break;
            case "b":
                añadirAlumno(alumno);
            break;
            case "c":
                mostrarArray(alumno);
            break;
            case "d":

            break;
            case "e":

            break;

            case "f":
            
            break;
        
            default:
                break;
        }

        sc.close();
    }

    public static void poblarLista(ArrayList<Alumno>alumno){
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos alumnos quieres añadir? (mínimo 5)");
        int num=sc.nextInt();

        for(int i=0; i<num; i++){
            System.out.println("Nombre:");
            String nombre=sc.nextLine();
            System.out.println("Nota:");
            double nota=sc.nextDouble();
            alumno.add(new Alumno(nombre, nota));
        }

        System.out.println("Lista poblada correctamente.");
        for(Alumno uno : alumno){
            System.out.println(uno);
        }
    }

    public static void añadirAlumno(ArrayList<Alumno>alumno){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre:");
        String nombre=sc.nextLine();
        System.out.println("Nota:");
        double nota=sc.nextDouble();

        alumno.add(new Alumno(nombre, nota));

        System.out.println("Alumno añadido correctamente.");
        for(Alumno uno : alumno){
            System.out.println(uno);
        }
    }

    public static void mostrarArray(ArrayList<Alumno>alumno){
        for(Alumno uno : alumno){
            System.out.println(uno);
        }
    }

    public static void eliminarAlumno(ArrayList<Alumno>alumno){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        
    }
}
