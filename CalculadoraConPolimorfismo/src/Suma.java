// Clase para la operación de suma
class Suma implements OperacionAritmetica {
    @Override
    public double calcular(double a, double b) {
        return a + b;
    }
}