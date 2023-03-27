package vehiculo;

public class Vehiculo {
    //Atributos
    String modelo;
    String marca;
    int anioFabricacion;
    double precio;
    int anioAntiguedad;


    //Inicializamos el constructor con todos los atributos
    // para reemplazar el constructor por defecto
    public Vehiculo(String modelo, String marca, int anioFabricacion, double precio){
        this.modelo = modelo;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
    }


    // Calcular la antiguedad del Vehiculo
    public int calcularAntiguedad(int anioAntiguedad){
        this.anioAntiguedad = anioAntiguedad;
        if(anioFabricacion > 0){anioFabricacion = anioAntiguedad;}
    return anioAntiguedad;
    }

    // Calcular el valor residual, considerando que se desprecia un 10% por año
    public int calcularValorResidual(int valorResidual){
        valorResidual = (int) (precio * (1 - (0.1 * anioAntiguedad)));
        return valorResidual;
    }


}
