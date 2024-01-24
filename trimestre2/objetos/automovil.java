package trimestre2.objetos;

public class automovil {
    
    enum tipoCombustible{GASEOSO, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL};
    enum tipoAutomovil{CIUDAD, SUBCOMPACTO, FAMILIAR, EJECUTIVO, SUV};
    enum tipoColor{BLANCO, NEGRO, ROJO, AZUL};

    private String marca;
    private int modelo;
    private int motor;
    private int numeroPuertas;
    private int cantidadAsientos;
    private int velocidadMaxima;
    private tipoColor tipoColor;
    private tipoCombustible tipoCombustible;
    private tipoAutomovil tipoAutomovil;
    private int velocidadActual;

    public automovil() {
        
    }

    public automovil(String marca, int modelo, int motor, int numeroPuertas, int cantidadAsientos, int velocidadMaxima,
            trimestre2.objetos.automovil.tipoColor tipoColor,
            trimestre2.objetos.automovil.tipoCombustible tipoCombustible,
            trimestre2.objetos.automovil.tipoAutomovil tipoAutomovil, int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoColor = tipoColor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.velocidadActual = velocidadActual;
    }

    public String getMarca() {
        return marca;
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

    public tipoColor getTipoColor() {
        return tipoColor;
    }

    public void setTipoColor(tipoColor tipoColor) {
        this.tipoColor = tipoColor;
    }

    public tipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(tipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public tipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(tipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
    public int acelerar(int acelerar){
        velocidadActual+=acelerar;
        if(velocidadActual>velocidadMaxima)
            return velocidadMaxima;
        else return velocidadActual;
    }

    public int desacelerar(int desacelerar){
        velocidadActual-=desacelerar;
        if(velocidadActual<0)
            return velocidadActual=0;
        else return velocidadActual;
    }

    public int frenar(){
        return velocidadActual=0;
    }

    public double calcularTiempoLlegada(int distancia){
        distancia/=velocidadActual;
        return distancia;
    }

    @Override
    public String toString() {
        return "automovil [marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + ", numeroPuertas="
                + numeroPuertas + ", cantidadAsientos=" + cantidadAsientos + ", velocidadMaxima=" + velocidadMaxima
                + ", tipoColor=" + tipoColor + ", tipoCombustible=" + tipoCombustible + ", tipoAutomovil="
                + tipoAutomovil + ", velocidadActual=" + velocidadActual + "]";
    }
}
