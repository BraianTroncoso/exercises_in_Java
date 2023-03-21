import java.util.Scanner;

// Clase que representa la calculadora
class Calculadora {
    OperacionAritmetica operacionActual;

    public Calculadora() {
        // Seleccionar la operación de suma por defecto
        operacionActual = new Suma();
    }

    public void setOperacionActual(OperacionAritmetica operacionActual) {
        this.operacionActual = operacionActual;
    }

    public void realizarOperacion(double a, double b) {
        double resultado = operacionActual.calcular(a, b);
        String operacion = operacionActual.getClass().getSimpleName();
        System.out.printf("La %s de los números es: %f\n", operacion, resultado);
    }
}
