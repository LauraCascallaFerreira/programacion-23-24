package trimestre2.repaso.examenAñoPasado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    if(menu!="g"){
        System.out.println("Escoja una opción");
        System.out.println("a. Poblar lista  b.Añadir alumno  c.Mostrar nombres y notas  "+
        "d.Ordenar por orden alfabetico  e.Ordenar por notas  f.Eliminar alumno introduciendo nombre "+
        "g.Salir");
        menu=sc.nextLine();
        
        
        switch (menu) {
            case "a":
                poblarLista(alumno);
            break;
            case "b":
                añadirAlumno(alumno);
            break;
            case "c":
                mostrarAlumnos(alumno);
            break;
            case "d":
                ordenarPorNombre(alumno);
            break;
            case "e":
                ordenarPorNota(alumno);
            break;

            case "f":
                eliminarAlumno(alumno);
            break;

            case "g":
                System.out.println("Saliendo del programa...");
            break;
        
            default:
                System.out.println("Opcion incorrecta.");
        }
    } 

        sc.close();
    }

    public static void poblarLista(ArrayList<Alumno>alumno){
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos alumnos quieres añadir? (mínimo 5)");
        int num=sc.nextInt();

        for(int i=0; i<num; i++){
            System.out.println("Nombre:");
            String nombre=sc.next();
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

    public static void mostrarAlumnos(ArrayList<Alumno>alumno){
        if (alumno.isEmpty()) {
            System.out.println("No hay alumnos en la lista.");
        } else {
            for (Alumno lista : alumno) {
                System.out.println("Nombre: " + lista.getNombre() + ", Nota: " + lista.getNota());
            }
        }
    }

    public static void ordenarPorNombre(ArrayList<Alumno>alumno){
        Collections.sort(alumno);
        System.out.println("Lista ordenada por nombre.");
        mostrarAlumnos(alumno);
    }

    public static void ordenarPorNota(ArrayList<Alumno>alumno){
        Collections.sort(alumno, Comparator.comparing(Alumno::getNota).reversed());
        System.out.println("Lista ordenada por nota.");
        mostrarAlumnos(alumno);
    }

    private static void eliminarAlumno(ArrayList<Alumno> alumnos) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el nombre del alumno a eliminar: ");
        String nombre = sc.nextLine();

        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNombre().equals(nombre)) {
                alumnos.remove(i);
                System.out.println("Alumno eliminado con éxito.");
                return;
            } else {
                System.out.println("El nombre que has introducido no se encuentra en la lista.");
            }
        }
    }
}
