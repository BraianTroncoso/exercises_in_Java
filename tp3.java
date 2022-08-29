public class tp3 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.nombre = "Braian";
        persona.edad = 26;
        persona.telefono = 2532421;

        System.out.println("Nombre: "+ persona.getNombre());
        System.out.println("Edad: "+ persona.getEdad());
        System.out.println("Telefono: "+ persona.getTelefono());
    }
    static class Persona{
        private int edad;
        private int telefono;
        private String nombre;

        //Utilizamos metodos SET.
        public void setEdad(int edad) {
            this.edad = edad;
        }
        public void setTelefono(int telefono){
            this.telefono = telefono;
        }
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        //Utilizamos metodos GET


        public int getEdad() {
            return edad;
        }

        public int getTelefono() {
            return telefono;
        }

        public String getNombre() {
            return nombre;
        }
    }
}

/*
Enunciado del ejercicio:

Para practicar la encapsulación:

Crear clase Persona.

Crear variables las privadas edad, nombre y telefono de la clase Persona.

Crear gets y sets de cada propiedad.

Crear un objeto persona en el main.

Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
*/