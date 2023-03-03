import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<Persona>();

        lista.add(new Persona(1,"Luisina", 30));
        lista.add(new Persona(2,"Braian",27));
        lista.add(new Persona(3,"Paula",22));
        lista.add(new Persona(4,"Lautaro",19));

        //recorrer por índice
        System.out.println("-----------------------FOR--------------------------");
        for(int i = 0; i < lista.size(); i++){
            System.out.println("Prueba: " + lista.get(i).getNombre());
        }
        System.out.println("---------------------FOREACH------------------------");
        for (Persona perso:lista) {
            System.out.println("Prueba: " + perso.getNombre());
        }
    }
}
