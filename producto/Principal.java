public class Principal {
    public static void main(String[] args) {
        Producto p1 = new Producto("Lápiz", 0.5, 100);
        Producto p2 = new Producto("Libreta", 1.5, 50);

        p1.aumentarCantidad(50);
        p2.disminuirCantidad(30);

       // System.out.println("Soy un especio reservado en memoria: " +p1);
        System.out.println("Salida de String con método propio");
        p1.imprimirDetalles();
        p2.imprimirDetalles();
        System.out.println("");
        System.out.println("Salida de String con método reservado ToString");
        System.out.println("");
        System.out.println("Objecto 1"+p1.toString());
        System.out.println("Objecto 2"+p2.toString());

        double valorTotal = p1.calcularValorTotal() + p2.calcularValorTotal();
        System.out.println("Valor total del inventario: " + valorTotal);
    }
}
