import javax.swing.JOptionPane;
public class Ejercicio5 {
    public static void main (String[] args) {
        double ahorro = Double.parseDouble(JOptionPane.showInputDialog("Monto a ahorrar cada mes"));


        int meses = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de meses"));

        double acumulado = 0;
        String resultado = "";

        for (int i = 1; i <= meses; i++) {

            acumulado += ahorro;

            resultado += "Mes " + i + ": $" + acumulado + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
