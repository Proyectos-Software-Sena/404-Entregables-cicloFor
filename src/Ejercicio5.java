import javax.swing.*;

public class Ejercicio5 {
    public  static void main(String[] args) {
        double ahorromensual;
        double ahorrototal = 0;
        int meses;

        ahorromensual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad por ahorrar cada mes"));

        meses = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de meses que ahorrara"));

        String resultado = "";

        for (int i = 1; i <= meses; i++) {

            ahorrototal += ahorromensual;
            resultado += " mes " +i + " $" +ahorrototal;
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}