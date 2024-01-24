package trimestre2.objetos.figura;

public class testFigura {
    public static void main(String[] args) {
        circulo figura1 = new circulo("circulín", 10);
        rectangulo figura2 = new rectangulo("rectangulín", 10, 15);
        cuadrado figura3 = new cuadrado("cuadradín", 7);
        trianguloRectangulo figura4 = new trianguloRectangulo("triangulín", 20, 5);

        System.out.println(figura1.toString());
        System.out.println("El área del circulo es: "+figura1.calcularArea());
        System.out.println("El perímetro del circulo es: "+figura1.calcularPerimetro());

        System.out.println(figura2.toString());
        System.out.println("El área del rectángulo es: "+figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es: "+figura2.calcularPerimetro());

        System.out.println(figura3.toString());
        System.out.println("El área del cuadrado es: "+figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es: "+figura3.calcularPerimetro());

        System.out.println(figura4.toString());
        System.out.println("El área del triángulo es: "+figura4.calcularArea());
        System.out.println("El perímetro del triángulo es: "+figura4.calcularPerimetro());
    }
}
