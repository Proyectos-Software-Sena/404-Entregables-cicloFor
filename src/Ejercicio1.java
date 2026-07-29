import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {

        int cantidadVentas= Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas ventas se realizaron hoy?"));
        int total = 0;


        for (int i = 1;i <= cantidadVentas; i++) {
            int valorVenta = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingrese el valor de la venta " + i));

            total += valorVenta;

        }
        JOptionPane.showMessageDialog(null, "El total de ventas del día es: $" + total);
    }
}
