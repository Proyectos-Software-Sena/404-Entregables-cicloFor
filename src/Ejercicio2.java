import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {

        int piezas;
        double peso;
        int aprobadas = 0;
        int defectuosas = 0;

        piezas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas piezas desea revisar?"));

        for (int i = 1; i <= piezas; i++) {

            peso = Double.parseDouble(JOptionPane.showInputDialog("Peso de la pieza " + i));

            if (peso < 100 || peso > 120) {

                defectuosas++;

            } else {

                aprobadas++;

            }

        }

        JOptionPane.showMessageDialog(null,
                "Piezas aprobadas: " + aprobadas +
                        "\nPiezas defectuosas: " + defectuosas);

    }

}