package trimestre2.objetos.conversor;

public class conversorMetros {
    double metros;
    final int FACTOR_METROS_CM = 100;
    final int FACTOR_METROS_MILIM = 1000;
    final double FACTOR_METROS_PULGADAS = 39.37;
    final double FACTOR_METROS_PIES = 3.28;
    final double FACTOR_METROS_YARDAS = 1.09361; 

    public conversorMetros(double metros) {
        this.metros = metros;
    }

    public double metrosACentímetros() {
        double centímetros;
        centímetros = FACTOR_METROS_CM * metros;
        return centímetros;
    }  

    public double metrosAMilímetros() {
        double milímetros;
        milímetros = FACTOR_METROS_MILIM * metros;
        return milímetros;
    }

    public double metrosAPulgadas() {
        double pulgadas;
        pulgadas = FACTOR_METROS_PULGADAS * metros;
        return pulgadas;
    }

    public double metrosAPies() {
        double pies;
        pies = FACTOR_METROS_PIES * metros;
        return pies;
    }

    public double metrosAYardas() {
        double yardas;
        yardas = FACTOR_METROS_YARDAS * metros;
        return yardas;
    }

    @Override
    public String toString() {
        return "conversorMetros [metros=" + metros + ", FACTOR_METROS_CM=" + FACTOR_METROS_CM + ", FACTOR_METROS_MILIM="
                + FACTOR_METROS_MILIM + ", FACTOR_METROS_PULGADAS=" + FACTOR_METROS_PULGADAS + ", FACTOR_METROS_PIES="
                + FACTOR_METROS_PIES + ", FACTOR_METROS_YARDAS=" + FACTOR_METROS_YARDAS + "]";
    }
}
