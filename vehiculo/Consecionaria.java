package vehiculo;

import java.util.ArrayList;

public class Consecionaria{
    ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
    public void agregarVehiculo(Vehiculo marca){
        listaVehiculos.add(marca);
    }

    public ArrayList<Vehiculo> buscarVehiculoPorMarca(String marca){
        ArrayList<Vehiculo> vehiculosEncontrados = new ArrayList<Vehiculo>();
        for (Vehiculo v : listaVehiculos) {
            if (v.getMarca().equals(marca)) {
                vehiculosEncontrados.add(v);
            }
        }
        return vehiculosEncontrados;
    }
}
