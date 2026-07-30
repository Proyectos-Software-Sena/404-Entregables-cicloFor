import javax.swing.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        //Ingrese su código

        // Pedir la cantidad de términos
        int cantidadTerminos = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese la cantidad de términos de Fibonacci:"
                )
        );

        long anterior = 0;
        long actual = 1;

        String resultado = "";

        for (int i = 1; i <= cantidadTerminos; i++) {

            resultado += anterior;

            if (i < cantidadTerminos) {
                resultado += ", ";
            }

            long siguiente = anterior + actual;

            anterior = actual;
            actual = siguiente;
        }

        JOptionPane.showMessageDialog(
                null,
                "Sucesión de Fibonacci:\n" + resultado
        );


    }
}
