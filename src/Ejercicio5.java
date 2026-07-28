import javax.swing.*;

public class Ejercicio5 {
    public static void main (String[] args) {

            int ahorro;
            int meses;
            int acumulado = 0;
            String mensaje = "";

            ahorro = Integer.parseInt(JOptionPane.showInputDialog("¿Cuánto ahorrará cada mes?"));

            meses = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos meses desea proyectar?"));

            for (int i = 1; i <= meses; i++) {

                acumulado += ahorro;

                mensaje += "Mes " + i + ": $" + acumulado + "\n";

            }

            JOptionPane.showMessageDialog(null, mensaje);

        }

    }