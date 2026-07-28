import javax.swing.JOptionPane;

public class ejercicio9 {

    public static void main(String[] args) {

        // Pedir la cantidad inicial de bacterias
        long bacterias = Long.parseLong(
                JOptionPane.showInputDialog(
                        "Ingrese la cantidad inicial de bacterias:"
                )
        );

        // Pedir la cantidad de horas
        int horas = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese la cantidad de horas de proyección:"
                )
        );

        // Variable para almacenar el resultado
        String resultado = "Crecimiento bacteriano:\n\n";

        // Ciclo para calcular el crecimiento por cada hora
        for (int hora = 1; hora <= horas; hora++) {

            // Las bacterias se duplican cada hora
            bacterias = bacterias * 2;

            resultado += "Hora " + hora + ": "
                    + bacterias + " bacterias\n";
        }

        // Mostrar el resultado
        JOptionPane.showMessageDialog(
                null,
                resultado
        );
    }
}