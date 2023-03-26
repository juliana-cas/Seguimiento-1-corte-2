package EjercicioFactura;

import EjercicioFactura.Cliente;

import java.util.ArrayList;
import java.util.List;
public class Factura {
    private Cliente cliente;
    private List<Producto> productos;

    public Factura(Cliente cliente) {
        this.cliente = cliente;
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getTotal();
        }
        return total;
    }

    public void mostrarFactura() {
        System.out.println("=== EjercicioFactura.Factura ===");
        System.out.println("EjercicioFactura.Cliente: " + cliente.getNombre());
        System.out.println("Dirección: " + cliente.getDireccion());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("------------------");
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " x" + producto.getCantidad() + ": $" + producto.getTotal());
        }
        System.out.println("------------------");
        System.out.println("Total: $" + calcularTotal());
    }
}