/*
Cree una clase llamada Hábitacion que inclua un atributo entero para el numero de la habitacion
y un atributo real para la tarifa de alquiler nocturno. Inclua métodos get para estos campos
y un constructor que requiera un argumento entero que represente el número de hábitacion. El
constructor establece la tarifa de la habitación según el número de hábitacion. El constructor
establece la tarifa de la habitacion según el número de la habitacion, las habitaciones numeradas
299 y siguientes cuestan $69.95 por noche, y las otras cuestan $89.95 por noche.
Cree una clase extendida llmada Suite cuyo constructor requiere número de habitación y agrega un recargo
de $30 a la tarifa de la habitacion regular del hotel, que nuevamente se basa en el numero de habitacion
Escriba una aplicacion llamada Prinabitacion que crea un objeto de cada clasey demuestre que todos
los métodos funcionan correctamente Guarde los archivos como Habitacion.java, Suite.java, PrintHabitacion.java
 */


public class Habitacion {

    protected int numHabitacion;
    protected double tarifa = 0;

    public Habitacion(int numHabitacion){
        this.numHabitacion = numHabitacion;
        if (numHabitacion > 299){
            this.tarifa = 69.95;
            this.tarifa = tarifa;
        }else{
            this.tarifa = 89.95;
            this.tarifa = tarifa;
        }
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public double getTarifa() {
        return tarifa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Habitacion{");
        sb.append("numHabitacion=").append(numHabitacion);
        sb.append(", tarifa=").append(tarifa);
        sb.append('}');
        return sb.toString();
    }
}
