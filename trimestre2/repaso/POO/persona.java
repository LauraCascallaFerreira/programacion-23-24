package trimestre2.repaso.POO;

public class persona {

    String nombre;
    int edad;
    String id;
    String sexo;
    double altura;
    double peso;

    public persona() {
    }

    public persona(String nombre, int edad, String id, String sexo, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //calcular imc
    public void calcularIMC(double altura, double peso){
        double IMC = peso / (altura*altura);
        System.out.println("Tu IMC es: "+IMC);
        if(IMC<20){
            System.out.println("Estás por debajo de tu peso ideal.");
        } else if(IMC>=20 && IMC<=25){
            System.out.println("Estás en tu peso ideal.");
        } else {
            System.out.println("Estás por encima de tu peso ideal.");
        }
    }

    //esmayoredad
    public void esMayorEdad(int edad){
        if(edad<18)
            System.out.println("Es menor de edad.");
        else 
            System.out.println("Es mayor de edad.");
    }

    //sexocorrecto
    public void sexoCorrecto(String sexo){
        sexo=sexo.toLowerCase();
        if(sexo=="hombre" || sexo=="mujer")
            System.out.println("Sexo correcto.");
        else
            System.out.println("Hablamos de sexo no de género.");
    }

    @Override
    public String toString() {
        return "persona [nombre=" + nombre + ", edad=" + edad + ", id=" + id + ", sexo=" + sexo + ", altura=" + altura
                + ", peso=" + peso + "]";
    }

    
    
}
