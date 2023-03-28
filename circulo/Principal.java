public class Principal {
    public static void main(String[] args) {
        Circulo miCirculo = new Circulo(5.0);
        double perimetro = miCirculo.calcularPerimetro();
        double area = miCirculo.calcularArea();
        System.out.println(("El perimetro del circulo es: ")+String.format("%.2f", perimetro));
        System.out.println(("El area del circulo es: ")+String.format("%.2f", area));
    }
}
