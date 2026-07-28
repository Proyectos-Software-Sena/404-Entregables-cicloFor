import javax.swing.JOptionPane;
public class Ejercicio1 {
    public static void main(String[] args){
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas ventas se realizaron?"));

        double total = 0;

        for (int i = 1; i <= cantidad; i++) {
            double venta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la venta " + i));
            total += venta;
        }

        JOptionPane.showMessageDialog(null, "El total de ventas del día es: $" + total);
    }
}
