import javax.swing.JOptionPane;

public class Ejercicio5 {

    public static void main(String[] args) {

        double ahorro;
        int meses;
        double acumulado = 0;

        ahorro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ahorro mensual"));

        meses = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos meses desea proyectar?"));

        String resultado = "";

        for (int i = 1; i <= meses; i++) {

            acumulado = acumulado + ahorro;

            resultado = resultado + "Mes " + i + ": $" + acumulado + "\n";

        }

        JOptionPane.showMessageDialog(null, resultado);

    }

}