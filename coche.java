    public class coche {

        public String modelo;
        public int ruedas;
        public int cristales;
        public int puertas;
        public int cantidad;

        public String getModelo(){
            return this.modelo;
        }
        public int getRuedas() {
            return this.ruedas;
        }
        public int getCristales(){
            return this.cristales;
        }
        public int getPuertas(){
            return this.puertas;
        }
        public int getCantidad(){
            return this.cantidad;
        }

        public void setModelo(String m){
            this.modelo = m;
        }
        public void setRuedas(Integer r){
            this.ruedas=r;
        }
        public void setPuertas (int p){
            this.puertas = p;
        }

        public void setCantidad(int ca) {
            this.cantidad = ca;
        }

        public void setCristales(int c) {
            this.cristales = c;
        }
/*Funcion para quitar una puerta*/
        public void quitarPuertas(){
            this.puertas--;
        }

        public void mostrarInfo(){
            System.out.println("Nuestro coche es: "+getModelo());
            System.out.println("Tiene un total de ruedas de: "+getRuedas());
            System.out.println("Tambien cuenta con un total de cristales de: "+getCristales());
            System.out.println("Y puertas tiene un total de: "+getPuertas());
            System.out.println("En stock disponible solo contamos con: "+getCantidad());
        }

}
