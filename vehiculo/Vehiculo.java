package vehiculo;

public class Vehiculo extends Consecionaria {
    //Atributos
    private String modelo;
    private String marca;
    private int anioFabricacion;
    private double precio;
    private int anioAntiguedad;


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAnioAntiguedad() {
        return anioAntiguedad;
    }

    public void setAnioAntiguedad(int anioAntiguedad) {
        this.anioAntiguedad = anioAntiguedad;
    }

    // Constructor inicializado para setear los atributos de forma manual sin pasarlos por argumentos
    public Vehiculo(){};


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
