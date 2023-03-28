/*
Escribe una clase llamada Rectangulo que represente un rectángulo en un plano cartesiano.
La clase debe tener los siguientes atributos: base (double): la longitud de la base del rectángulo.
altura (double): la altura del rectángulo. La clase debe tener los siguientes métodos: calcularArea():
un método que calcule el área del rectángulo y la devuelva como un valor de tipo double. calcularPerimetro():
un método que calcule el perímetro del rectángulo y lo devuelva como un valor de tipo double. cambiarTamaño(double
factor): un método que cambie el tamaño del rectángulo multiplicando su base y altura por el factor dado como
parámetro. toString(): un método que devuelva una cadena de texto con los detalles del rectángulo, incluyendo
su base, altura, área y perímetro. Luego, en el método main, crea algunos objetos de la clase Rectangulo,
realiza algunas operaciones con ellos y utiliza el método toString para imprimir sus detalles en la consola.
 */
public class Rectangulo {
    private double base;
    private double altura;
    private double perimetro;
    private double area;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        area = base * altura;
        return area;
    }

    public double calcularPerimetro() {
        perimetro = 2 * base + 2 * altura;
        return perimetro;
    }

    public void cambiarTamanio(double factor) {
        base *= factor;
        altura *= factor;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", area=" + area +
                ", perimetro=" + perimetro +
                '}';
    }
}
