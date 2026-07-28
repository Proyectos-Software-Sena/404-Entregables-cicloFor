import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args){
        double ahorromensual;
        int cantidaddemeses;
        double acumulado = 0;
        ahorromensual = Double.parseDouble(JOptionPane.showInputDialog("ingrese el ahorro mensual:")
        );
        cantidaddemeses = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de meses:")
        );
        //proceso
        for(int i = 1; i <=cantidaddemeses; i++) {
            acumulado += ahorromensual;
            //fin
            JOptionPane.showMessageDialog(null, "Mes" + i + ": $" + acumulado);
        }
    }
}
