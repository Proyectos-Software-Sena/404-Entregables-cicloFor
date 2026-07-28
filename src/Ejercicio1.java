import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Ingrese su código

        int cantidadVentas;
        double venta;
        double totalVentas = 0;

        cantidadVentas = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese la cantidad de ventas realizadas:")
        );

        for (int i = 1; i <= cantidadVentas; i++) {

            venta = Double.parseDouble(
                    JOptionPane.showInputDialog("Ingrese el valor de la venta #" + i + ":")
            );

            totalVentas = totalVentas + venta;
        }


        JOptionPane.showMessageDialog(null,
                "El total de ventas del día es: $" + totalVentas);
    }
}
