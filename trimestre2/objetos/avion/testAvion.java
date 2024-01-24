package trimestre2.objetos.avion;

public class testAvion {
    public static void main(String[] args) {
        avion uno = new avion("Airbus", 2);
        avion dos = new avion("Loockheed", 4);
        System.out.println(uno.toString());
        System.out.println(dos.toString());
        uno.cambiarFabricante(uno);
        System.out.println(uno.toString());
    }
}
