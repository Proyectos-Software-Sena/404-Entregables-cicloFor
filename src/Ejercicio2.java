import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {

        int cantidadPiezas;
        int aprobadas = 0;
        int defectuosas = 0;
        double peso;

        cantidadPiezas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas piezas se van a revisar?"));

        for (int i = 1; i <= cantidadPiezas; i++) {

            peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la pieza " + i + " (g):")
            );

            if (peso < 100 || peso > 120) {

                defectuosas++;

            } else {

                aprobadas++;
            }
        }

        JOptionPane.showMessageDialog(null,"Piezas aprobadas: " + aprobadas + "\nPiezas defectuosas: " + defectuosas);
    }
}