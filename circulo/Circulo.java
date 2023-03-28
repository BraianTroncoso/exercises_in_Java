public class Circulo {
    private double radio;
    private double area;

    // Constructor por defecto
    //public Circulo(){};

    // Constructor con argumentos / parametros
    public Circulo(double radio){
        this.radio = radio;
    }
    public double calcularArea() {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }
    public double calcularPerimetro() {
        double pi = 3.14159265359;
        return 2 * pi * radio;
    }
    public double cambiarRadio(double nuevoRadio){
        radio = nuevoRadio;
        return nuevoRadio;
    }
}
