import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Ingrese su código

        int cantidadVentas = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese la cantidad de ventas realizadas:"
                )
        );

        double totalVentas = 0;

        for (int i = 1; i <= cantidadVentas; i++) {

            double venta = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Ingrese el valor de la venta " + i + ":"
                    )
            );

            totalVentas += venta;
        }

        JOptionPane.showMessageDialog(
                null,
                "El total de ventas del día es: $" + totalVentas
        );


    }
}
