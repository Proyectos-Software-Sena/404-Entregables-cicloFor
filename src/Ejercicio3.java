import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {

        int lecturas;
        double temperatura;
        double mayor = 0;

        lecturas = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de lecturas"));

        for (int i = 1; i <= lecturas; i++) {

            temperatura = Double.parseDouble(JOptionPane.showInputDialog("Temperatura " + i));

            if (i == 1 || temperatura > mayor) {

                mayor = temperatura;

            }

        }

        JOptionPane.showMessageDialog(null,
                "La temperatura máxima registrada fue: " + mayor + " °C");

    }

}