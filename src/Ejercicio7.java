import javax.swing.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        //Ingrese su código

        double tasaCambio;
        double conversion;

        tasaCambio = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese la tasa de cambio (TRM):")
        );

        for (int i = 1; i <= 10; i++) {

            conversion = i * tasaCambio;

            JOptionPane.showMessageDialog(null,
                    i + " USD = " + conversion + " COP");
        }
    }

    }

