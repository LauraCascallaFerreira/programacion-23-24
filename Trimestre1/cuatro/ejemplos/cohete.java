package trimestre1.cuatro.ejemplos;

public class cohete {

    public static int numCohetes=0;

    cohete(){
        numCohetes++;
    }

    public int getCohetes(){
        return numCohetes;
    }

    public static void setCohetes(int numCohetes){
        cohete.numCohetes=numCohetes;
    }

    public static void main(String[] args) {
        cohete c1 = new cohete();
        cohete c2 = new cohete();
        cohete c3 = new cohete();
        System.out.println(c1.getCohetes());
        System.out.println(c2.getCohetes());
    }
    
}
