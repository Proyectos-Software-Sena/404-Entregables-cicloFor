import javax.swing.JOptionPane;

public class ejercicio2 {

    public static void main(String[] args) {

        // Pedir la cantidad de piezas que se van a revisar
        int cantidadPiezas = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese la cantidad de piezas a revisar:"
                )
        );

        // Contadores de piezas aprobadas y defectuosas
        int piezasAprobadas = 0;
        int piezasDefectuosas = 0;

        // Ciclo for para revisar cada pieza
        for (int i = 1; i <= cantidadPiezas; i++) {

            // Pedir el peso de la pieza
            double peso = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Ingrese el peso de la pieza " + i + " en gramos:"
                    )
            );

            // Verificar si la pieza cumple con el peso reglamentario
            if (peso >= 100 && peso <= 120) {
                piezasAprobadas++;
            } else {
                piezasDefectuosas++;
            }
        }

        // Mostrar los resultados
        JOptionPane.showMessageDialog(
                null,
                "Piezas aprobadas: " + piezasAprobadas
                        + "\nPiezas defectuosas: " + piezasDefectuosas
        );
    }
}