public class PruebaContador {
    public static void main(String[] args) {
        Contador contador1 = new Contador();
        Contador contador2 = new Contador();
        Contador contador3 = new Contador();

        // Implementamos la instancia contador 1
        contador1.aumentar();
        contador1.aumentar();
        System.out.println("contador1 = " + contador1);

        // Implementamos la instancia contador 2

        contador2.aumentar();
        contador2.decrementar();
        System.out.println("contador2 = " + contador2);

        // Implementamos la instancia contador 3
        contador3.decrementar();
        contador3.decrementar();
        contador3.decrementar();
        System.out.println("contador3 = " + contador3);
    }
}
