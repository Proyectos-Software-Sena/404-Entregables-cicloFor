import javax.swing.*;

public class Ejercicio9 {
    public static void main (String[] args) {
        //Ingrese su código

        long bacterias = Long.parseLong(
                JOptionPane.showInputDialog(
                        "Ingrese la cantidad inicial de bacterias:"
                )
        );

        int horas = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese la cantidad de horas de proyección:"
                )
        );

        String resultado = "Crecimiento bacteriano:\n\n";

        for (int hora = 1; hora <= horas; hora++) {

            bacterias = bacterias * 2;

            resultado += "Hora " + hora + ": "
                    + bacterias + " bacterias\n";
        }

        JOptionPane.showMessageDialog(
                null,
                resultado
        );


    }
}
