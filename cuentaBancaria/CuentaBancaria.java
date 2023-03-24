package cuentaBancaria;

public class CuentaBancaria {
    String nombreTitularCuenta;
    int numCuenta;
    double saldoActual;

    public CuentaBancaria(String nombreTitularCuenta, int numCuenta, double saldoActual){
        this.nombreTitularCuenta = nombreTitularCuenta;
        this.numCuenta = numCuenta;
        this.saldoActual = saldoActual;
    }

    public double Depositar(double ingreso){
        return saldoActual += ingreso;
    }

    public void Retirar(double ingreso){
        if (saldoActual >= ingreso && ingreso > 0)
        saldoActual -= ingreso;
        else {
            System.out.println("No tiene monto suficiente para retirar");
        }
    }

    public static void main(String[] args) {
        CuentaBancaria cuentaUsuario = new CuentaBancaria("Braian",1,500);
            System.out.println("Su saldo actual es: "+cuentaUsuario.saldoActual);
            cuentaUsuario.Depositar(500);
            System.out.println("Su saldo actual es: "+cuentaUsuario.saldoActual);
            cuentaUsuario.Retirar(500);
            System.out.println("Su saldo actual es: "+cuentaUsuario.saldoActual);
            cuentaUsuario.Retirar(500);
            System.out.println("Su saldo actual es: "+cuentaUsuario.saldoActual);
    }
}
