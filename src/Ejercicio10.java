import javax.swing.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        //Ingrese su código

        int cantidadTerminos;
        int primero = 0;
        int segundo = 1;
        int siguiente;

        String serie = "";

        cantidadTerminos = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese la cantidad de términos de la serie de Fibonacci:")
        );

        for (int i = 1; i <= cantidadTerminos; i++) {

            if (i == 1) {

                serie = serie + primero + " ";

            } else if (i == 2) {

                serie = serie + segundo + " ";

            } else {

                siguiente = primero + segundo;
                serie = serie + siguiente + " ";

                primero = segundo;
                segundo = siguiente;
            }
        }
        JOptionPane.showMessageDialog(null,
                "Serie de Fibonacci:\n" + serie);


    }
}
