import javax.swing.JOptionPane;
public class Ejercicio2 {
    public static void main(String[] args) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas piezas se revisarán?"));

        int aprobadas = 0;
        int defectuosas = 0;

        for (int i = 1; i <= cantidad; i++) {

            double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso de la pieza " + i));

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
