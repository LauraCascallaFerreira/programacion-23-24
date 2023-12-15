import java.util.Scanner;

public class ejercicio04B {

    /*La política de cobro de una compañía telefónica es:
    Cuando se realiza una llamada, el cobro es por el tiempo que esta dura, de tal forma 
    que los primeros cinco minutos cuestan 1 euro, los siguientes tres, 80 céntimos, los 
    siguientes dos minutos a 70 céntimos y a partir del décimo minuto, 50 céntimos.
    Además, se carga un impuesto de 3% cuando es domingo, y si es otro día, en turno de 
    mañana 15% y en turno de tarde 10%.
    Realiza un programa para determinar cuánto debe pagar por cada concepto una persona 
    que realiza una llamada.*/

    public static void porcentajeMañana(double precio){
        double impuesto=0;
        impuesto=precio*0.15;
        precio=precio+impuesto;
        System.out.println("Tu precio final a pagar es: "+precio);
    }

    public static void porcentajeTarde(double precio){
        double impuesto=0;
        impuesto=precio*0.10;
        precio=precio+impuesto;
        System.out.println("Tu precio final a pagar es: "+precio);
    }

    public static void porcentajeDomingo(double precio){
        double impuesto=0;
        impuesto=precio*0.03;
        precio=precio+impuesto;
        System.out.println("Tu precio final a pagar es: "+precio);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio=0;
        System.out.println("Qué día realizaste la llamada: (todo en minusculas y sin tildes)");
        String día=sc.nextLine();
        System.out.println("Cuanto duró la llamada:");
        double duracion=sc.nextDouble();

        //le puse un limite de minutos en la llamada que son 120
        switch (día) {
            case "lunes","martes","miercoles","jueves","viernes","sabado":
                System.out.println("Era turno de mañana(1) o de tarde(2)");
                int turno=sc.nextInt();
                while(duracion<=120 && duracion>10){
                    duracion-=120;
                    precio+=0.50;
                }
                while(duracion<=10 && duracion>8){
                    duracion-=2;
                    precio+=0.70;
                }
                while(duracion<=8 && duracion>5){
                    duracion-=3;
                    precio+=0.80;
                }
                while(duracion<=5 && duracion>0){
                    precio+=1;
                }
                switch(turno){
                    case 1:
                        porcentajeMañana(precio);
                    break;
                    case 2:
                        porcentajeTarde(precio);
                    break;
                    default:
                        System.out.println("ERROR DE INTRODUCCION");
                    break;
                }
            break;
            case "domingo":
                while(duracion<=120 && duracion>10){
                    duracion-=120;
                    precio+=0.50;
                }
                while(duracion<=10 && duracion>8){
                    duracion-=10;
                    precio+=0.70;
                }
                while(duracion<=8 && duracion>5){
                    duracion-=8;
                    precio+=0.80;
                }
                while(duracion<=5 && duracion>0){
                    precio+=1;
                }
                porcentajeDomingo(precio);
            break;
            default:
                System.out.println("ERROR EN EL DÍA");
            break;
        }
    }

}
