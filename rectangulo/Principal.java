public class Principal {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(2,5);
        rectangulo1.calcularArea();
        rectangulo1.calcularPerimetro();
        System.out.println("Soy el objecto 1 " + rectangulo1.toString());
        rectangulo1.cambiarTamanio(25);
        System.out.println("Soy el objecto 1 con un nuevo tamaño " + rectangulo1.toString());


        Rectangulo rectangulo2 = new Rectangulo(5, 5);
        rectangulo2.calcularArea();
        rectangulo2.calcularPerimetro();
        System.out.println("Soy el objecto 2 " + rectangulo2.toString());
        rectangulo2.cambiarTamanio(2);
        System.out.println("Soy el objecto 2 con un nuevo tamaño " + rectangulo2.toString());



        Rectangulo rectangulo3 = new Rectangulo(3, 5);
        rectangulo3.calcularArea();
        rectangulo3.calcularPerimetro();
        System.out.println("Soy el objecto 3 " + rectangulo3.toString());
    }
}
