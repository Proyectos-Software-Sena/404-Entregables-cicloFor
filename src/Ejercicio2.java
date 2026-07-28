import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main(String[] args) {

        int cantidad;
        double peso;
        int aprobadas = 0;
        int defectuosas = 0;

        cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas piezas va a revisar?"));

        for (int i = 1; i <= cantidad; i++) {

            peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la pieza " + i));

            if (peso >= 100 && peso <= 120) {
                aprobadas++;
            } else {
                defectuosas++;
            }

        }

        JOptionPane.showMessageDialog(null,
                "Piezas aprobadas: " + aprobadas +
                        "\nPiezas defectuosas: " + defectuosas);

    }

}