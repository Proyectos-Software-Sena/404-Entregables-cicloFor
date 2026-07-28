import javax.swing.*;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        double tasacambio = 0;
        String tabla = "";

        tasacambio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la TRM del dia de hoy"));

        for (int i = 1; i <= 10; i++) {

            tabla += i + "USD = " + (i * tasacambio) + "COP ";
        }
        JOptionPane.showMessageDialog(null, tabla);
    }
}
