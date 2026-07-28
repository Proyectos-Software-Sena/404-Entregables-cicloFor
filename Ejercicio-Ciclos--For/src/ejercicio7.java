import javax.swing.JOptionPane;

public class ejercicio7 {

    public static void main(String[] args) {

        // Pedir la tasa de cambio
        double tasaCambio = Double.parseDouble(
                JOptionPane.showInputDialog(
                        "Ingrese la tasa de cambio USD a COP:"
                )
        );

        // Variable para almacenar la tabla
        String resultado = "Tabla de conversión:\n\n";

        // Generar la tabla del 1 al 10 USD
        for (int dolar = 1; dolar <= 10; dolar++) {

            double pesos = dolar * tasaCambio;

            resultado += dolar + " USD = " + pesos + " COP\n";
        }

        // Mostrar la tabla
        JOptionPane.showMessageDialog(
                null,
                resultado
        );
    }
}