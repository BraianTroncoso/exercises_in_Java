/*
Crea una clase "Producto" con los siguientes atributos: nombre (String), precio (double) y cantidad en inventario (int).
La clase debe tener métodos para aumentar y disminuir la cantidad en inventario, y un método para imprimir
los detalles del producto (nombre, precio y cantidad en inventario).
Además, debe tener un método para calcular el valor total del inventario, que se obtiene multiplicando
el precio de cada producto por su cantidad en inventario y sumando los resultados.
 */
public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Precio: " + precio + ", Cantidad en inventario: " + cantidad;
    }
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void aumentarCantidad(int cantidad) {
        this.cantidad += cantidad;
    }

    public void disminuirCantidad(int cantidad) {
        if (cantidad <= this.cantidad) {
            this.cantidad -= cantidad;
        } else {
            System.out.println("No se puede disminuir la cantidad en " + cantidad + ". La cantidad actual es " + this.cantidad + ".");
        }
    }

    public void imprimirDetalles() { // Creamos un metodo similar al toString
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad en inventario: " + cantidad);
    }

    public double calcularValorTotal() {
        return precio * cantidad;
    }
}
