import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Ingrese su código

        int cantidadPiezas = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese la cantidad de piezas a revisar:"
                )
        );

        int piezasAprobadas = 0;
        int piezasDefectuosas = 0;

        // Ciclo for para revisar cada pieza
        for (int i = 1; i <= cantidadPiezas; i++) {

            double peso = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Ingrese el peso de la pieza " + i + " en gramos:"
                    )
            );

            if (peso >= 100 && peso <= 120) {
                piezasAprobadas++;
            } else {
                piezasDefectuosas++;
            }
        }

        JOptionPane.showMessageDialog(
                null,
                "Piezas aprobadas: " + piezasAprobadas
                        + "\nPiezas defectuosas: " + piezasDefectuosas
        );

    }
}
