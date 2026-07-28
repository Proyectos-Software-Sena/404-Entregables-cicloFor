import javax.swing.*;

public class Ejercicio7 {
    public static void main(String[] args) {

        double tasa;
        String tabla = "";

        tasa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la TRM del día"));

        for (int i = 1; i <= 10; i++) {

            tabla = tabla + i + " USD = " + (i * tasa) + " COP\n";

        }

        JOptionPane.showMessageDialog(null, tabla);

    }
}
