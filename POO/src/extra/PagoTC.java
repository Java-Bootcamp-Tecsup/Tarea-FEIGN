package extra;

public class PagoTC implements CoreTickeMaster{
    @Override
    public void pagar(double monto) {
        System.out.println("Pagando con TC " + monto);
    }
}
