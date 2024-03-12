package trimestre2.repaso;

public class automovil {

    static String marca;
    static int modelo;
    static int motor;
    static int numeroPuertas;
    static int cantidadAsientos;
    static int velocidadMaxima;
    static int velocidadActual;

    enum tipoColor {BLANCO, NEGRO, ROJO, AZUL, NARANJA, VERDE, AMARILLO}
    enum tipoAutomovil {CIUDAD, FAMILIAR, EJECUTIVO}
    enum tipoCombustible {GASOLINA, DIESEL, BIODIESEL}
    
    public automovil() {
    }

    public automovil(String marca, int modelo, int motor, int numeroPuertas, int cantidadAsientos, int velocidadMaxima,
            int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = velocidadActual;
    }

    

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public static void acelerar(int acelerar){
        velocidadActual+=acelerar;
        if(velocidadActual>velocidadMaxima)
            velocidadActual=velocidadMaxima;
       
    }

    public static void desacelerar(int desacelerar){
        velocidadActual-=desacelerar;
        if(velocidadActual<0)
            velocidadActual=0;
        
    }

    public int frenar(){
        return velocidadActual=0;
    }

   

    

    

}
