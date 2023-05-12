public class Sasuke extends Ninja implements ITransformarse, ISharingan, IMotivacion {
    public Sasuke(String nombre, String apellido, String personalidad, String edad) {
        super(nombre, apellido, personalidad, edad);
    }

    @Override
    public void transformarse() {
        System.out.println("Orichimaru tomó control de mi");
    }

    @Override
    public void despertarSharingan() {
        System.out.println("Sharingan despertado");
    }

    @Override
    public void aumentoDeChacra() {
        System.out.println("Aumento de chacra por 100");
    }
}
