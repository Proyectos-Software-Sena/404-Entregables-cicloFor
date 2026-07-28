import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numeroventas = 0;
        double ventas = 0;
        double ventatotal = 0;

        numeroventas  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ventas realizadas"));

        for (int i = 1; i <= numeroventas; i++) {

            ventas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la venta numero " +i));
            ventatotal += ventas;

        }
        JOptionPane.showMessageDialog(null, "El valor de sus ganancias fueron de " + ventatotal);
    }
}

