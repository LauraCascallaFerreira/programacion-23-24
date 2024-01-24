package trimestre1.pruebas;

import java.util.Scanner;

import trimestre1.tres.resuelto02;

public class LauraCascallanaFerreira_ejercicio4A {

    public static int multiplicacionRusa(int multiplicador, int multiplicando){
        int suma=0;
        while(multiplicador>0){
            if(multiplicador%2!=0) suma+=multiplicando;
            
            multiplicador/=2;
            multiplicando*=2;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame multiplicador: ");
        int multiplicador=sc.nextInt();
        System.out.println("Dame multiplicando: ");
        int multiplicando=sc.nextInt();

        System.out.println("El resultado de la multiplicación es: "+multiplicacionRusa(multiplicador, multiplicando));

    }
    
}
