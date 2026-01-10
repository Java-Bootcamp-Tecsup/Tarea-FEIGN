package extra;

public class PagoTD implements CoreTickeMaster {

    @Override
    public void pagar(double monto) {
        System.out.println("PAGANDO CON TD " + monto);
    }
}
