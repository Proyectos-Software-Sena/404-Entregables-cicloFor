import javax.swing.JOptionPane;
public class Ejercicio9 {
    public static void main (String[] args) {

        int bacterias = Integer.parseInt(JOptionPane.showInputDialog("Cantidad inicial de bacterias"));

        int horas = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de horas"));

        String resultado = "";

        for (int i = 1; i <= horas; i++) {

            bacterias *= 2;

            resultado += "Hora " + i + ": " + bacterias + " bacterias\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
