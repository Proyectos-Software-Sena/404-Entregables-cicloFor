import javax.swing.JOptionPane;

public class ejercicio1 {

    public static void main(String[] args) {

        // Pedir la cantidad de ventas realizadas
        int cantidadVentas = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese la cantidad de ventas realizadas:"
                )
        );

        // Variable para almacenar el total
        double totalVentas = 0;

        // Ciclo for para ingresar cada venta
        for (int i = 1; i <= cantidadVentas; i++) {

            double venta = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Ingrese el valor de la venta " + i + ":"
                    )
            );

            // Sumar la venta al total
            totalVentas += venta;
        }

        // Mostrar el resultado final
        JOptionPane.showMessageDialog(
                null,
                "El total de ventas del día es: $" + totalVentas
        );
    }
}