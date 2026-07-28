import javax.swing.JOptionPane;

public class Ejercicio9 {

    public static void main(String[] args) {

        int bacterias;
        int horas;

        bacterias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad inicial de bacterias"));

        horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas"));

        String resultado = "";

        for (int i = 1; i <= horas; i++) {

            bacterias = bacterias * 2;

            resultado = resultado + "Hora " + i + ": " + bacterias + " bacterias\n";

        }

        JOptionPane.showMessageDialog(null, resultado);

    }

}