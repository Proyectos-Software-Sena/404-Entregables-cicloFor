import javax.swing.JOptionPane;
public class Ejercicio3 {
    public static void main(String[] args) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas temperaturas ingresará?"));

        double mayor = Double.MIN_VALUE;

        for (int i = 1; i <= cantidad; i++) {

            double temperatura = Double.parseDouble(JOptionPane.showInputDialog("Temperatura " + i));

            if (temperatura > mayor) {
                mayor = temperatura;
            }
        }

        JOptionPane.showMessageDialog(null,
                "La temperatura máxima registrada fue: " + mayor + " °C");
    }
}
