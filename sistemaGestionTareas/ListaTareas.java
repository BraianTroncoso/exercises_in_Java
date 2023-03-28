import java.util.ArrayList;
import java.util.Scanner;

public class ListaTareas {

    public static void main(String[] args) {

        ArrayList<String> tareas = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== LISTA DE TAREAS ===");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Ver lista de tareas");
            System.out.println("3. Editar tarea");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Salir");

            System.out.print("\nIntroduce tu opción: ");
            int opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la nueva tarea: ");
                    String nuevaTarea = input.next();
                    tareas.add(nuevaTarea);
                    break;
                case 2:
                    if (tareas.isEmpty()) {
                        System.out.println("La lista de tareas está vacía.");
                    } else {
                        System.out.println("=== LISTA DE TAREAS ===");
                        for (int i = 0; i < tareas.size(); i++) {
                            System.out.println((i+1) + ". " + tareas.get(i));
                        }
                    }
                    break;
                case 3:
                    if (tareas.isEmpty()) {
                        System.out.println("La lista de tareas está vacía.");
                    } else {
                        System.out.print("Introduce el número de la tarea a editar: ");
                        int tareaEditar = input.nextInt();
                        System.out.print("Introduce la nueva descripción de la tarea: ");
                        String descripcionTarea = input.next();
                        tareas.set(tareaEditar-1, descripcionTarea);
                    }
                    break;
                case 4:
                    if (tareas.isEmpty()) {
                        System.out.println("La lista de tareas está vacía.");
                    } else {
                        System.out.print("Introduce el número de la tarea a eliminar: ");
                        int tareaEliminar = input.nextInt();
                        tareas.remove(tareaEliminar-1);
                    }
                    break;
                case 5:
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }
    }
}