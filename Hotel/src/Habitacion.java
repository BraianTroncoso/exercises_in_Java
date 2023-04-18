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
