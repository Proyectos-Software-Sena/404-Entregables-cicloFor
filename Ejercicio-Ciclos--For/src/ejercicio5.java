import javax.swing.JOptionPane;

public class ejercicio5 {

    public static void main(String[] args) {

        // Pedir el monto que se ahorrará cada mes
        double ahorroMensual = Double.parseDouble(
                JOptionPane.showInputDialog(
                        "Ingrese el monto fijo que ahorrará cada mes:"
                )
        );

        // Pedir la cantidad de meses
        int cantidadMeses = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese la cantidad de meses de la proyección:"
                )
        );

        // Variable para almacenar el ahorro acumulado
        double ahorroAcumulado = 0;

        // Variable para almacenar los resultados
        String resultado = "Proyección de ahorros:\n\n";

        // Ciclo for para calcular el ahorro mes a mes
        for (int mes = 1; mes <= cantidadMeses; mes++) {

            // Sumar el ahorro mensual al acumulado
            ahorroAcumulado += ahorroMensual;

            // Mostrar el ahorro acumulado del mes
            resultado += "Mes " + mes + ": $"
                    + ahorroAcumulado + "\n";
        }

        // Mostrar los resultados
        JOptionPane.showMessageDialog(
                null,
                resultado
        );
    }
}