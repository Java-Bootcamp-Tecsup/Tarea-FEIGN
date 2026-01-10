import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto("Arroz", 4.50));
        productos.add(new Producto("Atún", 6.00));
        productos.add(new Producto("Gaseosa", -3.00));

        double total = 0;

        for (Producto p : productos) {
            if (p.getPrecio() > 0) {
                p.mostrar();
                total += p.getPrecio();
            }
        }

        System.out.println("Total: S/ " + total);
    }


}