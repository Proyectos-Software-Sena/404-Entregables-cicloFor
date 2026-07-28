import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args){
        double ahorromensual;
        int meses;
        double acumulado = 0;

        ahorromensual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ahorro mensual"));

        meses = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos meses desea proyectar?"));

        String resultado = "";

        for (int i = 1; i <= meses; i++) {

            acumulado = acumulado + ahorromensual;

            resultado = resultado + "Mes " + i + ": $" + acumulado + "\n";

        }

        JOptionPane.showMessageDialog(null, resultado);

    }

}
