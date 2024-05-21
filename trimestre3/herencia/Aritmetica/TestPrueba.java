package trimestre3.herencia.Aritmetica;

public class TestPrueba {

    public static void main(String[] args) {

        Fraccion uno = new Fraccion(new Numero(4), new Numero(9));
        Fraccion dos = new Fraccion(new Numero(7), new Numero(3));

        System.out.println(uno.toString());
        System.out.println(dos.toString());

        System.out.println("OPERACIONES CON PRIMERA FRACCION");
        System.out.println("Suma-->");
        uno.sumar(dos);
        System.out.println(uno);

        System.out.println("Resta-->");
        uno.restar(dos);
        System.out.println(uno);

        System.out.println("Multiplicación-->");
        uno.multiplicar(dos);
        System.out.println(uno);

        System.out.println("División-->");
        uno.dividir(dos);
        System.out.println(uno);

        System.out.println();

        System.out.println("OPERACIONES CON SEGUNDA FRACCION");
        System.out.println("Suma-->");
        dos.sumar(uno);
        System.out.println(dos);

        System.out.println("Resta-->");
        dos.restar(uno);
        System.out.println(dos);

        System.out.println("Multiplicación-->");
        dos.multiplicar(uno);
        System.out.println(dos);

        System.out.println("División-->");
        dos.dividir(uno);
        System.out.println(dos);
    }
}
