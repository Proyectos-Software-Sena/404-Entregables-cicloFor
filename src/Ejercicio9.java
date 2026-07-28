import javax.swing.*;

public class Ejercicio9 {
    public static void main (String[] args) {
        //Ingrese su código

        int bacterias;
        int horas;

        // Solicitar la cantidad inicial de bacterias
        bacterias = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese la cantidad inicial de bacterias:")
        );

        // Solicitar la cantidad de horas
        horas = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese la cantidad de horas de proyección:")
        );

        // Mostrar el crecimiento de las bacterias
        for (int i = 1; i <= horas; i++) {

            bacterias = bacterias * 2;

            JOptionPane.showMessageDialog(null,
                    "Hora " + i + ": " + bacterias + " bacterias");
        }
    }
}