import javax.swing.*;

public class Ejercicio9 {
    public static void main(String[] args) {

        int bacteria;
        int hora;

        bacteria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad inicial de bacterias"));

        hora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas"));

        String resultado = "";

        for (int i = 1; i <= hora; i++) {

            bacteria = bacteria * 2;

            resultado = resultado + "Hora " + i + ": " + bacteria + " bacterias\n";

        }

        JOptionPane.showMessageDialog(null, resultado);

    }
}