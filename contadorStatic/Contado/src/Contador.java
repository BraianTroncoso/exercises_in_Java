public class Contador {
    private int valor;
    private static int contadorDeInstancias = 0;


    public Contador(){
        this.valor = 0;
        Contador.contadorDeInstancias++;
    }

    public int aumentar(){
        return this.valor++;
    }

    public int decrementar(){
        return this.valor--;
    }

    public int retornarValor(){
        return this.valor;
    }

    public static int getContadorDeInstacias(){
        return Contador.contadorDeInstancias;
    }

    @Override
    public String toString() {
        return "Contador{" +
                "valor=" + valor +
                "ContadorDeInstancias=" + contadorDeInstancias +
                '}';
    }
}
