package entities;

public class PruebaBnaco {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        cliente1.agregarCliente(cliente1);
        cliente2.agregarCliente(cliente2);

    }
}
