import javax.swing.JOptionPane;
public class Ejercicio5 {
    public static void main(String[] args) {
        //Ingrese su código
        double ahorromensual;
        int cantidadmeses;
        double acumulado = 0;
        ahorromensual = Double.parseDouble(JOptionPane.showInputDialog("ingrese el ahorro mensual:"));
        cantidadmeses = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de meses:"));
        //proceso
        for (int i = 1; i <= cantidadmeses; i++) {
            acumulado += ahorromensual;
            //salida
            JOptionPane.showMessageDialog(null, "Mes" + i + ": $" + acumulado);
        }
    }
}
