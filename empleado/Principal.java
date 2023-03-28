
import java.time.LocalDate;
import java.time.Period;
public class Principal {
    public static void main(String[] args) {
// Crear un empleado
        Empleado empleado1 = new Empleado("Juan Pérez", 1000.0, LocalDate.of(2010, 5, 1));

        System.out.println("El nombre del empleado es: "+empleado1.getNombre());
        System.out.println("Su salario es: " + empleado1.getSalario());
        System.out.println("Y la fecha de ingreso es de: " + empleado1.getFechaIngreso());


// Calcular el tiempo que ha trabajado en la empresa
        int tiempo = empleado1.tiempoTrabajandoEnAnios();
        System.out.println("El empleado ha trabajado " + tiempo + " años en la empresa");

// Incrementar el salario del empleado
        empleado1.incrementarSalario(10.0);
        System.out.println("El nuevo salario del empleado es " + empleado1.getSalario());

    }
}
