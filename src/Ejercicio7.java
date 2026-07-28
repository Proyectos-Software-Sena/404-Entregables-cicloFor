import javax.swing.*;

public class Ejercicio7 {
    public static void main(String[] args) {

        public static void main(String[] args) {

            double trm;
            String tabla = "";

            trm = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la TRM del día"));

            for (int i = 1; i <= 10; i++) {

                tabla += i + " USD = " + (i * trm) + " COP\n";

            }

            JOptionPane.showMessageDialog(null, tabla);

        }

    }