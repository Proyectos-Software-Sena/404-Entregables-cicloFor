import javax.swing.*;

public class Ejercicio10 {
    public static void main(String[] args) {

        int cantidad;
        int primero = 0;
        int segundo = 1;
        int siguiente;
        String serie = "";

        cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números de Fibonacci desea mostrar?"));

        for (int i = 1; i <= cantidad; i++) {

            serie = serie + primero + " ";

            siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;

        }

        JOptionPane.showMessageDialog(null, "Serie de Fibonacci:\n" + serie);

    }
}
