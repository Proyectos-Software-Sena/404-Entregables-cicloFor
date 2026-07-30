import javax.swing.*;

public class Ejercicio5 {
    public static void main (String[] args) {
        //Ingrese su código

        double ahorroMensual = Double.parseDouble(
                JOptionPane.showInputDialog(
                        "Ingrese el monto fijo que ahorrará cada mes:"
                )
        );

        int cantidadMeses = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese la cantidad de meses de la proyección:"
                )
        );

        double ahorroAcumulado = 0;

        String resultado = "Proyección de ahorros:\n\n";

        for (int mes = 1; mes <= cantidadMeses; mes++) {

            ahorroAcumulado += ahorroMensual;

            resultado += "Mes " + mes + ": $"
                    + ahorroAcumulado + "\n";
        }

        JOptionPane.showMessageDialog(
                null,
                resultado
        );

    }
}
