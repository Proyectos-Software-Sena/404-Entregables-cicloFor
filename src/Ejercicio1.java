import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Ingrese su código

int Cventas;

        double Vventa, total = 0;


Cventas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas ventas se realizaron en el día?"));

        for (int i = 1; i <= Cventas; i = i + 1) {

Vventa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de cada venta"));

total += Vventa;
        }

                JOptionPane.showMessageDialog(null, "El total de las ventas del día es de: " + total);

    }
            }
