import javax.swing.*;

public class Ejercicio7 {
    public static void main(String[] args) {

        int trm;
        int pesos;

        trm = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese la TRM del día"
                )
        );

        for (int i = 1; i <= 10; i++) {

            pesos = i * trm;

            JOptionPane.showMessageDialog(
                    null,
                    i + " USD = " + pesos + " COP"
            );

        }
    }
}
