import java.util.Scanner;

public class ejercicio05B {

    /*En 1959, el acuerdo internacional sobre la yarda y la libra (entre Estados Unidos y 
    los países de la mancomunidad de naciones Commonwealth) definió una yarda exactamente 
    como equivalente a 0.9144 metros y, a su vez, definió el pie como exactamente 
    0.3048 metros, la pulgada se ha definido y aceptado internacionalmente como equivalente
    a 0.0254 metros.
    Construya los métodos que permitan realizar las siguientes conversiones entre medidas:
    de metro a pie, 
    de yarda a metro
    de pie a yarda*/

    //metodo para convertir los metros en pies
    public static double metrosAPies(double metros){
        double pie=0;
        pie=metros/0.3048;
        return pie;
    }

    //metodo para convertir las yardas en metros
    public static double yardasAMetros(double yardas){
        double metros=0;
        metros=yardas*0.9144;
        return metros;
    }

    //metodo para convertir los pies en metros
    public static double piesAMetros(double pies){
        double metros=0;
            metros=pies*0.3048;
        return metros;
    }

    //metodo para convertir los pies en yardas
    public static double piesAYardas(Double pies){
        double yardas=0;
            yardas=piesAMetros(pies)*0.9144;
        return yardas;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una medida: ");
        double medida=sc.nextDouble();
        System.out.println("¿Qué opción quieres realizar?");
        System.out.println("METRO A PIE (1)");
        System.out.println("YARDA A METRO (2)");
        System.out.println("PIE A YARDA (3)");
        int operacion=sc.nextInt();

        //switch para los diferentes casos de elección
        switch (operacion) {
            case 1:
                System.out.println(medida+" metros en pies son: "+metrosAPies(medida));
            break;
            case 2:
                System.out.println(medida+" yardas en metros son: "+yardasAMetros(medida));
            break;
            case 3:
                System.out.println(medida+" pies en yardas son: "+piesAYardas(medida));
            break;
            default:
                System.out.println("ERROR DE ELECCIÓN");
            break;
        }
    }
}
