import javax.swing.*;

public class Ejercicio9 {
    public static void main (String[] args) {

        int bacterias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad inicial de bacterias"));
        int horas;
        int totalBacterias;


        horas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas horas desea proyectar?"));

        totalBacterias = bacterias;

        for (int i = 1; i <= horas; i++) {

            totalBacterias *= 2;

            JOptionPane.showMessageDialog(null, "Hora " + i + ": " + totalBacterias + " bacterias");

        }
    }
}
