import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        int ventas;
        int valor;
        int total = 0;

        ventas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas ventas se realizaron?"));

        for (int i = 1; i <= ventas; i++) {

            valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la venta " + i));

            total += valor;

        }

        JOptionPane.showMessageDialog(null,
                "El total de ventas del día es: $" + total);

    }

}