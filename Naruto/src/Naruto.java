public class Naruto extends Ninja implements ITransformarse, IModoSabio,IMotivacion{

    public Naruto(String nombre, String apellido, String personalidad, String edad) {
        super(nombre, apellido, personalidad, edad);
    }

    @Override
    public void transformarse() {
        System.out.println("Soy el zorro de nueve colas");
    }

    @Override
    public void modoSabioActivado() {
        System.out.println("Modo sabio activado!");
    }

    @Override
    public void aumentoDeChacra() {
        System.out.println("Aumento de chacra por mil");
    }
}
