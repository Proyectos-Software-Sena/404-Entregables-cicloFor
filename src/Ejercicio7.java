import javax.swing.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        double tasaCambio;
        double conversion;

        // Solicitar la tasa de cambio
        tasaCambio = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese la tasa de cambio (TRM):")
        );

        // Generar la tabla de conversión
        for (int i = 1; i <= 10; i++) {

            conversion = i * tasaCambio;

            JOptionPane.showMessageDialog(null,
                    i + " USD = " + conversion + " COP");
        }
    }
}