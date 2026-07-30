import javax.swing.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        //Ingrese su código

        double tasaCambio = Double.parseDouble(
                JOptionPane.showInputDialog(
                        "Ingrese la tasa de cambio USD a COP:"
                )
        );

        String resultado = "Tabla de conversión:\n\n";

        for (int dolar = 1; dolar <= 10; dolar++) {

            double pesos = dolar * tasaCambio;

            resultado += dolar + " USD = " + pesos + " COP\n";
        }

        JOptionPane.showMessageDialog(
                null,
                resultado
        );
    }
}
