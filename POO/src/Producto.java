public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        setPrecio(precio);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("Precio invalido para: " + nombre);
            this.precio = 0;
        }
    }

    public void mostrar() {
        System.out.println("Producto: " + nombre + " - S/ " + precio);
    }
}
