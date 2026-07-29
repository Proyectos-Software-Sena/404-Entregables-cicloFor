import javax.swing.*;

public class Ejercicio5 {
    public static void main (String[] args) {

        int  meses = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos meses desea proyectar?"));
        int ahorroMensual = Integer.parseInt(JOptionPane.showInputDialog("¿Cuánto desea ahorrar cada mes?"));
        int ahorroAcumulado = 0;


        for (int i = 1; i <= meses; i++) {

            ahorroAcumulado += ahorroMensual;

            JOptionPane.showMessageDialog(null,
                    "Mes " + i + ": $" + ahorroAcumulado
            );

        }
    }
}
