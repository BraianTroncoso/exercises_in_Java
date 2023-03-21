import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        // Ciclo principal de la calculadora
        while (true) {
            // Pedir los números al usuario
            System.out.print("Ingrese el primer número: ");
            double a = sc.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double b = sc.nextDouble();

            // Realizar la operación aritmética actual
            calculadora.realizarOperacion(a, b);

            // Pedir la operación aritmética al usuario
            System.out.println("\nElija una operación aritmética:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.print("Seleccione una opción (1-4): ");

            int opcion = sc.nextInt();

            // Seleccionar la operación aritmética correspondiente
            switch (opcion) {
                case 1:
                    calculadora.setOperacionActual(new Suma());
                    break;
                case 2:
                    calculadora.setOperacionActual(new Resta());
                    break;
                case 3:
                    calculadora.setOperacionActual(new Multiplicacion());
                    break;
                case 4:
                    calculadora.setOperacionActual(new Division());
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
}