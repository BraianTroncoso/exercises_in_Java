public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private static int cantidadDePersonas = 0;


    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        Persona.cantidadDePersonas++;
    }

    public static int getCantidadDePersonas(){
        return Persona.cantidadDePersonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad + '\'' +
                ", CantidadPersonas=" + Persona.getCantidadDePersonas() +
                '}';
    }
}
