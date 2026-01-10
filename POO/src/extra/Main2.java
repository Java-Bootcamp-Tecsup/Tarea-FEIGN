package extra;

public class Main2 {
    public static void main(String[] args) {
       //Dia hoy = Dia.JUEVES;
       //if (hoy == Dia.MIERCOLES) System.out.println("Hoy es miercoles");

        //Volador v1 = new Avion();
        //Volador v2 = new Tucan();

        //v1.volar();
        //v2.volar();

        CoreTickeMaster pagoTD = new PagoTD();
        CoreTickeMaster pagoTC = new PagoTC();

        pagoTD.pagar(100);
        pagoTC.pagar(50);
        pagoTD.pagar(25);

    }
}
