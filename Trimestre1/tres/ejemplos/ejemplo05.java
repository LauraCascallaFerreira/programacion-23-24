package trimestre1.tres.ejemplos;

import java.util.Scanner;

public class ejemplo05 {

    public static void main(String[] args) {

        int numeroMes;
        String estacion = "", mes = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el numero del mes:");
        numeroMes=sc.nextInt();

        switch (numeroMes) {
            case 12:
                mes = "Diciembre";
            
            case 2:
                mes = "Febrero";
                estacion = "Invierno";
            break;
            case 3:
                mes = "Marzo";
            case 4:
                mes = "Abril";
            case 5:
                mes = "Mayo";
                estacion = "Primavera";
            break;
            case 6:
                mes = "Junio";
            case 7:
                mes = "Julio";
            case 8:
                mes = "Agosto";
                estacion = "Verano";
            break;
            case 9:
                mes = "Septiembre";
            case 10:
                mes = "Octubre";
            case 11:
                mes = "Noviembre";
                estacion = "Otoño";
            break;
        }
        System.out.println("El mes de " + mes + " se encuentra en la estación " + estacion);
    }
}
