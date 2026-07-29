import javax.swing.*;

public class Ejercicio10 {
    public static void main(String[] args) {


        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos términos desea generar?"));
        int primero = 0;
        int segundo = 1;
        int siguiente;

        String serie = "";


        for (int i = 1; i <= cantidad; i++) {

            serie += primero + " ";

            siguiente = primero + segundo;

            primero = segundo;

            segundo = siguiente;

        }

        JOptionPane.showMessageDialog(null, serie);
    }
}
