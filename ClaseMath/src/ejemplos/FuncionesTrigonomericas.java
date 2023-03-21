package ejemplos;

public class FuncionesTrigonomericas {
    public static void main(String[] args) {
        double resultado = 0;
        double anguloEnGrados = 45;
        double anguloEnRadianes = Math.toRadians(anguloEnGrados);

        //Calcular Seno
        resultado = Math.sin(anguloEnRadianes);
        System.out.println("Seno de " + anguloEnGrados + "° = " + resultado);

        //Calcular Coseno
        resultado = Math.cos(anguloEnRadianes);
        System.out.println("Coseno de " + anguloEnGrados + "° = " + resultado);

        //Calcular Tangente
        resultado = Math.tan(anguloEnRadianes);
        System.out.println("Tangente de " + anguloEnGrados + "° = " + resultado);


        //Calcular Arco coseno
        double valorIngresado = 0.707;

        anguloEnRadianes = Math.acos(valorIngresado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Arco coseno de: " + valorIngresado + " = " +anguloEnGrados +"°");

        //Calcular Arco seno
        anguloEnRadianes = Math.asin(valorIngresado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Arco seno de: " + valorIngresado + " = " +anguloEnGrados +"°");

        //Calcular Arco Tangente
        anguloEnRadianes = Math.atan(valorIngresado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Arco tangente de: " + valorIngresado + " = " +anguloEnGrados +"°");

    }
}
