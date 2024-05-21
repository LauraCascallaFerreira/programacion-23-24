package trimestre3.herencia.SistemaPago;

public class testPeaje {

    public static void main(String[] args) {

        Peaje p1 = new Peaje("Pontevedra", "Galicia");

        Coche coche = new Coche("6647HMB", 9);
        p1.añadirVehiculo(coche);
        Moto moto = new Moto("7969LTL", 6);
        p1.añadirVehiculo(moto);
        Camion camion = new Camion("5652DSD", 12);
        p1.añadirVehiculo(camion);
        
        p1.calcularPeaje(coche);
        p1.calcularPeaje(moto);
        p1.añadirVehiculo(camion);

        System.out.println("Total de peaje: "+p1.calcularPeaje(coche));
        System.out.println("Total de peaje: "+p1.calcularPeaje(moto));
        System.out.println("Total de peaje: "+p1.calcularPeaje(camion));
    }
}
