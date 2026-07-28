import javax.swing.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        int bacterias = 0;
        int horas = 0;
        String resultado = "";

        bacterias = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de bacterias"));
        horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de horas"));

        for (int i = 1; i <= horas; i++) {

            bacterias = bacterias * 2;
            resultado += "Hora " + i + ": " + bacterias + " bacterias" + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
