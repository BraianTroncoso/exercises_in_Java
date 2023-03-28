/*
Crea una clase Empleado con los siguientes atributos: nombre, salario y fecha de ingreso a la empresa.
La clase debe tener un método que calcule el tiempo que el empleado lleva trabajando en la empresa, en años.
Además, debe tener otro método que incremente el salario del empleado en un
porcentaje que se le pase como argumento.
 */
import java.time.LocalDate;
import java.time.Period;
public class Empleado {
    private String nombre;
    private double salario;
    private LocalDate fechaIngreso;

    public Empleado(String nombre, double salario, LocalDate fechaIngreso) {
        this.nombre = nombre;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
    }
    public int tiempoTrabajandoEnAnios() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaIngreso, fechaActual);
        return periodo.getYears();
    }

    public void incrementarSalario(double porcentaje) {
        double aumento = salario * porcentaje / 100;
        salario += aumento;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}



