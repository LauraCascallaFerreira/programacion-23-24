package Trimestre1.pruebas;

import java.util.Scanner;

import Trimestre1.tres.resuelto02;

public class LauraCascallanaFerreira_ejercicio4A {

    public static int divisionSuma(int multiplicador, int multiplicando){
        int suma=0;
        while(multiplicador>0){
            if(multiplicador%2!=0){
                
                suma+=multiplicando;
            } 
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

        System.out.println(divisionSuma(multiplicador, multiplicando));

    }
    
}
