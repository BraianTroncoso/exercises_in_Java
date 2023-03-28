package vehiculo;

public class Principal {
    public static void main(String[] args) {
        Vehiculo tesla = new Vehiculo();
        tesla.setModelo("2007");
        tesla.setMarca("Tesla");
        tesla.setAnioFabricacion(2006);

        System.out.println("El auto es: " +tesla.getMarca() +" y el modelo es: "+ tesla.getModelo() + ", fabricado en el año: " + tesla.getAnioFabricacion());

        Vehiculo gol = new Vehiculo();
      

    }
}
