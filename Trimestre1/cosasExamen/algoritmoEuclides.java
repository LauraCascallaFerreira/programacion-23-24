package cosasExamen;

import java.util.Scanner;

public class algoritmoEuclides {
    public static int maximoComunDivisor(int num1, int num2){
        while(num2>0){
            if(num1>num2){
                num1=num1-num2;
            } else num2=num2-num1;
        }
        return num1;
    }

    public static int minimoComunMultiplo(int num1, int num2){
        int producto=num1*num2;
        
        return producto/maximoComunDivisor(num1, num2);
    }

    public static void main(String[] args) {
        int num1=0; int num2=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número: ");
        num1=sc.nextInt();
        System.out.println("Dame otro número:");
        num2=sc.nextInt();

        System.out.println("Maximo comun divisor "+maximoComunDivisor(num1, num2));
        System.out.println("Minimo comun multimpo "+minimoComunMultiplo(num1, num2));
    }
}
