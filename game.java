import javax.swing.JOptionPane;

public class game {
    /*
Ejercicio 5: Realizar un juego para adivinar un número,
para ello generar un número aleatorio entre 0-100, y
luego ir pidiendo números indicando "es mayor" o
"es menor" según sea mayor o menor con respecto a N
El proceso termina cuadno el usuario acierta y mostramos
el número de intentos hechos.
 */

    public static void main(String[] args) {
        int cont = 0;
        int num = (int)(Math.random()*100+1); // Esto genera un número aleatorio
        while (cont >= 0) {
            int user = Integer.parseInt(JOptionPane.showInputDialog("Intenta adivinar el número del valor"));

            if (user < num) {
                JOptionPane.showMessageDialog(null, "El número ingresado es menor, intenta otra vez");

            } else if (user > num) {
                JOptionPane.showMessageDialog(null, "El número ingresado es mayor, intenta otra vez");
            }
            else{
                JOptionPane.showMessageDialog(null, "¡Acertaste! ¡Felicitaciones!, el número era: "+num);
                JOptionPane.showMessageDialog(null, "Con un total de intentos de: "+cont);
                break;
            }
            cont++;
        }
    }
}


