public class main {
    public static void main(String[] args) {
/*Llamamos a nuestra funcion y le pasamos sus 3 valores.*/
        suma(10,10,10);
    }
    /*Funcion para sumar 3 valores entre si*/
    public static void suma(int a, int b,int c){
        System.out.println(a+b+c);
        System.out.println("*********************************************");

        /*Creamos nuestro objeto coche y sus instancias*/

        coche m1 = new coche();
        m1.setModelo("Hibrido Lunar");
        m1.setRuedas(12);
        m1.setCristales(3);
        m1.setPuertas(2);
        m1.setCantidad(1);
        m1.quitarPuertas();
        m1.mostrarInfo();
        System.out.println("*********************************************");
        coche m2 = new coche();
        m2.setModelo("Descendiente de Marte");
        m2.setRuedas(8);
        m2.setCristales(1);
        m2.setPuertas(6);
        m2.setCantidad(7);
        m2.quitarPuertas();
        m2.mostrarInfo();
    }


 }

