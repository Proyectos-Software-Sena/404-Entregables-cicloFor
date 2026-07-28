import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {

        int cantidadVentas;
        double venta;
        double total = 0;

        cantidadVentas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas ventas se realizaron?"));

        for (int i = 1; i <= cantidadVentas; i++) {

            venta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la venta " + i));

            total += venta;
        }

        JOptionPane.showMessageDialog(null, "Total vendido: $" + total);

    }

}