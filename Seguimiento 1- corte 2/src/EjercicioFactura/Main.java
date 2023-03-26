package EjercicioFactura;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Daniel Orozco", "Calle 123", "3174247454");
        Factura factura = new Factura(cliente);

        Producto producto1 = new Producto("Libro", 5000, 2);
        factura.agregarProducto(producto1);

        Producto producto2 = new Producto("Pelota", 12000, 3);
        factura.agregarProducto(producto2);

        factura.mostrarFactura();
    }
}
