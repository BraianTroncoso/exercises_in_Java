public class Ninja implements IJutsu{
    private String nombre;
   private String apellido;
    private  String personalidad;
    private  String edad;

    public Ninja(String nombre, String apellido, String personalidad, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.personalidad = personalidad;
        this.edad = edad;
    }

    @Override
    public void lanzar() {
        System.out.println("Lanzando Jutsu");
    }

    @Override
    public void cancelar() {
        System.out.println("Cancelando Jutsu");
    }

    @Override
    public void verificarEfecto() {
        System.out.println("Verificando Efecto");
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ninja{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", personalidad='").append(personalidad).append('\'');
        sb.append(", edad='").append(edad).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
