import java.util.Scanner;

public class perfectos {

    /*Un número se considera perfecto si la suma de todos sus divisores propios 
    (excluyendo el propio número) es igual al número original. */
    
    public static int sumaDivisores(int num){
        int suma=0;
        for(int i=1; i<num; i++){
            if(num%i==0){
                suma+=i;
            }
        }
        return suma;
    }

    public static boolean esPerfecto(int num){
        boolean perfecto=false;
        if(sumaDivisores(num)==num)
            perfecto=true;
        else perfecto=false;
        return perfecto;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número.");
        int num=sc.nextInt();
        System.out.println("El número "+num+" es perfecto? "+esPerfecto(num));
    }
}
