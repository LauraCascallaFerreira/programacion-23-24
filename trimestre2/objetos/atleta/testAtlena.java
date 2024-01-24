package trimestre2.objetos.atleta;
//REVISAR EL CÓDIGO PARA ENTENDER LA CREACIÓN DE ARRAYS EN EL FOR
public class testAtlena {
    public static void main(String[] args) {
        String nombres[]={"Alex, María, Laura, Gaalpos"};

        atleta[] team = new atleta[4];

        for(int i=0; i<nombres.length; i++){
            team[i]=new atleta(nombres[i]);
            System.out.println(team[i]);
        }

        atleta.calcularTiempo(team);
        atleta.imprimeDatos();
    }
}
