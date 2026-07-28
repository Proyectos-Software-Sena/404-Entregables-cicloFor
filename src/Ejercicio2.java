import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numeropiezas = 0;
        int defecto = 0;
        int buneas = 0;
        double pesogramos =0;

        numeropiezas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nunmero de piezas a revisar"));

        for (int i = 1; i <= numeropiezas; i++) {
            pesogramos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la pieza " +i));

            if (pesogramos >= 100 && pesogramos <= 121) {
                buneas++;
            } else {
                defecto++;
            }
        }
        JOptionPane.showMessageDialog(null, "Piezas aprobadas " +buneas + "\n" + "Piezas defectuosas " +defecto);
    }
}
