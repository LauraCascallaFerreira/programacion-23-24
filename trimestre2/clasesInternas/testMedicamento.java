package trimestre2.clasesInternas;

import trimestre2.clasesInternas.medicamento.posologia;

public class testMedicamento {
    public static void main(String[] args) {
        medicamento magico = new medicamento("mana", "godInc", "oral");
        //para poder usar la clase interna tenemos que hacer obligatoriamente un constructor por defecto
        medicamento.posologia pos = magico.new posologia();
        magico.setPosologia(pos);
        System.out.println(magico);

        medicamento medicamento=new medicamento("Aspirina", "Bayer", "Oral");
        medicamento.posologia posologia = medicamento.new posologia("Adultos y mayores de 16", 500, "6 horas", "Tomar después de comer.");
        medicamento.setPosologia(posologia);
        System.out.println(medicamento);
    }
}
