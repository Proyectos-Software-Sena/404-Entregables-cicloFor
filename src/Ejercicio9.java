import javax.swing.*;

public class Ejercicio9 {
    public static void main (String[] args) {
        //Ingrese su código


        int bacterias;
        int horas;

        bacterias = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese la cantidad inicial de bacterias:")
        );

        horas = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese la cantidad de horas de proyección:")
        );

        for (int i = 1; i <= horas; i++) {

            bacterias = bacterias * 2;

            JOptionPane.showMessageDialog(null,
                    "Hora " + i + ": " + bacterias + " bacterias");
        }


    }
}
