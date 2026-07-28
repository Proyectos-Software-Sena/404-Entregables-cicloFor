import javax.swing.JOptionPane;
public class Ejercicio7 {
    public static void main(String[] args) {

        double tasa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la TRM"));

        String tabla = "";

        for (int i = 1; i <= 10; i++) {

            tabla += i + " USD = " + (i * tasa) + " COP\n";
        }

        JOptionPane.showMessageDialog(null, tabla);
    }
}
