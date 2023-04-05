package entities;

import entities.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente>clientes;
    private double saldoTotal;

    public Banco() {
        clientes = new ArrayList<>();
        this.saldoTotal = 0;
    }

    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void eliminarCliente(Cliente cliente){
        clientes.remove(cliente);
    }



    public double calcularSaldoTotal(){
        saldoTotal = 0;
        for (Cliente cliente : clientes) {
            saldoTotal += cliente.getSaldo();
        }
        return saldoTotal;
    }

    public List<Cliente> obtenerClientesConSaldoNegativo() {
        List<Cliente> clientesConSaldoNegativo = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente.getSaldo() < 0) {
                clientesConSaldoNegativo.add(cliente);
            }
        }
        return clientesConSaldoNegativo;
    }

    public List<Cliente> obtenerClientesConSaldoPositivo() {
        List<Cliente> clientesConSaldoPositivo = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente.getSaldo() > 0) {
                clientesConSaldoPositivo.add(cliente);
            }
        }
        return clientesConSaldoPositivo;
    }

}
