public class factorialRecursivo {
    
    public static int calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }
    public static void main(String[] args) {
        int numero = 5; // Puedes cambiar este número para calcular el factorial de otro valor
        int resultado = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
    
        
    
    
}
