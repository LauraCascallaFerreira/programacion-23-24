package trimestre2.clasesInternas;

public class medicamento {
    
    String nombre;
    String fabricante;
    String viaAdministracion;
    posologia posologia;

    public medicamento() {
    }

    public medicamento(String nombre, String fabricante, String viaAdministracion) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.viaAdministracion = viaAdministracion;
    }
    /*Usuarios del medicamento
     * dosis del medicamento en mg
     * Tiempo de tomar el medicamento
     * 
     */

    public void setPosologia(posologia posologia) {
        this.posologia = posologia;
    }

    @Override
    public String toString() {
        return "medicamento [nombre=" + nombre + ", fabricante=" + fabricante + ", viaAdministracion="
                + viaAdministracion + ", posologia=" + posologia + "]";
    }

    class posologia{
        String usuarios;
        int dosis;
        String periodo;
        String recomendaciones;

        posologia(){
            
        }
        
        public posologia(String usuarios, int dosis, String periodo, String recomendaciones) {
            this.usuarios = usuarios;
            this.dosis = dosis;
            this.periodo = periodo;
            this.recomendaciones = recomendaciones;
        }

        @Override
        public String toString() {
            return "posologia [usuarios=" + usuarios + ", dosis=" + dosis + ", periodo=" + periodo
                    + ", recomendaciones=" + recomendaciones + "]";
        }
    }
}
