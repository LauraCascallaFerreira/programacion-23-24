package trimestre2.objetos.avion;

public class avion {

    String nombreFabricante;
    int numeroMotores;
    
    public avion() {
    }

    public avion(String nombreFabricante, int numeroMotores) {
        this.nombreFabricante = nombreFabricante;
        this.numeroMotores = numeroMotores;
    }
    
    public String getNombreFabricante() {
        return nombreFabricante;
    }
    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }
    public int getNumeroMotores() {
        return numeroMotores;
    }
    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    public static void cambiarFabricante(avion avion){
        avion.nombreFabricante="Loockheed";
    }

    @Override
    public String toString() {
        return "avion [nombreFabricante=" + nombreFabricante + ", numeroMotores=" + numeroMotores + "]";
    }
}
