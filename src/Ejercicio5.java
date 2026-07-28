import javax.swing.*;

public class Ejercicio5 {
    public static void main (String[] args) {
        //Ingrese su código

        int meses;
        double AMensual;
        double ahorroAcumulado = 0;

        AMensual = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el monto que ahorrará cada mes:")
        );

        meses = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese la cantidad de meses:")
        );

        for (int i = 1; i <= meses; i++) {

            ahorroAcumulado = ahorroAcumulado + AMensual;

            JOptionPane.showMessageDialog(null,
                    "Mes " + i + ": $" + ahorroAcumulado);
        }

    }
}
