import javax.swing.*;

public class ejercicio_5 {

    public static void main(String[] args) {

        int meses;
        double ahorroMensual;
        double ahorroAcumulado = 0;

        // Solicitar el monto de ahorro mensual
        ahorroMensual = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el monto que ahorrará cada mes:")
        );

        // Solicitar la cantidad de meses
        meses = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese la cantidad de meses:")
        );

        // Mostrar el ahorro acumulado mes a mes
        for (int i = 1; i <= meses; i++) {

            ahorroAcumulado = ahorroAcumulado + ahorroMensual;

            JOptionPane.showMessageDialog(null,
                    "Mes " + i + ": $" + ahorroAcumulado);
        }
    }
}
    }
}
